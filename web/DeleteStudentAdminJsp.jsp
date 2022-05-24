<%-- 
    Document   : DeleteStudentAdminJsp
    Created on : May 19, 2022, 9:37:18 PM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="za.ac.tut.entities.StudentAdmin"%>
<%@page import="java.util.List"%>
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
            List<StudentAdmin> StudentAdmins = new ArrayList();
            StudentAdmins = (List<StudentAdmin>) request.getAttribute("DeletedStudentAdmins");

            Long id = null;
            String name = "";
            String email = "";
            String password = "";
            Integer phoneNum = 0;
            String SubjectCode = "";
            int count = 0;
            for (StudentAdmin studAd : StudentAdmins) {
                id = studAd.getId();
                name = studAd.getName();
                email = studAd.getEmail();
                password = studAd.getPassword();
                phoneNum = studAd.getPhoneNum();
                SubjectCode = studAd.getSubjectCode();
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
                <td><%=SubjectCode%></td>
            </tr>  
            <br>
        </table>


        <%
            }
        %>
        
        <a href="AdminHome.jsp">Go back to the Manage Student Admin Jsp page</a>
    </body>
</html>
