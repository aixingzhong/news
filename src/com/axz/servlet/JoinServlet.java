package com.axz.servlet;

import com.axz.entity.UserEntity;
import com.axz.service.impl.UserServiceImpl;
import com.axz.utils.RSAUtils;
import com.axz.utils.SHAUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.PrivateKey;

@WebServlet(name = "JoinServlet", urlPatterns = "/joinServlet")
public class JoinServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String encryptionName = request.getParameter("username");
        String encryptionPwd = request.getParameter("pwd");
        PrivateKey getPrivateKey = RSAUtils.getPrivateKey();
        String name = RSAUtils.privateDecrypt(encryptionName.getBytes(), getPrivateKey).toString();
        String pwd = RSAUtils.privateDecrypt(encryptionPwd.getBytes(), getPrivateKey).toString();
        System.out.println("用户名：" + name);
        System.out.println("密码：" + pwd);
        String shaEncodeName = SHAUtils.shaEncode(name);
        String shaEncodePwd = SHAUtils.shaEncode(pwd);

        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        UserEntity userEntity = new UserEntity();
        userEntity.setName(shaEncodeName);
        userEntity.setPasswd(shaEncodePwd);
        userEntity.setEmail(email);
        userEntity.setPhone(phone);
        int res = new UserServiceImpl().insertUser(userEntity);
        System.out.println(res);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
