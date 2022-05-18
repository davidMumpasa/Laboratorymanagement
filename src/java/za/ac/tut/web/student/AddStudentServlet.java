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
import za.ac.tut.business.UserFacadeLocal;
import za.ac.tut.entities.LaboratoryUser;
import za.ac.tut.entities.Student;

/**
 *
 * @author hp
 */
public class AddStudentServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Long UserId = Long.parseLong((String) session.getAttribute("UserId"));
        String name = session.getAttribute("name").toString();
        String email = session.getAttribute("email").toString();
        Integer phoneNum = Integer.parseInt((String) session.getAttribute("phoneNum"));
        String password = session.getAttribute("password").toString();
        String role = session.getAttribute("role").toString();
        String campus = session.getAttribute("campus").toString();

        LaboratoryUser student = createStudent(UserId, role, name, email, phoneNum, password, campus);
        userFacade.AddUser(student);
        
        RequestDispatcher disp = request.getRequestDispatcher("index.html");
        disp.forward(request, response);
    }

    private LaboratoryUser createStudent(Long UserId, String role, String name, String email, Integer phoneNum, String password, String campus) {

        Student student = new Student();

        student.setUserId(UserId);
        student.setName(name);
        student.setEmail(email);
        student.setPhoneNum(phoneNum);
        student.setPassword(password);
        student.setCampus(campus);

        
        return student;
    }

}
