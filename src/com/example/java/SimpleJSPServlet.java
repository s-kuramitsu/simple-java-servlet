package com.example.java;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleJSPServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        request.setAttribute("message", "Message from servlet class.");

        response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/template/servlet.jsp");
        rd.forward(request, response);
    }
}
