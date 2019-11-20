<%@ page import="com.axz.entity.ArticleEntity" %><%--
  Created by IntelliJ IDEA.
  User: axz
  Date: 2019/11/20
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArticleEntity articleEntity = (ArticleEntity) request.getAttribute("result"); %>
<html>
<head>
    <title>爱新闻</title>
</head>
<body>
<div>
    <h3><%= articleEntity.getNewsTitle()%></h3>
    <p>
        <%= articleEntity.getNewsContent()%>
    </p>
</div>
</body>
</html>
