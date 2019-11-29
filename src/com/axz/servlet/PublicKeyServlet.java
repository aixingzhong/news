package com.axz.servlet;

import com.axz.utils.RSAUtils;
import com.axz.utils.SHAUtils;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PublicKeyServlet",urlPatterns = "/publicKeyServlet")
public class PublicKeyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // 返回编码为utf-8
        response.setCharacterEncoding("utf-8");
        // 返回格式为json
        response.setContentType("application/json; charset=utf-8");

        String publicKey = RSAUtils.getKeyPair().get("publicKey");
        System.out.println(publicKey);
        JSONObject json = new JSONObject();
        json.put("code","1");
        json.put("msg","成功");
        json.put("publicKey",publicKey);
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
