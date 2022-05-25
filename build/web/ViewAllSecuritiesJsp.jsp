<%-- 
    Document   : ViewAllSecuritiesJsp
    Created on : May 24, 2022, 1:33:12 PM
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
        <h1>Hello World!</h1>
        
        
      <form action="EditSecurityServlet.do" method="Post">
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
            List<Security> securities = new ArrayList();
            securities = (List<Security>) session.getAttribute("securities");

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
            <tr bgcolor ="lightgrey">
                <td id="userId"><input type="text" name="userId" value="<%=id%>"/></td>
                
                <td id="name"><input type="text" name="name" value="<%=name%>"/></td>
                <td id="email"><input type="text" name="email" value="<%=email%>"/></td>
                <td id="phoneNum"><input type="text" name="phoneNum" value="<%=phoneNum%>"/></td>
                <td id="SubjectCode"><input type="text" name="campus" value="<%=workerType%>"/></td>
                 <td><input type="submit" value="Edit"/></td>
            </tr>
            

        <%
            }
        %>
        </table>
        
           
        </form>
                
                
                
                
    </body>
</html>
