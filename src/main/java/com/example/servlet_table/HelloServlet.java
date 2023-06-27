package com.example.servlet_table;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.swing.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello</h1>");
        out.println("</body></html>");


    }

}