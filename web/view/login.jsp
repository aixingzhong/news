<%--
  Created by IntelliJ IDEA.
  User: axz
  Date: 2019/11/28
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="head.jsp" %>
<link rel="stylesheet" href="../static/css/login.css">
<div class="container-fluid">
    <div class="row">
        <form action="" class="col-md-4 col-md-offset-4">
            <p class="text-center login_img"><img src="../static/img/news.png" alt="" width="50" height="50"></p>
            <h3 class="text-center">用户登录</h3>
            <div class="form-group">
                <lable for="username">用户名</lable>
                <input type="text" class="form-control" id="username" placeholder="请输入用户名">
            </div>
            <div class="form-group">
                <lable for="pwd" class="col-md-4">密码</lable>
                <label class="col-md-4  col-md-offset-4"><a href="">忘记密码?</a></label>
                <input type="text" class="form-control" id="pwd" placeholder="请输入密码">
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox"> 记住密码
                </label>
            </div>
            <button type="submit" class="btn btn-default ">登录</button>
            <a href="" class="col-md-offset-1">还未注册?立即注册</a>
        </form>

    </div>

</div>