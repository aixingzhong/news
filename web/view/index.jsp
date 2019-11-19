<%--
  Created by IntelliJ IDEA.
  User: axz
  Date: 2019/8/8
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
    <%--    IE--%>
    <link rel="shortcut icon" href="../static/img/news.ico" type="image/x-icon">
    <link rel="icon" href="../static/img/news.ico" type="image/x-icon">
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../static/lib/bootstrap-4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../static/css/index.css">
</head>
<body>
<header class="header_box clear">
    <div class="header_left">
        <img src="../static/img/news.png" alt="" width="30px" height="30px">
        <span class="header_left_font">爱新闻</span>
    </div>
    <div class="header_content">
        <ul class="header_content_list clear" id="columnList">

        </ul>
    </div>
    <div class="header_right">
        <div>
            <span>登录</span>| <span>注册</span>
        </div>
    </div>
</header>
<div class="carousel_box">
    <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
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
            </div>
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
    <ul class="section_list clear" id="sectionCategory">
        <li>要闻</li>
        <li>国际</li>
        <li>国内</li>
        <li>体育</li>
        <li>nba</li>
    </ul>
    <ul class="section_news_list clear">
        <li class="col-sm-4">
            <div class="">
                <a href="" target="_blank" style="display: block; overflow: hidden;">
                    <img src="https://cdn.hk01.com/di/media/images/cis/5dccdef9b66f770df1c11f8e.jpg/x4y8rcuZh_dHwpovifgLlUgtjCjxeZgqZOJCJWTiQiU?v=thumbnail_4_3"
                         style="transition: all 0.3s ease-in-out 0s; transform-style: preserve-3d; backface-visibility: hidden; transform: scale(1);">
                </a>
                <h2>
                    <a href="http://news.dwnews.com/global/news/2019-11-14/60156869.html" target="_blank"
                       class="ikeyBox" ikey="588d12951bc179ed7969af67b561f61d">
                        彭丽媛出席金砖活动 巴西总统夫人中式服装亮相[图]
                    </a>
                </h2>
                <div class="pbl-icobox">
                    <div class="bzico-pd">2019年 11月 13日</div>
                </div>
            </div>
        </li>
        <li class="col-sm-4">
            <div class="">
                <a href="" target="_blank" style="display: block; overflow: hidden;">
                    <img src="https://cdn.hk01.com/di/media/images/cis/5dccdef9b66f770df1c11f8e.jpg/x4y8rcuZh_dHwpovifgLlUgtjCjxeZgqZOJCJWTiQiU?v=thumbnail_4_3"
                         style="transition: all 0.3s ease-in-out 0s; transform-style: preserve-3d; backface-visibility: hidden; transform: scale(1);">
                </a>
                <h2>
                    <a href="http://news.dwnews.com/global/news/2019-11-14/60156869.html" target="_blank"
                       class="ikeyBox" ikey="588d12951bc179ed7969af67b561f61d">
                        彭丽媛出席金砖活动 巴西总统夫人中式服装亮相[图]
                    </a>
                </h2>
                <div class="pbl-icobox">
                    <div class="bzico-pd">2019年 11月 13日</div>
                </div>
            </div>
        </li>
        <li class="col-sm-4">
            <div class="">
                <a href="" target="_blank" style="display: block; overflow: hidden;">
                    <img src="https://cdn.hk01.com/di/media/images/cis/5dccdef9b66f770df1c11f8e.jpg/x4y8rcuZh_dHwpovifgLlUgtjCjxeZgqZOJCJWTiQiU?v=thumbnail_4_3"
                         style="transition: all 0.3s ease-in-out 0s; transform-style: preserve-3d; backface-visibility: hidden; transform: scale(1);">
                </a>
                <h2>
                    <a href="http://news.dwnews.com/global/news/2019-11-14/60156869.html" target="_blank"
                       class="ikeyBox" ikey="588d12951bc179ed7969af67b561f61d">
                        彭丽媛出席金砖活动 巴西总统夫人中式服装亮相[图]
                    </a>
                </h2>
                <div class="pbl-icobox">
                    <div class="bzico-pd">2019年 11月 13日</div>
                </div>
            </div>
        </li>
        <li class="col-sm-4">
            <div class="">
                <a href="" target="_blank" style="display: block; overflow: hidden;">
                    <img src="https://cdn.hk01.com/di/media/images/cis/5dccdef9b66f770df1c11f8e.jpg/x4y8rcuZh_dHwpovifgLlUgtjCjxeZgqZOJCJWTiQiU?v=thumbnail_4_3"
                         style="transition: all 0.3s ease-in-out 0s; transform-style: preserve-3d; backface-visibility: hidden; transform: scale(1);">
                </a>
                <h2>
                    <a href="http://news.dwnews.com/global/news/2019-11-14/60156869.html" target="_blank"
                       class="ikeyBox" ikey="588d12951bc179ed7969af67b561f61d">
                        彭丽媛出席金砖活动 巴西总统夫人中式服装亮相[图]
                    </a>
                </h2>
                <div class="pbl-icobox">
                    <div class="bzico-pd">2019年 11月 13日</div>
                </div>
            </div>
        </li>
    </ul>
</section>
<footer>

</footer>
<script src="../static/lib/jquery-3.4.1.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="../static/lib/bootstrap-4.3.1/js/bootstrap.min.js"></script>
<script src="../static/js/index.js"></script>
</body>
</html>
