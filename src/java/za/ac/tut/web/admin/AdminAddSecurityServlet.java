/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.admin;

import java.io.IOException;
import java.io.PrintWriter;
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
import za.ac.tut.entities.StudentAdmin;

/**
 *
 * @author hp
 */
public class AdminAddSecurityServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Long UserId = Long.parseLong(request.getParameter("UserId"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Integer phoneNum = Integer.parseInt(request.getParameter("phoneNum"));
        String password = request.getParameter("password");
        String role = "student admin";
        String workerType = request.getParameter("workerType");

        LaboratoryUser security = createSecurity(UserId, role, name, email, phoneNum, password, workerType);
        userFacade.AddUser(security);

        request.setAttribute("security", security);

        RequestDispatcher disp = request.getRequestDispatcher("AdminAddSecurityOutcome.jsp");
        disp.forward(request, response);
    }

    private LaboratoryUser createSecurity(Long UserId, String role, String name, String email, Integer phoneNum, String password, String workerType) {

        Security security = new Security();

        security.setUserId(UserId);
        security.setName(name);
        security.setEmail(email);
        security.setPhoneNum(phoneNum);
        security.setPassword(password);
        security.setRole(role);
        security.setWorkerType(workerType);

        return security;
    }

}
