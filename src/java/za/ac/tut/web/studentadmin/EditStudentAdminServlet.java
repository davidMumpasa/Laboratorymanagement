/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web.studentadmin;


import java.io.IOException;
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
public class EditStudentAdminServlet extends HttpServlet {

    @EJB
    private StudentAdminFacadeLocal studentAdminFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Long userId = Long.parseLong(request.getParameter("userId"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Integer phoneNum = Integer.parseInt(request.getParameter("phoneNum"));
        String password = request.getParameter("password");
        String subjectCode = request.getParameter("subjectCode");
 
        StudentAdmin studAd = studentAdminFacade.findStudentAdmin(userId);

        StudentAdmin studAdmin = editStudentAdmin(studAd, userId, name, email, phoneNum, password, subjectCode);

        studentAdminFacade.edit(studAdmin);
        session.setAttribute("studAdmin", studAdmin);

        RequestDispatcher disp = request.getRequestDispatcher("EditStudentAdminJsp.jsp");
        disp.forward(request, response);

    }

    private StudentAdmin editStudentAdmin(StudentAdmin studAd, Long userId, String name, String email, Integer phoneNum, String password, String subjectCode) {

        studAd.setUserId(userId);
        studAd.setName(name);
        studAd.setEmail(email);
        studAd.setPassword(password);
        studAd.setPhoneNum(phoneNum);
        studAd.setSubjectCode(subjectCode);

        return studAd;
    }

}
