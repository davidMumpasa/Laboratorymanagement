package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;
import za.ac.tut.entities.StudentAdmin;
import java.util.List;

public final class ViewAllStuAdminsJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("\n");
      out.write("        ");

            List<StudentAdmin> StudentAdmins = new ArrayList();
            StudentAdmins = (List<StudentAdmin>) session.getAttribute("StudentAdmins");

            Long id = null;
            String name = "";
            String email = "";
            String password = "";
            Integer phoneNum = 0;
            String SubjectCode = "";
            int count = 0;
        
            for (StudentAdmin studAd : StudentAdmins) {
                id = studAd.getId();
                name = studAd.getName();
                email = studAd.getEmail();
                password = studAd.getPassword();
                phoneNum = studAd.getPhoneNum();
                SubjectCode = studAd.getSubjectCode();
                //count++;

        
      out.write("\n");
      out.write("\n");
      out.write("        <table bgcolor = \"black\">\n");
      out.write("\n");
      out.write("            <tr bgcolor =\"grey\" >\n");
      out.write("                <th>User Id: </th>\n");
      out.write("                <th>name: </th>\n");
      out.write("                <th>email: </th>\n");
      out.write("                <th>password: </th>\n");
      out.write("                <th>phone Number:</th>\n");
      out.write("                <th>Subject Code:</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor =\"lightgrey\">\n");
      out.write("                <td id=\"userId\">");
      out.print(id);
      out.write("</td>\n");
      out.write("                <td id=\"name\">");
      out.print(name);
      out.write("</td>\n");
      out.write("                <td id=\"email\">");
      out.print(email);
      out.write("</td>\n");
      out.write("                <td id=\"password\">");
      out.print(password);
      out.write("</td>\n");
      out.write("                <td id=\"phoneNum\">");
      out.print(phoneNum);
      out.write("</td>\n");
      out.write("                <td id=\"SubjectCode\">");
      out.print(SubjectCode);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"EditStudentAdminServlet.do\" method=\"Post\">\n");
      out.write("            <div><p>Which Student Administrator would you like to edit ?</p><br> Please enter the User Id:</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table  >\n");
      out.write("                <tr>\n");
      out.write("                    <td>User Number:</td>\n");
      out.write("                    <td ><input type=\"text\" name=\"userId\"/></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\"/></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\"/></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone Number:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"phoneNum\"/></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"password\"/></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>subject Code:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"subjectCode\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Edit\"/></td>\n");
      out.write("                </tr> \n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
