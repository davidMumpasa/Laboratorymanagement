<%-- 
    Document   : AdminAddStudentAdminOutcome
    Created on : May 20, 2022, 1:33:26 AM
    Author     : hp
--%>

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
            StudentAdmin studentAdmin = (StudentAdmin) request.getAttribute("studentAdmin");
            Long id = studentAdmin.getId();
            String name = studentAdmin.getName();
            String email = studentAdmin.getEmail();
            Integer phoneNum = studentAdmin.getPhoneNum();
            String SubjectCode = studentAdmin.getSubjectCode();
        %>
        <h1>The User bellow has been successfully added.</h1>
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
                <td>phone Number:</td>
                <td><%=phoneNum%></td>
            </tr>
            <tr>
                <td>Subject Code:</td>
                <td><%=SubjectCode%></td>
            </tr>  
            <br>
        </table>

        <p>Please click <a href="AdminHome.jsp">here</a> to go back the the home page.</p>
    </body>
</html>
