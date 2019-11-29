<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="head.jsp"%>
<link rel="stylesheet" href="../static/css/index.css">
<body>
<%@ include file="header.jsp"%>
<div class="carousel_box" id="carouselBox">
    <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
           <%-- <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>--%>
        </ol>
        <div class="carousel-inner">
            <%--<div class="carousel-item active">
                <img src="http://pic8.dwnews.net/20191114/a34e672e8bc59f07bf2b1aa4916a3e27_w.jpg" class="d-block w-100"
                     alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>First slide label</h5>
                    <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="http://pic8.dwnews.net/20191114/a34e672e8bc59f07bf2b1aa4916a3e27_w.jpg" class="d-block w-100"
                     alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Second slide label</h5>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="http://pic8.dwnews.net/20191114/a34e672e8bc59f07bf2b1aa4916a3e27_w.jpg" class="d-block w-100"
                     alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Third slide label</h5>
                    <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                </div>
            </div>--%>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<section class="section_box">
    <ul class="section_title_list clear" id="sectionCategory">
        <li>要闻</li>
        <li>国际</li>
        <li>国内</li>
        <li>体育</li>
        <li>nba</li>
    </ul>
    <ul class="section_news_list clear" id="newsList"></ul>
</section>
<script src="../static/js/index.js"></script>
</body>
</html>
