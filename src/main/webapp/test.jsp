<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>数据分析</title>
    <link rel="shortcut icon" href="${webRoot}/images/malaria.ico"/>
    <link href="${webRoot}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${webRoot}/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${webRoot}/css/animate.css" rel="stylesheet">
    <link href="${webRoot}/css/style.css?v=4.1.0" rel="stylesheet">
    <style>
        .floatBox {
            width: 7%;
            height: auto;
            border-radius: 5px;
            box-shadow: 2px 2px 3px #2a2e36;
            position: fixed;
            float: right;
            top: 20%;
            right: 20px;
            z-index: 900;
        }
    </style>
</head>
<body>
<!--数据来源部分-->
<div id="fixDiv" class="floatBox">
    <label>
        <h4 style="font-weight: 300">&nbsp;&nbsp;数据来源:</h4>
        <select id="dataSource" class="form-control">
            <option value="中国" selected>中国</option>
        </select>
    </label>
</div>
<!--标签页部分-->
<div class="wrapper wrapper-content animated fadeIn">
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-10">
            <div class="tabs-container">
                <ul class="nav nav-tabs" role="tablist" id="myTab">
                    <li id="d1" class="col-sm-6 active">
                        <a data-toggle="tab" href="#tab-1" aria-expanded="true">
                            <h2 align="center"><strong>间日疟</strong></h2>
                        </a>
                    </li>
                    <li id="d2" class="col-sm-6">
                        <a data-toggle="tab" href="#tab-2" aria-expanded="false">
                            <h2 align="center"><strong>恶性疟</strong></h2>
                        </a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div id="tab-1" class="tab-pane fade in active" role="tabpanel">
                        <div class="panel-body">
                            <div class="row">
                                <div id="sexChartTab1" style="height:400px"></div>
                            </div>
                            <!--<div class="row">-->
                            <!--<div id="main3" style="height:400px"></div>-->
                            <!--</div>-->
                            <!--<div class="row">-->
                            <!--<div id="main4" style="height:400px"></div>-->
                            <!--</div>-->
                        </div>
                    </div>
                    <div id="tab-2" class="tab-pane fade active" role="tabpanel">
                        <div class="panel-body">
                            <div class="row">
                                <div id="sexChartTab2" style="height:400px;"></div>
                            </div>
                            <!--<div class="row">-->
                            <!--<div id="main5" style="height:400px"></div>-->
                            <!--</div>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 全局js -->
<script src="${webRoot}/js/jquery.min.js?v=2.1.4"></script>
<script src="${webRoot}/js/bootstrap.min.js?v=3.3.6"></script>
<script src="${webRoot}/js/build/dist/echarts.js"></script>

