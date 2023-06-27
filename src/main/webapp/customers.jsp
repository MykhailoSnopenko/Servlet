<%@ page import="java.util.List" %>
<%@ page import="com.example.servlet_table.Customer" %>
<%@ page import="com.example.servlet_table.CustomerViewServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>

<style>
    body{
        margin: 0 auto;
    }
    table, th, td{
        border: 1px solid gray;
        text-align: center;
        margin: 2% auto;
        padding: 5px;
    }
    th {
        text-transform: uppercase;
        background-color: lightblue;
        color: white;
        width: fit-content;
    }
</style>

<body>
<table>
    <thead>
    <tr>
        <th>name</th>
        <th>last name</th>
        <th>age</th>
        <th>city</th>
        <th>adress</th>
        <th>gender</th>
        <th>children</th>
        <th>country visited</th>
    </tr>
    </thead>
    
    <tbody>
<%
    List<Customer> customers = (List<Customer>)request.getAttribute("customers");
    String CustomerStr = (String) request.getAttribute("customersStr");
    for (Customer c: customers){
        out.print(("<tr><td>" + c.getName() + "</td><td>" + c.getLastName() + "</td><td>" + c.getAge() + "</td><td>" +c.getCity() + "</td><td>"
                +c.getAdress()  + "</td><td>" + c.getGender()+ "</td><td>" + c.getChildren()+ "</td><td>"+c.getCountryVisited()+ "</td></tr>"));
    }
    //System.out.print(CustomerStr);
%>
    </tbody>
</table>
</body>
</html>
