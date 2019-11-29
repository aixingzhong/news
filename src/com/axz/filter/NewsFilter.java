package com.axz.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "NewsFilter",urlPatterns = "/new/*")
public class NewsFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 获取session对象,判断是否登录
        HttpServletRequest request = (HttpServletRequest) req;
        String URI = request.getRequestURI();
        System.out.println(URI);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
