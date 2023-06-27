<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.DayOfWeek" %><%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 4/14/2023
  Time: 12:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        response.getWriter().println(dayOfWeek);
    %>

</body>
</html>
