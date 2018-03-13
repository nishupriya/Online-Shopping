package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
  
            String oid = request.getParameter("oid");
            
            HttpSession ses = request.getSession();//establishing session
            String email = (String)ses.getAttribute("email");//getAttribute() to get the value of the session value
            out.print(email);
            
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                    //connection with the child databasae(kd,password) by giving fulll path to the database
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
                    
             
         
      out.write("\n");
      out.write("        <h1>My Cart</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Invoice No. :\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            1234\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Name :\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            Nistha\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Address : \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            fdxhgbknkvjh\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Contact No. :\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            12342345\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Email :\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            dchgj@esdxchgjb.com\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Item No.</td>\n");
      out.write("                <td>Item Name</td>\n");
      out.write("                <td>Price</td>\n");
      out.write("                <td>Quantity</td>\n");
      out.write("                <td>Amount</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td>Total</td>\n");
      out.write("                <td>1000</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <form action=\"BuyNow\" method=\"get\">\n");
      out.write("            <br/><br/><br/>\n");
      out.write("            <input type=\"submit\" value=\"Place Order\" />\n");
      out.write("        </form>\n");
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
