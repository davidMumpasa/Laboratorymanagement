<%-- 
    Document   : AdminAddStudent
    Created on : May 24, 2022, 12:48:48 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AdminAddStudentServlet.do" method="POST"> 
            <table>
                <tr>
                    <td>User Number:</td>
                    <td><input type="text" name="UserId"/></td>
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
                    <td>campus:</td>
                    <td><input type="text" name="campus"/></td>
                </tr>
                
              
                <tr>
                    <td></td>
                    <td><input type="submit"/></td>
                </tr> 
                 
            </table>
        </form>
    </body>
</html>
