<%-- 
    Document   : EditSecurityJsp
    Created on : May 24, 2022, 1:51:21 PM
    Author     : hp
--%>

<%@page import="za.ac.tut.entities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Security security = (Security) session.getAttribute("security");
            Long id = security.getId();
            String name = security.getName();
            String email = security.getEmail();
            String password = security.getPassword();
            Integer phoneNum = security.getPhoneNum();
            String workerType = security.getWorkerType();
        %>
        <h1>Updated Informations </h1> 
        <table>

            <tr>
                <td>User Id: </td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td>name: </td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td>email: </td>
                <td><%=email%></td>
            </tr>
            <tr>
                <td>password: </td>
                <td><%=password%></td>
            </tr>
            <tr>
                <td>phone Number:</td>
                <td><%=phoneNum%></td>
            </tr>
            <tr>
                <td>Subject Code:</td>
                <td><%=workerType%></td>
            </tr>  
            <br>
        </table>

        <a href="AdminHome.jsp">Go back to the Manage Students Jsp page</a>
    </body>
</html>
