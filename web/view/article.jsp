<%@ page import="com.axz.entity.ArticleEntity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArticleEntity articleEntity = (ArticleEntity) request.getAttribute("result"); %>
<%@ include file="head.jsp"%>
<link rel="stylesheet" href="../static/css/article.css">
<body>
<%@ include file="header.jsp"%>
<div class="article_content">
    <h3 class="article_title"><%= articleEntity.getNewsTitle()%></h3>
    <p>
        <%= articleEntity.getNewsContent()%>
    </p>
</div>
</body>
</html>
