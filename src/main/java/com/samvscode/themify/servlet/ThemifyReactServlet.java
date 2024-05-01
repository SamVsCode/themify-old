package com.samvscode.themify.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.atlassian.templaterenderer.TemplateRenderer;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ThemifyReactServlet extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(ThemifyReactServlet.class);
    
    private final TemplateRenderer renderer;

    public ThemifyReactServlet(TemplateRenderer renderer){
        this.renderer = renderer;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        renderer.render("templates/themify-settings.vm", resp.getWriter());
    }

}