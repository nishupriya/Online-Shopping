package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class View_0020Product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <li><a href=\"add product.jsp\">Add Products</a></li>\n");
      out.write("        </ul>\n");
      out.write("       <li><a href=\"View Order.jsp\">View Order</a></li>\n");
      out.write("       <li><a href=\"View Customer.jsp\">View Customer</a></li>\n");
      out.write("       <li><a href=\"Logout\">Logout</a></li>\n");
      out.write("        <h1>Product Details</h1>\n");
      out.write("        <table border=\"2\" cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Image</td>\n");
      out.write("                <td>Product<br/>ID</td>\n");
      out.write("                <td>Product Name</td>\n");
      out.write("                <td>Price</td>\n");
      out.write("                <td>Rating</td>\n");
      out.write("                <td>Section</td>\n");
      out.write("                <td>Category</td>\n");
      out.write("                <td>Description</td>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                    //connection with the child databasae(kd,password) by giving fulll path to the database
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface

                    Statement stmt = con.createStatement();//creating a statement reference required to execute a query
                    String q1 = "select * from products";
                    ResultSet rs = stmt.executeQuery(q1);//if query runs successfully it gives a +ve value

                    while(rs.next())
                    {
                        String pid = rs.getString("pid");
                        String name = rs.getString("pname");
                        String prc = rs.getString("price");
                        String ig = rs.getString("img");
                        String rate = rs.getString("rating");
                        String sec = rs.getString("section");
                        String cat = rs.getString("category");
                        String des = rs.getString("description");
                        
                        
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a href=\"product_details.jsp?pid=");
      out.print(pid );
      out.write("\"> <img src=\"");
      out.print(ig );
      out.write("\" height=\"30\" width=\"30\" /> </a> </td>\n");
      out.write("                                <td>");
 out.print(pid); 
      out.write("</td>\n");
      out.write("                                <td><a href=\"product_details.jsp?pid=");
      out.print(pid );
      out.write('"');
      out.write('>');
 out.print(name); 
      out.write("</a></td>\n");
      out.write("                                <td>");
 out.print(prc); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(rate); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(sec); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(cat); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(des); 
      out.write("</td>\n");
      out.write("                                <td><form method=\"get\" action=\"DeleteProduct\">\n");
      out.write("                                        <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(pid );
      out.write("\" />\n");
      out.write("                                        <input type=\"submit\" value=\"X\" />\n");
      out.write("                                    </form></td>\n");
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
