/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author hp
 */
public class FindAllStudent extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentFacade;

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
          HttpSession session = request.getSession();
        
        List<Student> Students = new ArrayList();
        
        Students = studentFacade.findAllStudents();
        
        session.setAttribute("Students", Students);
        
        RequestDispatcher disp = request.getRequestDispatcher("ViewAllStudentsJsp.jsp");
        disp.forward(request, response);
        
    }

}
