/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.student;

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
import za.ac.tut.entities.Admin;
import za.ac.tut.entities.LaboratoryUser;
import za.ac.tut.entities.Student;

/**
 *
 * @author hp
 */
public class StudentLoginServlet extends HttpServlet {
    
    @EJB
    private UserFacadeLocal userFacade;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        Long findUserById = Long.parseLong(session.getAttribute("findUserById").toString());
        String password = session.getAttribute("password").toString();
        String role = session.getAttribute("role").toString();
        
        LaboratoryUser student = new Student();
        
        student = userFacade.findUser(findUserById);
        
        if (student.getPassword() == null ? password == null : student.getPassword().equals(password) && role.equals("student")) {
            RequestDispatcher disp = request.getRequestDispatcher("StudentHome.jsp");
            disp.forward(request, response);
        } else{
            RequestDispatcher disp = request.getRequestDispatcher("InvalidLoginJsp.jsp");
            disp.forward(request, response);
        }
        
    }
    
}
