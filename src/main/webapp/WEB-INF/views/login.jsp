<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf8">
    <title>登录</title>
    <link rel="stylesheet" href="../../css/login.css" type="text/css">
        <!-- jQuery -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>

</head>

<body>

<h2>欢迎来到在线医疗系统</h2>
<br/>

<div class="container" id="container">
    <div class="form-container sign-up-container">
        <form action="#">
            <h1>注册</h1>
            <!-- <div class="social-container">
                <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
            </div> -->
            <br/>
            <!-- <span>使用邮箱注册</span> -->
            <!-- <br/> -->
            <input type="text" placeholder="昵称" />
            <input type="text" placeholder="姓名" />
            <input type="id" placeholder="身份证"/>
            <input type="email" placeholder="邮箱" />
            <input type="password" placeholder="密码" />
            <br/>
            <button>注册</button>
        </form>
    </div>


    <div class="form-container sign-in-container">
        <form id="login_form">
            <!--action="/login" method="post"-->

            <h1>登录</h1>
            <br/>
            <input type="username" name="username" id="username" placeholder="姓名" />
            <input type="password" name="password" id="password" placeholder="密码" />
            <!-- 验证码 -->
            <span style="box-align: left;">

                    <input type="text" style="width: 50%;" id="certifyCode" placeholder="验证码"/>
                    <a href="javascript:void(0);"><canvas id="verificationCode" width="70px" height="27px" style="float: right; " onclick="getVerifyCode()"></canvas></a>
                <!-- border:1px solid #d3d3d3; -->
                    </span>

<!--            <a href="#">忘记密码</a>-->
            <button id="login_btn">登录</button>
        </form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>很遗憾您来这里！</h1>
                <p>登录账号开始挂号、联系医生接受治疗！祝您早日康复！</p>
                <button class="ghost" id="signIn">登录</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>感谢您的信任！</h1>
                <p>注册开启您康复的第一步！</p>
                <button class="ghost" id="signUp">注册</button>
            </div>
        </div>
    </div>
</div>



<script type="text/javascript" src="../../js/login.js"></script>
</body>
</html>