package com.axz.servlet;

import com.axz.utils.RSAUtils;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.PublicKey;

@WebServlet(name = "GetPublicKeyServlet",urlPatterns = "/getPublicKeyServlet")
public class GetPublicKeyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        PublicKey publicKey = RSAUtils.getPublicKey();
        JSONObject json = new JSONObject();
        json.put("result",publicKey);
        json.put("code","1");
        json.put("msg","成功");
        PrintWriter writer = response.getWriter();
        writer.print(json);
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
