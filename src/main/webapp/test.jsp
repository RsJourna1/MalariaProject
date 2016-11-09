<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>

<head>
    <title>首页</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <script type="text/javascript" src="${webRoot}/js/jquery.min.js?v=2.1.4"></script>
</head>
<body>
    <div align="center">
        <form action="/AnalyzeController/careerModule" method="post">
            <label>省份：<input name="province" value="云南"/></label>
            <label>疾病名称：<input name="province" value="恶性疟"/></label>
            <label>开始年份：<input name="province" value="2006"/></label>
            <label>结束年份：<input name="province" value="2009"/></label>
            <input type="submit" />
        </form>
    </div>
</body>
</html>