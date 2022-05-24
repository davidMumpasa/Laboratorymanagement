<%-- 
    Document   : DelViewAllSecitiesJsp
    Created on : May 24, 2022, 1:12:44 PM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="za.ac.tut.entities.Security"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Security> securities = new ArrayList();
            securities = (List<Security>) session.getAttribute("securities");

            Long id = null;
            String name = "";
            String email = "";
            String password = "";
            Integer phoneNum = 0;
            String workerType = "";
            int count = 0;
            for (Security security : securities) {
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


        <form action="DelSecurity.do" method="Post">
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
