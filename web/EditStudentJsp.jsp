<%-- 
    Document   : EditStudentJsp
    Created on : May 24, 2022, 1:29:25 AM
    Author     : hp
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Student  student  = (Student)session.getAttribute("student");
            Long id = student.getId();
            String name = student.getName();
            String email = student.getEmail();
            Integer phoneNum = student.getPhoneNum();
            String campus = student.getCampus();
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
                <td>phone Number:</td>
                <td><%=phoneNum%></td>
            </tr>
            <tr>
                <td>Subject Code:</td>
                <td><%=campus%></td>
            </tr>  
            <br>
        </table>
            
            <a href="AdminHome.jsp">Go back to the Manage Students Jsp page</a>
    </body>
</html>
