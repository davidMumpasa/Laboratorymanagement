/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.security;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.SecurityFacadeLocal;
import za.ac.tut.entities.Security;
import za.ac.tut.entities.Student;

/**
 *
 * @author hp
 */
public class EditSecurityServlet extends HttpServlet {

    @EJB
    private SecurityFacadeLocal securityFacade;

    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    HttpSession session = request.getSession();

        Long userId = Long.parseLong(request.getParameter("userId"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Integer phoneNum = Integer.parseInt(request.getParameter("phoneNum"));
        String password = request.getParameter("password");
        String workerType = request.getParameter("workerType");
 
        Security security = securityFacade.findSecurity(userId);

        security = editSecurity(security, userId, name, email, phoneNum, password, workerType);

        securityFacade.editSecurity(security);
        session.setAttribute("security", security);

        RequestDispatcher disp = request.getRequestDispatcher("EditSecurityJsp.jsp");
        disp.forward(request, response);

    }

    private Security editSecurity(Security security, Long userId, String name, String email, Integer phoneNum, String password, String workerType) {

        security.setUserId(userId);
        security.setName(name);
        security.setEmail(email);
        security.setPassword(password);
        security.setPhoneNum(phoneNum);
        security.setWorkerType(workerType);

        return security;
    }


    
}
