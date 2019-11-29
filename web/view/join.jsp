<%--
  Created by IntelliJ IDEA.
  User: axz
  Date: 2019/11/28
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="head.jsp" %>
<link rel="stylesheet" href="../static/css/join.css">
<div class="container-fluid">
    <div class="row">
        <form   class="col-md-4 col-md-offset-4 form-horizontal"  id="joinForm">
            <p class="text-center join_img"><img src="../static/img/news.png" alt="" width="50" height="50"></p>
            <h3 class="text-center">用户注册</h3>
            <div class="form-group">
                <label  for="username" class="col-md-3 control-label">用户名</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="username" placeholder="请输入用户名" name="username">
                </div>
                <label  class="col-md-1 join_asterisk">*</label>
            </div>
            <div class="form-group">
                <label  for="phone" class="col-md-3 control-label">手机号码</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="phone" placeholder="请输入手机号码" name="phone">
                </div>
                <label  class="col-md-1 join_asterisk">*</label>
            </div>
            <div class="form-group">
                <label  for="email" class="col-md-3 control-label">邮箱</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="email" placeholder="请输入邮箱" name="email">
                </div>
                <label  class="col-md-1 join_asterisk">*</label>
            </div>
            <div class="form-group">
                <label  for="pwd" class="col-md-3 control-label">请输入密码</label>
                <div class="col-md-8">
                    <input type="password" class="form-control" id="pwd" placeholder="请输入用户名" name="pwd">
                </div>
                <label  class="col-md-1 join_asterisk">*</label>
            </div>
            <div class="form-group">
                <label  for="confirmPwd" class="col-md-3 control-label">确认密码</label>
                <div class="col-md-8">
                    <input type="password" class="form-control" id="confirmPwd" placeholder="请再次输入密码">
                </div>
                <label  class="col-md-1 join_asterisk">*</label>
            </div>
            <button type="button" class="btn btn-default col-md-offset-3" id="submit">注册</button>
            <a href="" class="col-md-offset-1">已经注册?立即登录</a>
        </form>
    </div>
</div>
<div id="dialog">

</div>
<script src="../static/lib/jsencrypt/jsencrypt.min.js"></script>
<script src="../static/js/join.js"></script>