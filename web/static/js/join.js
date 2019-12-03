$(function () {
    let jDom = {
        username: $("#username"),
        phone: $("#phone"),
        email: $("#email"),
        pwd: $("#pwd"),
        confirmPwd: $("#confirmPwd"),
        joinForm: $("#joinForm"),
        submit: $("#submit"),
        dialog: $("#dialog")
    };
    jDom.submit.on("click", function () {
        let username = $.trim(jDom.username.val()),
            pwd = $.trim(jDom.pwd.val()),
            phone = $.trim(jDom.phone.val()),
            email = $.trim(jDom.email.val());
        if (username === "") {
            jDom.dialog.html("请输入用户名");
            jDom.dialog.dialog();
            return false;
        }
        if (phone === "") {
            jDom.dialog.html("请输入手机号码");
            jDom.dialog.dialog();
            return false;
        }
        if (email === "") {
            jDom.dialog.html("请输入邮箱");
            jDom.dialog.dialog();
            return false;
        }
        if (pwd === "") {
            jDom.dialog.html("请输入密码");
            jDom.dialog.dialog();
            return false;
        }
        if (pwd !== $.trim(jDom.confirmPwd.val())) {
            jDom.dialog.html("密码不一致");
            jDom.dialog.dialog();
            return false;
        }
        $.ajax({
            url: '/news/getPublicKeyServlet',
            type: "get",
            success: function (data) {
                let encrypt = new JSEncrypt();
                let publicKey = encrypt.getPublicKey(data.result);
                encrypt.setPublicKey(publicKey);
                let name = encrypt.encrypt(username),
                    passwd = encrypt.encrypt(pwd);
                let obj = {
                    username: name,
                    pwd: passwd,
                    phone: phone,
                    email: email
                };
                join(obj);
            },
            error: function () {
                alert("网络请求出错")
            }

        })
    });

    function join(obj) {
        $.ajax({
            url:"/news/joinServlet",
            type:"post",
            data:obj,
            success:function(data){

            },
            error:function(){
                alert("网络请求出错");
            }
        })
    }
});