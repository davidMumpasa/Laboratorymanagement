/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class UserLoginHandler extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        
        Long findUserById = Long.parseLong(request.getParameter("findUserById"));
        String password = request.getParameter("password");
        String role = request.getParameter("role");
       
        String location = "";

        if (role.equalsIgnoreCase("admin")) {
            location = "AdminLoginServlet.do";
        } else if (role.equalsIgnoreCase("student")) {
            location = "StudentLoginServlet.do";
        } else if (role.equalsIgnoreCase("studentAdmin")) {
            location = "StudentAdminLoginServlet.do";
        } else if (role.equalsIgnoreCase("security")) {
            location = "SecurityLoginServlet.do";
        }

        setValuesToSession(session, findUserById, password,role);

        response.sendRedirect(location);
    }

    private void setValuesToSession(HttpSession session, Long findUserById,String password, String role) {

        session.setAttribute("findUserById", findUserById.toString());
        session.setAttribute("password", password);
        session.setAttribute("role", role);
    }

}
