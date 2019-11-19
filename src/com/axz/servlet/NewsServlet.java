package com.axz.servlet;

import com.axz.entity.NewsEntity;
import com.axz.service.impl.CategoryServiceImpl;
import com.mysql.cj.xdevapi.JsonArray;
import net.sf.json.JSON;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "NewsServlet",urlPatterns = "/NewsServlet")
public class NewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        try {
            ArrayList<NewsEntity> news = new CategoryServiceImpl().queryNews();
            JSONObject json = new JSONObject();
            json.put("result",news);
            json.put("code","1");
            json.put("msg","成功");
            PrintWriter writer = response.getWriter();
            writer.print(json);
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
