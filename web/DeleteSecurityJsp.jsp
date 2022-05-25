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
            %>
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
        
            for (Security security : DeletedSecurities) {
                id = security.getId();
                name = security.getName();
                email = security.getEmail();
                phoneNum = security.getPhoneNum();
                workerType = security.getWorkerType();
                //count++;

        %>
            <tr bgcolor ="lightgrey">
                <td id="userId"> <%=id%></td>
                    <td id="name"><%=name%></td>
                    <td id="email"><%=email%></td>
                    <td id="phoneNum"><%=phoneNum%></td>
                    <td id="SubjectCode"><%=workerType%></td>
            </tr>
            

        <%
            }
        %>
        </table>
        
        <a href="AdminHome.jsp">Go back to the Manage Student Jsp page</a>
    </body>
</html>
