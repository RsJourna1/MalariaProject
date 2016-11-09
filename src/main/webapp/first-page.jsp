<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/11/9
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="${webRoot}/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${webRoot}/css/font-awesome.min.css"/>
    <link rel="stylesheet" type="text/css" href="${webRoot}/css/animate.css"/>
    <link rel="stylesheet" type="text/css" href="${webRoot}/css/style.css"/>

    <style type="text/css">
        .font-li {
            font-size: 16px;
        }
    </style>
</head>
<body class="gray-bg">
<div class="row border-bottom white-bg dashboard-header">
    <div class="col-sm-4">
        <h2>欢迎访问</h2>
        <p>基于时空的疟疾数据监控系统</p>
        <p>该系统为您提供更全面的数据，更直观的监控。</p>
    </div>
    <div class="col-sm-4">
        <h2>功能简介：</h2>
        <ol class="font-li">
            <li>数据导入</li>
            <li>数据下载</li>
            <li>执行计算</li>
            <li>爆发与分析</li>
            <li>数据分析</li>
            <li>统计预测</li>
            <li>相关数据</li>

        </ol>
    </div>
    <div class="col-sm-4">
        <h2>疾病简介</h2>
        <p>&nbsp;&nbsp;&nbsp;&nbsp;疟疾是由疟原虫属寄生虫所致。这些寄生虫通过被称为“疟疾病媒”的受感染雌性按蚊叮咬传至人类。共有5种寄生虫会导致人类疟疾，其中恶性疟原虫和间日疟原虫危害最大。</p>
        <h2>谁有危险？</h2>
        <p>&nbsp;&nbsp;&nbsp;&nbsp;2015年，总共约有32亿人（全世界约一半人口）面临疟疾风险。多数疟疾病例和死亡发生在撒哈拉以南非洲。然而，亚洲、拉丁美洲以及情况稍好一些的中东地区也受到影响。2015年，95个国家和地区有持续性的疟疾传播。

            一些人群感染疟疾病毒并发展为严重疾病的风险比其他人群高得多。高风险人群包括婴儿，5岁以下儿童，孕妇，艾滋病毒感染者和艾滋病人，以及无免疫力的移民、流动人口和旅客。国家疟疾控制规划需要针对这些人群的具体情况，采取专门措施保护他们免受疟疾感染。</p>
    </div>
</div>
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-4">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>联系信息</h5>

                </div>
                <div class="ibox-content">
                    <p><i class="fa fa-send-o"></i> 开发人员：<a href="#" target="_blank">xxx</a></p>
                    <p><i class="fa fa-send-o"></i> 微信：<a href="#" target="_blank">xxx</a></p>
                    <p><i class="fa fa-send-o"></i> QQ：<a href="#" target="_blank">xxx</a></p>
                    <p><i class="fa fa-send-o"></i> 微博：<a href="#" target="_blank">xxx</a></p>

                </div>
            </div>

        </div>
        <div class="col-sm-4">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>更新日志</h5>
                </div>
                <div class="ibox-content no-padding">
                    <div class="panel-body">
                        <div class="panel-group" id="version">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v41">v1.0</a><code
                                            class="pull-right">2016.11.10</code>
                                    </h5>
                                </div>
                                <div id="v41" class="panel-collapse collapse in">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本是一个测试版本，主要是实现各种功能，让我们期待2.0的到来。</div>
                                        <ol>
                                            <li>首页修改地图大小，增加简介功能，让用户更直观了解该系统。</li>
                                            <li>用户和管理员功能修改。</li>
                                        </ol>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>当前定位</h5>
                </div>
                <div class="ibox-content">

                    <!--<h2>欢迎使用</h2>
                    <p>基于时空的疟疾数据监控系统</p>
                    <small>您现在的定位为：</small>-->
                    <div style="height:200px; ">
                        <iframe width="100%" height="100%" src="littleMap.jsp" frameborder="0"
                                data-id="littleMap.jsp" seamless></iframe>
                    </div>


                </div>
            </div>
        </div>

    </div>
</div>
<script src="${webRoot}/js/jquery.min.js"></script>
<script src="${webRoot}/js/bootstrap.min.js"></script>
<script src="${webRoot}/js/plugins/layer/layer.js"></script>
</body>
</html>
