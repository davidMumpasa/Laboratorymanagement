/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.studentadmin;

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
import za.ac.tut.business.StudentAdminFacadeLocal;
import za.ac.tut.entities.StudentAdmin;

/**
 *
 * @author hp
 */
public class DeleteStudentAdminServlet extends HttpServlet {

    @EJB
    private StudentAdminFacadeLocal studentAdminFacade;

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        Long userId = Long.parseLong(request.getParameter("userId"));
        
        
        StudentAdmin studAd = studentAdminFacade.findStudentAdmin(userId);
        studentAdminFacade.removeStudentAdmin(studAd);
        
        List<StudentAdmin> DeletedStudentAdmins = new ArrayList();
        DeletedStudentAdmins = studentAdminFacade.findAllStudentAdmin();
        
        request.setAttribute("DeletedStudentAdmins", DeletedStudentAdmins);
        
        
        RequestDispatcher disp = request.getRequestDispatcher("DeleteStudentAdminJsp.jsp");
        disp.forward(request, response);
        
    }

    
}
