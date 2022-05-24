/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.security;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
public class DelSecurity extends HttpServlet {

    @EJB
    private SecurityFacadeLocal securityFacade;

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         HttpSession session = request.getSession();
        
        Long userId = Long.parseLong(request.getParameter("userId"));
        
        Security security = securityFacade.findSecurity(userId);
        securityFacade.removeSecurity(security);
        
        List<Security> DeletedSecurities = new ArrayList();
        DeletedSecurities = securityFacade.findAllSecurities();
        
        request.setAttribute("DeletedSecurities", DeletedSecurities);
        
        RequestDispatcher disp = request.getRequestDispatcher("DeleteSecurityJsp.jsp");
        disp.forward(request, response);
        
        
    }

    

}
