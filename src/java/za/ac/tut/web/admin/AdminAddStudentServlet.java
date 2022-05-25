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
import za.ac.tut.entities.LaboratoryUser;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.StudentAdmin;

/**
 *
 * @author hp
 */
public class AdminAddStudentServlet extends HttpServlet {

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
        String password = "123";
        String role = "student";
        String campus = request.getParameter("campus");

        LaboratoryUser student = createStudent(UserId, role, name, email, phoneNum, password, campus);
        userFacade.AddUser(student);
        
        request.setAttribute("student", student);
        
        RequestDispatcher disp = request.getRequestDispatcher("AdminAddStudentOutcome.jsp");
        disp.forward(request, response);
    }

    private LaboratoryUser createStudent(Long UserId, String role, String name, String email, Integer phoneNum, String password, String campus) {

        Student student = new Student();

        student.setUserId(UserId);
        student.setName(name);
        student.setEmail(email);
        student.setPhoneNum(phoneNum);
        student.setPassword(password);
        student.setRole(role);
        student.setCampus(campus);

        return student;
    }

}
