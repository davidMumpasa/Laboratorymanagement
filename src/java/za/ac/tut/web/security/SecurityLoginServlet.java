/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.security;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.UserFacadeLocal;

/**
 *
 * @author hp
 */
public class SecurityLoginServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

 
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         HttpSession session = request.getSession();

        Long findUserById = Long.parseLong(session.getAttribute("findUserById").toString());
        String password = session.getAttribute("password").toString();

        userFacade.findUser(findUserById);

        RequestDispatcher disp = request.getRequestDispatcher("SecurityHome.jsp");
        disp.forward(request, response);
        
    }
}