<script type="text/javascript">
    $(function () {
        $.ajax({
            type: "get",
            url: "/district/getProvinces.do",
            dataType: "json",
            success: function (data) {
                $.each(data.data, function (i, item) {
                    var $option = '<option code=' + item.id + ' value=' + item.name + '>' + item.name + '</option>';
                    $("#dataSource").append($option);
                });
            }
        });
        $.ajax({
            type: "post",
            //默认开始展示全部数据
            url: "/AnalyzeByCharts/sexChart",
            data:{
                dataSource:'中国'
            },
            dataType: "json",
            success: function (data) {
                sexChartInitFunction(data);
            }
        });
    });
    $('#dataSource').on('change', function () {
        var dataSourceNow = $('#dataSource').val();
        console.log(dataSourceNow);
        $.ajax({
            type: "post",
            //默认开始展示全部数据
            url: "/AnalyzeByCharts/sexChart",
            data:{
                dataSource:dataSourceNow
            },
            dataType: "json",
            success: function (data) {
                console.log(data);
                sexChartInitFunction(data);
            },
            error:function (data) {
                console.error(data);
                sexChartInitFunction(data);
            }
        });
    });
    //性别比例Chart构建
    function sexChartInitFunction(data) {
        // 路径配置
        require.config({
            paths: {
                echarts: '${webRoot}/js/build/dist'
            }
        });
        // 使用
        require(
                [
                    'echarts',
                    'echarts/chart/pie', // 饼图加载
                    'echarts/chart/funnel'//漏斗图加载
                ],
                function (ec) {
                    // 基于准备好的dom，初始化echarts图表
                    var sexChartTab1Init = ec.init(document.getElementById('sexChartTab1'));
                    var sexChartTab2Init = ec.init(document.getElementById('sexChartTab2'));
                    var sexTitleInfo = [
                        '性别比例',
                        '患病人群性别比例人数'
                    ];

                    var chartsOptions = [];
                    for (var count = 0; count < data.length; count++) {
                        var years = data[count].yearList;
                        var names = data[count].sexList;
                        var values = data[count].valuesList;
                        var funnelMaxValue = 0;
                        for (var index = 0; index < values.length; index++) {
                            funnelMaxValue += values[index];
                        }
                        var sexTab1Option = {
                            timeline: {
                                data: years,
                                label: {
                                    formatter: function (s) {
                                        return s.slice(0, 20);
                                    }
                                },
                                realtime: true,
                                playInterval: 800,
                                type: 'number'
                            },
                            options: [
                                {
                                    title: {
                                        text: sexTitleInfo[0],
                                        subtext: sexTitleInfo[1]
                                    },
                                    tooltip: {
                                        trigger: 'item',
                                        formatter: "{a} <br/>{b} : {c} ({d}%)"
                                    },
                                    legend: {
                                        data: names
                                    },
                                    toolbox: {
                                        show: true,
                                        feature: {
                                            mark: {show: true},
                                            dataView: {show: true, readOnly: false},
                                            magicType: {
                                                show: true,
                                                type: ['pie', 'funnel'],
                                                option: {
                                                    funnel: {
                                                        x: '25%',
                                                        width: '50%',
                                                        funnelAlign: 'center',
                                                        max: funnelMaxValue
                                                    }
                                                }
                                            },
                                            restore: {show: true},
                                            saveAsImage: {show: true}
                                        }
                                    },
                                    series: [
                                        {
                                            name: years[0],
                                            type: 'pie',
                                            center: ['50%', '45%'],
                                            radius: '50%',
                                            selectedMode: 'single',
                                            selectedOffset: 10,
                                            data: [
                                                {value: values[0], name: names[0]},
                                                {value: values[1], name: names[1]}
                                            ]
                                        }
                                    ]
                                },
                                {
                                    series: [
                                        {
                                            name: years[1],
                                            type: 'pie',
                                            data: [
                                                {value: values[2], name: names[0]},
                                                {value: values[3], name: names[1]}
                                            ]
                                        }
                                    ]
                                },
                                {
                                    series: [
                                        {
                                            name: years[2],
                                            type: 'pie',
                                            data: [
                                                {value: values[4], name: names[0]},
                                                {value: values[5], name: names[1]}
                                            ]
                                        }
                                    ]
                                },
                                {
                                    series: [
                                        {
                                            name: years[3],
                                            type: 'pie',
                                            data: [
                                                {value: values[6], name: names[0]},
                                                {value: values[7], name: names[1]}
                                            ]
                                        }
                                    ]
                                },
                                {
                                    series: [
                                        {
                                            name: years[4],
                                            type: 'pie',
                                            data: [
                                                {value: values[8], name: names[0]},
                                                {value: values[9], name: names[1]}
                                            ]
                                        }
                                    ]
                                },
                                {
                                    series: [
                                        {
                                            name: years[5],
                                            type: 'pie',
                                            data: [
                                                {value: values[10], name: names[0]},
                                                {value: values[11], name: names[1]}
                                            ]
                                        }
                                    ]
                                },
                                {
                                    series: [
                                        {
                                            name: years[6],
                                            type: 'pie',
                                            data: [
                                                {value: values[12], name: names[0]},
                                                {value: values[13], name: names[1]}
                                            ]
                                        }
                                    ]
                                },
                                {
                                    series: [
                                        {
                                            name: years[7],
                                            type: 'pie',
                                            data: [
                                                {value: values[14], name: names[0]},
                                                {value: values[15], name: names[1]}
                                            ]
                                        }
                                    ]
                                },
                                {
                                    series: [
                                        {
                                            name: years[8],
                                            type: 'pie',
                                            data: [
                                                {value: values[16], name: names[0]},
                                                {value: values[17], name: names[1]}
                                            ]
                                        }
                                    ]
                                }
                            ]
                        };
                        chartsOptions.push(sexTab1Option);
                    }
                    console.log(chartsOptions);
                    console.log("chartsOptions.length" + chartsOptions.length);
                    // 为echarts对象加载数据
                    sexChartTab1Init.setOption(chartsOptions[0]);
                    sexChartTab2Init.setOption(chartsOptions[1]);
                    $(window).resize(sexChartTab1Init.resize);
                    $(window).resize(sexChartTab2Init.resize);
                }
        );
    }
</script>
</body>
</html>