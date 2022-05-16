/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.admin;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.UserFacadeLocal;
import za.ac.tut.entities.Admin;
import za.ac.tut.entities.LaboratoryUser;

/**
 *
 * @author hp
 */
public class AddAdminServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        Long UserId = Long.parseLong((String) session.getAttribute("UserId"));
        String name = session.getAttribute("name").toString();
        String email =  session.getAttribute("email").toString();
        Integer phoneNum = Integer.parseInt((String) session.getAttribute("phoneNum"));
        String password = session.getAttribute("password").toString();
        String role = session.getAttribute("role").toString();
        String verification =  session.getAttribute("verification").toString();
        
        LaboratoryUser user = createAdmin(UserId, role, name, email, phoneNum, password,verification);
        userFacade.AddUser(user);
        
        RequestDispatcher disp = request.getRequestDispatcher("index.html");
        disp.forward(request, response);
        
    }

    private LaboratoryUser createAdmin(Long UserId, String role, String name, String email, Integer phoneNum, String password, String verification) {
        Admin admin = new Admin();
        
        admin.setUserId(UserId);
        admin.setName(name);
        admin.setEmail(email);
        admin.setPhoneNum(phoneNum);
        admin.setPassword(password);
        admin.setRole(role); 
        admin.setVerification(verification);
        
        return admin;
    }

     
}
