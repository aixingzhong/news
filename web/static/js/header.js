$(function () {
    var jDom = {
        columnList: $("#columnList")
    };

    function queryNavigation() {
        $.ajax({
            url: "/news/category",
            type: "get",
            data: {},
            success: function (data) {
                if (data.code === "1") {
                    var sHtml = "";
                    var oData = data.result,
                        len = oData.length;
                    for (var i = 0; i < len; i++) {
                        sHtml += `<li data-id="${oData[i].categoryID}"><sapn class="header_separator">|</sapn><a href="javascript:;" class="header_href">${oData[i].categoryName}</a></li>`;
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
});