<%-- 
    Document   : DeleteSecurityJsp
    Created on : May 24, 2022, 1:23:10 PM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="za.ac.tut.entities.Security"%>
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
            List<Security> DeletedSecurities = new ArrayList();
            DeletedSecurities = (List<Security>) request.getAttribute("DeletedSecurities");

            Long id = null;
            String name = "";
            String email = "";
            String password = "";
            Integer phoneNum = 0;
            String workerType = "";
            int count = 0;
            for (Security security : DeletedSecurities) {
                id = security.getId();
                name = security.getName();
                email = security.getEmail();
                password = security.getPassword();
                phoneNum = security.getPhoneNum();
                workerType = security.getWorkerType();
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
                <td><%=workerType%></td>
            </tr>  
            <br>
        </table>


        <%
            }
        %>
        
        <a href="AdminHome.jsp">Go back to the Manage Student Jsp page</a>
    </body>
</html>
