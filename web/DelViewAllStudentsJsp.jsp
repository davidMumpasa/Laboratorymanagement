<%-- 
    Document   : DelViewAllStudentsJsp
    Created on : May 24, 2022, 1:58:03 AM
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
       <h1>Hello World!</h1>
        <%
            List<Student> Students = new ArrayList();
            Students = (List<Student>) session.getAttribute("Students");

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


        <form action="DelStudent.do" method="Post">
            <div><p>Which Student would you like to delete?</p><br> Please enter the User Id:</div>


            <table>
                <tr>
                    <td>User Number:</td>
                    <td><input type="text" name="userId"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="delete"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
