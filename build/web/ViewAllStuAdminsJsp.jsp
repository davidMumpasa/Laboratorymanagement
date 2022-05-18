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


        <form action="EditStudentAdminServlet.do" method="Post">
            <div><p>Which Student Administrator would you like to modify?</p><br> Please enter the User Id:</div>
             
        
            <table>
                <tr>
                    <td>User Number:</td>
                    <td><input type="text" name="userId"/></td>
                </tr>
                
                <tr>
                    <td>name:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email"/></td>
                </tr>
                
                <tr>
                    <td>Phone Number:</td>
                    <td><input type="text" name="phoneNum"/></td>
                </tr>
                
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password"/></td>
                </tr>
                  
                <tr>
                    <td>subject Code:</td>
                    <td><input type="text" name="subjectCode"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit"/></td>
                </tr> 
                 
            </table>
        </form>

    </body>
</html>
