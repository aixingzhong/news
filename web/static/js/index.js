$(document).scroll(function () {
    var top = $(window).scrollTop();
    if (top >= 425) {
        $("#sectionCategory").addClass("section_category_fixed");
        $(".section_news_list").css("margin-top", "60px");
    } else {
        $("#sectionCategory").removeClass("section_category_fixed");
        $(".section_news_list").css("margin-top", "0");
    }
});
var jDom = {
    carouselBox: $("#carouselBox"),
    newsList: $("#newsList")
};

function queryNews() {
    $.ajax({
        url: "/news/NewsServlet",
        type: "get",
        data: {},
        success: function (data) {
            if (data.code === "1") {
                var oData = data.result,
                    len = oData.length;
                var indicators = "",
                    inner = "";
                for (var i = 0; i < len; i++) {
                    indicators += ` <li data-target="#carouselExampleCaptions" data-slide-to="${i}" class="${i === 0 ? "active" : ""}"></li>`;
                    inner += `<div class="carousel-item ${i === 0 ? "active" : ""}">
                <a href="/news/article/${oData[i].newsID}" target="_blank"><img src="${oData[i].newsImagePath}" class="d-block w-100"
                     alt="..."></a>
                <div class="carousel-caption d-none d-md-block">
                    <h2>${oData[i].newsTitle}</h2>
                    <p></p>
                </div>
            </div>`;
                }
                jDom.carouselBox.find(".carousel-indicators").html(indicators);
                jDom.carouselBox.find(".carousel-inner").html(inner);
            } else {
                alert(data.msg);
            }
        },
        error: function (e) {
            alert("网络请求出错")
        }
    })
}

function queryAllNews() {
    $.ajax({
        url: "/news/NewsServlet",
        type: "get",
        data: {},
        success: function (data) {
            if (data.code === "1") {
                var oData = data.result,
                    len = oData.length;
                var sHtml = "";
                for (var i = 0; i < len; i++) {
                    sHtml += `<li class="col-md-4">
                     <a href="/news/article/${oData[i].newsID}" target="_blank">
                        <img src="${oData[i].newsImagePath}" class="section_news_img">
                      </a>
                        <a href="/news/article/${oData[i].newsID}" target="_blank" class="section_news_title">${oData[i].newsTitle}</a>
                        <div class="section_news_date">${oData[i].newDate}</div> 
                    </li>`
                }
                jDom.newsList.html(sHtml);
            } else {
                alert(data.msg);
            }
        },
        error: function (e) {
            alert("网络请求出错")
        }
    })
}

// 查询置顶新闻
queryNews();
// 查询要闻
queryAllNews();
