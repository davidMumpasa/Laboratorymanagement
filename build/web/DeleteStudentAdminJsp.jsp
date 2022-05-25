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
          %>
    <table bgcolor = "black">

                <tr bgcolor ="grey" >
                    <th>User Id: </th>
                    <th>name: </th>
                    <th>email: </th>
                    <th>phone Number:</th>
                    <th>worker Type:</th>
                </tr>

                <% Long id = null;
            String name = "";
            String email = "";
            Integer phoneNum = 0;
            String SubjectCode = "";
            int count = 0;
            for (StudentAdmin studAd : StudentAdmins) {
                id = studAd.getId();
                name = studAd.getName();
                email = studAd.getEmail();
                phoneNum = studAd.getPhoneNum();
                SubjectCode = studAd.getSubjectCode();
                count++;


                %>
                <tr bgcolor ="lightgrey">
                    <td id="userId"><%=id%></td>
                    <td id="name"><%=name%></td>
                    <td id="email"><%=email%></td>
                    <td id="phoneNum"><%=phoneNum%></td>
                    <td id="SubjectCode"><%=SubjectCode%></td>
                    <td><input type="submit" value="delete"/></td>
                </tr>


                <%
                    }
                %>
            </table>
        
        <a href="AdminHome.jsp">Go back to the Manage Student Admin Jsp page</a>
    </body>
</html>
