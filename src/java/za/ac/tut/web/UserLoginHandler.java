/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Long findUserById = Long.parseLong(request.getParameter("findUserById"));
        String password = request.getParameter("password");
        String role1= request.getParameter("admin");
        String role2= request.getParameter("student");
        String role3= request.getParameter("studentAdmin");
        String role4= request.getParameter("security");
        
        String location = "SecurityLoginServlet.do";

        if (role1.equalsIgnoreCase("admin")) {
            location = "AdminLoginServlet.do";
        } else if (role2.equalsIgnoreCase("student")) {
            location = "StudentLoginServlet.do";
        } else if (role3.equalsIgnoreCase("student Admin")) {
            location = "StudentAdminLoginServlet.do";
        } else if (role3.equalsIgnoreCase("security")) {
            location = "SecurityLoginServlet.do";
        }

        setValuesToSession(session, findUserById,password);

        RequestDispatcher disp = request.getRequestDispatcher(location);
        disp.forward(request, response);
    }

    private void setValuesToSession(HttpSession session, Long findUserById,String password) {

        session.setAttribute("findUserById", findUserById.toString());
        session.setAttribute("password", password);
        
    }

}
