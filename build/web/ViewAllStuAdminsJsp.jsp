<%-- 
    Document   : ViewAllStuAdminsJsp
    Created on : May 19, 2022, 1:01:02 AM
    Author     : hp
--%>
<%@page import="java.util.Iterator"%>
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
        <h1>Hello World!</h1>

        <%
            List<StudentAdmin> StudentAdmins = new ArrayList();
            StudentAdmins = (List<StudentAdmin>) session.getAttribute("StudentAdmins");

        %>

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
                        //count++;

                %>
                <tr bgcolor ="lightgrey">
                    <td id="userId"><input type="text" name="userId" value="<%=id%>"/></td>

                    <td id="name"><input type="text" name="name" value="<%=name%>"/></td>
                    <td id="email"><input type="text" name="email" value="<%=email%>"/></td>
                    <td id="phoneNum"><input type="text" name="phoneNum" value="<%=phoneNum%>"/></td>
                    <td id="SubjectCode"><input type="text" name="campus" value="<%=SubjectCode%>"/></td>
                    <td><input type="submit" value="Edit"/></td>
                </tr>


                <%
                    }
                %>
            </table>

        </form>


    </body>
</html>
