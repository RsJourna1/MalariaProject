<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/11/9
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>注册</title>
    <meta name="keywords" content="后台">
    <meta name="description" content="技术">

    <%--<link rel="shortcut icon" href="favicon.ico">--%>
    <link href="${webRoot}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${webRoot}/css/font-awesome.min.css" rel="stylesheet">
    <link href="${webRoot}/css/animate.css" rel="stylesheet">
    <link href="${webRoot}/css/style.css" rel="stylesheet">

    <link href="${webRoot}/css/plugins/register/custom.css" rel="stylesheet">

    <script>if (window.top !== window.self) {
        window.top.location = window.location;
    }</script>
    <style type="text/css">
        body.gray-bg {
            background: url(${webRoot}/css/plugins/register/register-img.png) no-repeat center fixed;
            color: rgba(255, 255, 255, .95);
        }

        .signinpanel form {
            background: rgba(255, 255, 255, 0.43);
            border: 1px solid rgba(255, 255, 255, 0.4);
            box-shadow: 0 3px 0 rgba(12, 12, 12, 0.03);
            border-radius: 3px;
            padding: 30px;
        }

        .signinpanel .form-control {
            color: #333;
        }

        .text-muted {
            color: #ffffff;
        }

        .logo-name {
            font-size: 80px !important;
            font-weight: 800;
            letter-spacing: -10px;
            margin-bottom: 0px;
        }
    </style>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen   animated fadeInDown">
    <div class="signinpanel">
        <div>

            <h1 class="logo-name">注&nbsp;册</h1>

        </div>
        <h3>欢迎注册时空的疟疾数据监控系统</h3>
        <p>创建一个新账户</p>
        <form class="m-t" role="form" action="login.html">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="请输入用户名">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="请输入密码" required="">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="请再次输入密码" required="">
            </div>
            <div class="form-group text-left">
                <div class="checkbox i-checks">
                    <label class="no-padding">
                        <strong><input type="checkbox"><i></i> 我同意注册协议</strong></label>
                </div>
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">注 册</button>

            <p class="text-muted text-center">
                <small>已经有账户了？</small>
                <a href="login.jsp">点此登录</a>
            </p>

        </form>
    </div>
</div>

<!-- 全局js -->
<script src="${webRoot}/js/jquery.min.js"></script>
<script src="${webRoot}/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="${webRoot}/js/plugins/iCheck/icheck.min.js"></script>
<script>
    $(document).ready(function () {
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
    });
</script>


</body>

</html>
