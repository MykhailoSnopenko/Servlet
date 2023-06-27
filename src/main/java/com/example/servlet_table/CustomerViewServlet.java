package com.example.servlet_table;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CustomerViewServlet extends HttpServlet {

    private List<Customer> customers
            = Arrays.asList(new Customer("Alex", "Markov", 18, "Kyiv", "Kosmonavtiv str.", "male", "no", 1),
            new Customer("Volodymyr", "Siryi", 28, "Kherson", "Vokzalna str.", "male", "no", 10),
            new Customer("Svitlana", "Ostapenko", 24, "Varash", "Vokzalna str.", "female", "no", 2),
            new Customer("Yan", "Schyray", 46, "Chernigiv", "Centralna str.", "male", "yes", 11),
            new Customer("Kyryl", "Shylo", 43, "Kyiv", "Franka str.", "male", "no", 5),
            new Customer("Olena", "Svata", 39, "Borodyanka", "Balzaka str.", "male", "yes", 5),
            new Customer("Kyryl", "Hertavich", 54, "Nizhyn", "Myslyvska str.", "male", "yes", 3),
            new Customer("Volodymyr", "Siryi", 21, "Maryanka", "Karova str.", "male", "no", 0),
            new Customer("Anastasiia", "Varken", 17, "Bahmach", "Svirina str.", "male", "no", 0),
            new Customer("Vladislav", "Safronov", 64, "Nizhyn", "Krakova str.", "male", "yes", 4),
            new Customer("Olena", "Limova", 24, "Rivne", "Chehova str.", "male", "no", 7),
            new Customer("Maryna", "Kynova", 36, "Irpin", "Korniya str.", "male", "no", 2),
            new Customer("Kateryna", "Rybai", 40, "Kyiv", "Muzychenko str.", "male", "no", 2),
            new Customer("Diana", "Svitlon", 44, "Hostomel", "Kerna str.", "male", "yes", 12),
            new Customer("Oleh", "Markovych", 24, "Bucha", "Svitla str.", "male", "no", 8),
            new Customer("Ihor", "Vovkodav", 32, "Kyiv", "Slipogo str.", "male", "no", 18));

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customers", customers);
        request.setAttribute("customersStr", getCustomerViewServlet());
        request.getRequestDispatcher("customers.jsp").forward(request, response);
    }
    public String getCustomerViewServlet(){
        StringBuilder s = new StringBuilder();
        for (Customer c: customers){
            s.append("<tr><td>")
                    .append(c.getName())
                    .append("</td><td>")
                    .append(c.getLastName())
                    .append("</td><td>")
                    .append(c.getAge())
                    .append("</td><td>")
                    .append(c.getCity())
                    .append("</td><td>")
                    .append(c.getAdress())
                    .append("</td><td>")
                    .append(c.getGender())
                    .append("</td><td>")
                    .append(c.getChildren())
                    .append("</td><td>")
                    .append(c.getCountryVisited())
                    .append("</td></tr>");
        }
        return s.toString();
    }
}


