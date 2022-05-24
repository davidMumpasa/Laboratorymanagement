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
import za.ac.tut.entities.LaboratoryUser;
import za.ac.tut.entities.Security;


/**
 *
 * @author hp
 */
public class AddSecurityServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Long userId = Long.parseLong(request.getParameter("UserId"));
        String name = request.getParameter("name");
        String email =  request.getParameter("email");
        Integer phoneNum = Integer.parseInt(request.getParameter("phoneNum"));
        String password = request.getParameter("password");
        String workerType =  request.getParameter("workerType");
        String role ="security";

        LaboratoryUser security = createSecurity(userId, role, name, email, phoneNum, password, workerType);
        userFacade.AddUser(security);

        RequestDispatcher disp = request.getRequestDispatcher("index.html");
        disp.forward(request, response); 
    }

    private LaboratoryUser createSecurity(Long userId, String role, String name, String email, Integer phoneNum, String password, String workerType) {

        Security security = new Security();

        security.setUserId(userId);
        security.setName(name);
        security.setEmail(email);
        security.setPhoneNum(phoneNum);
        security.setPassword(password);
        security.setRole(role);
        security.setWorkerType(workerType);

        return security;
    }

}
