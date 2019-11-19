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
    columnList: $("#columnList")
};

function queryNavigation() {
    $.ajax({
        url: "/news/ColumnServlet",
        type: "get",
        data: {},
        success: function (data) {
            console.log(typeof (data));
            console.log(data);
            if (data.code == 1) {
                var sHtml = "";
                var oData = data.result,
                    len = oData.length;
                for (var i = 0; i < len; i++) {
                    sHtml += `<li data-id="${oData[i].categoryID}">${oData[i].categoryName}</li>`;
                }
                jDom.columnList.html(sHtml);
            } else {
                alert(data.msg);
            }
        },
        error: function (e) {
            alert("网络请求出错")
        }
    })
}

// 查询导航栏
queryNavigation();
