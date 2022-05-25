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

           %>
        
        <form action="DelStudent.do" method="Post">
            <div><p>Which Student would you like to edit ?</p><br> Please enter the User Id:</div>

            <table bgcolor = "black">
            
            <tr bgcolor ="grey" >
                <th>User Id: </th>
                <th>name: </th>
                <th>email: </th>
                <th>phone Number:</th>
                <th>campus:</th>
            </tr>
            
            <%  Long id = null;
            String name = "";
            String email = "";
            Integer phoneNum = 0;
            String campus = "";
            int count = 0;
        
            for (Student studAd : Students) {
                id = studAd.getId();
                name = studAd.getName();
                email = studAd.getEmail();
                phoneNum = studAd.getPhoneNum();
                campus = studAd.getCampus();
                //count++;

        %>
            <tr bgcolor ="lightgrey">
                 
                
                <tr bgcolor ="lightgrey">
                     <td id="userId"><input type="text" name="userId" value="<%=id%>"/></td>
                    <td id="name"><%=name%></td>
                    <td id="email"><%=email%></td>
                    <td id="phoneNum"><%=phoneNum%></td>
                    <td id="SubjectCode"><%=campus%></td>
                    <td><input type="submit" value="delete"/></td>
                </tr>
                  
            </tr>
            

        <%
            }
        %>
        </table>
        
           
        </form>
        
        
        
        
    </body>
</html>
