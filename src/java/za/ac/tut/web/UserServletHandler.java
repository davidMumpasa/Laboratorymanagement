/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class UserServletHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        Long UserId = Long.parseLong(request.getParameter("UserId"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Integer phoneNum = Integer.parseInt(request.getParameter("phoneNum"));
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String verification = request.getParameter("verification");
        String campus = request.getParameter("campus");
        String subjectCode = request.getParameter("subjectCode");
        String workerType = request.getParameter("workerType");

        String location = "";
        
        if (role.equalsIgnoreCase("admin")) {
            location = "AddAdminServlet.do";
        } else if (role.equalsIgnoreCase("student")) {
            location = "AddStudentServlet.do";
        } else if (role.equalsIgnoreCase("student admin")) {
            location = "AddStudentAdminServlet.do";
        } else if (role.equalsIgnoreCase("security")){
            location = "AddSecurityServlet.do";
        }

        setValuesToSession(session, UserId, role, name, email, phoneNum, password, verification, campus, subjectCode, workerType);

        RequestDispatcher disp = request.getRequestDispatcher(location);
        disp.forward(request, response);
    }

    private void setValuesToSession(HttpSession session, Long UserId, String role, String name, String email, Integer phoneNum, String password, String verification, String campus, String subjectCode, String workerType) {

        session.setAttribute("UserId", UserId.toString());
        session.setAttribute("role", role);
        session.setAttribute("name", name);
        session.setAttribute("phoneNum", phoneNum.toString());
        session.setAttribute("email", email);
        session.setAttribute("password", password);
        session.setAttribute("verification", verification);
        session.setAttribute("campus", campus);
        session.setAttribute("subjectCode", subjectCode);
        session.setAttribute("workerType", workerType);
    }

}
