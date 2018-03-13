package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class View_0020Customer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <li><a href=\"View Product.jsp\"> View Product</a></li>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"add products.jsp\">Add Products</a></li>\n");
      out.write("        </ul>\n");
      out.write("       <li><a href=\"View Order.jsp\">View Order</a></li>\n");
      out.write("       <li><a href=\"View Customer.jsp\">View Customer</a></li>\n");
      out.write("       <li><a href=\"Logout\">Logout</a></li>\n");
      out.write("        <h1>Hello Customer</h1>\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Customer emailD</td>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td>Contact</td>\n");
      out.write("                <td>Security Question</td>\n");
      out.write("                <td>Security Answer</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                    //connection with the child databasae(kd,password) by giving fulll path to the database
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface

                    Statement stmt = con.createStatement();//creating a statement reference required to execute a query
                    String q1 = "select * from customer";
                    ResultSet rs = stmt.executeQuery(q1);//if query runs successfully it gives a +ve value

                    while(rs.next())
                    {
                        String email = rs.getString("email");
                        String name = rs.getString("cname");
                        String pwd = rs.getString("password");
                        String cno = rs.getString("contact");
                        String sq = rs.getString("sq");
                        String sqans = rs.getString("sans");
                        
                        
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
 out.print(email); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(name); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(pwd); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(cno); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(sq); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(sqans); 
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                        ");

                    }
                    con.close();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
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
