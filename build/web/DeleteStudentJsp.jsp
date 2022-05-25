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
            %>
            
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
                <td id="userId"> <%=id%></td>
                    <td id="name"><%=name%></td>
                    <td id="email"><%=email%></td>
                    <td id="phoneNum"><%=phoneNum%></td>
                    <td id="SubjectCode"><%=campus%></td>
            </tr>
            

        <%
            }
        %>
        </table>
        
        <a href="AdminHome.jsp">Go back to the Manage Student Jsp page</a>
    </body>
</html>
