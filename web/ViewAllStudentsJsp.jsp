<%-- 
    Document   : ViewAllStudentsJsp
    Created on : May 24, 2022, 1:10:19 AM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page import="java.util.List"%>
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
        
            for (Student studAd : Students) {
                id = studAd.getId();
                name = studAd.getName();
                email = studAd.getEmail();
                password = studAd.getPassword();
                phoneNum = studAd.getPhoneNum();
                campus = studAd.getCampus();
                //count++;

        %>

        <table bgcolor = "black">

            <tr bgcolor ="grey" >
                <th>User Id: </th>
                <th>name: </th>
                <th>email: </th>
                <th>password: </th>
                <th>phone Number:</th>
                <th>Subject Code:</th>
            </tr>
            <tr bgcolor ="lightgrey">
                <td id="userId"><%=id%></td>
                <td id="name"><%=name%></td>
                <td id="email"><%=email%></td>
                <td id="password"><%=password%></td>
                <td id="phoneNum"><%=phoneNum%></td>
                <td id="SubjectCode"><%=campus%></td>
            </tr>
        </table>


        <%
            }
        %>
        
        <form action="EditStudentServlet.do" method="Post">
            <div><p>Which Student would you like to edit ?</p><br> Please enter the User Id:</div>


            <table  >
                <tr>
                    <td>User Number:</td>
                    <td ><input type="text" name="userId"/></td>
                </tr>

                <tr>
                    <td>name:</td>
                    <td><input type="text" name="name"/></td>
                </tr>

                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email"/></td>
                </tr>

                <tr>
                    <td>Phone Number:</td>
                    <td><input type="text" name="phoneNum"/></td>
                </tr>

                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password"/></td>
                </tr>

                <tr>
                    <td>Campus:</td>
                    <td><input type="text" name="campus"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Edit"/></td>
                </tr> 

            </table>
        </form>
    </body>
</html>
