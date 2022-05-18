<%-- 
    Document   : ManageStudentAdminJsp
    Created on : May 18, 2022, 9:50:52 PM
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
        <h1>Manage student administrators </h1>

        <form action="FindAllStudentAdminServlet.do" method="POST">
            <a href="AddStudentAdminHtml.html"> Add student administrators</a> 
            <a href="DeleteStudentAdminHtml.html">delete student administrators info</a> 
            <input type="submit" value="update student administrators info"/>
        </form>



    </body>
</html>
