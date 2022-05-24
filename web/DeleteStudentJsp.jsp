<%-- 
    Document   : DeleteStudentJsp
    Created on : May 24, 2022, 1:52:03 AM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User has been deleted  </h1>
        <%
            List<Student> Students = new ArrayList();
            Students = (List<Student>) request.getAttribute("DeletedStudents");

            Long id = null;
            String name = "";
            String email = "";
            String password = "";
            Integer phoneNum = 0;
            String campus = "";
            int count = 0;
            for (Student student : Students) {
                id = student.getId();
                name = student.getName();
                email = student.getEmail();
                password = student.getPassword();
                phoneNum = student.getPhoneNum();
                campus = student.getCampus();
                count++;

        %>

        <table>
            <p><%=count%> )</p>
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
                <td><%=campus%></td>
            </tr>  
            <br>
        </table>


        <%
            }
        %>
        
        <a href="AdminHome.jsp">Go back to the Manage Student Jsp page</a>
    </body>
</html>
