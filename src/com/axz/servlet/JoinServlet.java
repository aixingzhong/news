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
        String name = null;
        String passwd = null;
//        PrivateKey privateKey = RSAUtils.getKeyPair().containsKey();
//        RSAUtils.privateDecrypt(request.getParameter("username"),privateKey);
        try {
            name = SHAUtils.shaEncode(request.getParameter("username"));
            passwd = SHAUtils.shaEncode(request.getParameter("pwd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setPasswd(passwd);
        userEntity.setEmail(email);
        userEntity.setPhone(phone);
        int res = new UserServiceImpl().insertUser(userEntity);
        System.out.println(res);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
