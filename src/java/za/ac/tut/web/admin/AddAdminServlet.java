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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        Long UserId = Long.parseLong(request.getParameter("UserId"));
        String name = request.getParameter("name");
        String email =  request.getParameter("email");
        Integer phoneNum = Integer.parseInt(request.getParameter("phoneNum"));
        String password = request.getParameter("password");
        //String role = session.getAttribute("role").toString();
        String verification =  request.getParameter("verification");
        String role ="admin";
        
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
