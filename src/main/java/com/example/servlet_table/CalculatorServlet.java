package com.example.servlet_table;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class CalculatorServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setContentType("text/html");
        calculate(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        calculate(request, response);
    }
    private void calculate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer a = Integer.valueOf(request.getParameter("a"));
        Integer b = Integer.valueOf(request.getParameter("b"));
        String operation = request.getParameter("operation");
        switch (operation){
            case "plus":
                response.getWriter().println("<H1>" + (a + b) + "</H1>");
                break;
        }
    }
}