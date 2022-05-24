/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.student;

import java.io.IOException;
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
public class EditStudentServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentFacade;

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession session = request.getSession();

        Long userId = Long.parseLong(request.getParameter("userId"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Integer phoneNum = Integer.parseInt(request.getParameter("phoneNum"));
        String password = request.getParameter("password");
        String campus = request.getParameter("campus");
 
        Student student = studentFacade.findStudent(userId);

        student = editStudent(student, userId, name, email, phoneNum, password, campus);

        studentFacade.editStudent(student);
        session.setAttribute("student", student);

        RequestDispatcher disp = request.getRequestDispatcher("EditStudentJsp.jsp");
        disp.forward(request, response);

    }

    private Student editStudent(Student student, Long userId, String name, String email, Integer phoneNum, String password, String campus) {

        student.setUserId(userId);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setPhoneNum(phoneNum);
        student.setCampus(campus);

        return student;
    }

 
}
