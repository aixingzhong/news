package com.axz.servlet;

import com.axz.entity.ArticleEntity;
import com.axz.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ArticleServlet",urlPatterns = "/article/*")
public class ArticleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String URI = request.getRequestURI();
        // /news/article/
        String str = URI.substring(14);
        try {
            int id = Integer.parseInt(str);
            ArticleEntity articleEntity = new CategoryServiceImpl().queryArticle(id);
            request.setAttribute("result",articleEntity);
            request.getRequestDispatcher("/view/article.jsp").forward(request,response);
//            request.getRequestDispatcher(  "article.jsp").forward(request,response);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
