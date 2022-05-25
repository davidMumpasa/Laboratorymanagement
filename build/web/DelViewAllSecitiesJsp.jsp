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

           %>
        
         <form action="DelSecurity.do" method="Post">
            <div><p>Which Student would you like to edit ?</p><br> Please enter the User Id:</div>

            <table bgcolor = "black">
            
            <tr bgcolor ="grey" >
                <th>User Id: </th>
                <th>name: </th>
                <th>email: </th>
                <th>phone Number:</th>
                <th>worker Type:</th>
            </tr>
        

        <%

            Long id = null;
            String name = "";
            String email = "";
            Integer phoneNum = 0;
            String workerType = "";
            int count = 0;
        
            for (Security security : securities) {
                id = security.getId();
                name = security.getName();
                email = security.getEmail();
                phoneNum = security.getPhoneNum();
                workerType = security.getWorkerType();
                //count++;

        %>
            <<tr bgcolor ="lightgrey">
                    <td id="userId"><input type="text" name="userId" value="<%=id%>"/></td>
                    <td id="name"><%=name%></td>
                    <td id="email"><%=email%></td>
                    <td id="phoneNum"><%=phoneNum%></td>
                    <td id="SubjectCode"><%=workerType%></td>
                    <td><input type="submit" value="delete"/></td>
                </tr>
            

        <%
            }
        %>
        </table>
        
           
        </form>
        
        
        
    </body>
</html>
