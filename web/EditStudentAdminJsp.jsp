<%-- 
    Document   : EditStudentAdminJsp
    Created on : May 18, 2022, 10:44:30 PM
    Author     : hp
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="za.ac.tut.entities.StudentAdmin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            StudentAdmin studAd = (StudentAdmin)session.getAttribute("studAdmin");
            Long id = studAd.getId();
            String name = studAd.getName();
            String email = studAd.getEmail();
            String password = studAd.getPassword();
            Integer phoneNum = studAd.getPhoneNum();
            String SubjectCode = studAd.getSubjectCode();
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
                <td><%=SubjectCode%></td>
            </tr>  
            <br>
        </table>
            
            <a href="AdminHome.jsp">Go back to the Manage Student Admin Jsp page</a>
    </body>
</html>
