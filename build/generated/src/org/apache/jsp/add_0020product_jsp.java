package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_0020product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Adding Product</h1>\n");
      out.write("        <form action=\"add product1.jsp\" method=\"get\">\n");
      out.write("\t\t\t\t\t  <input type=\"text\" name=\"name\" placeholder=\"Name\" required=\" \"><br/><br/>\n");
      out.write("                                          <input type=\"text\" name=\"price\" placeholder=\"Price\" required=\" \"><br/><br/>\n");
      out.write("\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t  Rating\n");
      out.write("                                          <select name=\"rating\">\n");
      out.write("\t\t\t\t\t\t<option value=\"null\">----Select-----</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("                                                <option value=\"3\">3</option>\n");
      out.write("                                                <option value=\"4\">4</option>\n");
      out.write("                                                <option value=\"5\">5</option>\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                          </select>\n");
      out.write("                                          <br/><br/>\n");
      out.write("\t\t\t\t\t  \n");
      out.write("                                          Section\n");
      out.write("                                          <select name=\"section\">\n");
      out.write("\t\t\t\t\t\t<option value=\"null\">----Select-----</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"mens\">Mens</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"womens\">Womens</option>\n");
      out.write("                                                <option value=\"kids\">Kids</option>\n");
      out.write("                                                <option value=\"home\">Home</option>\n");
      out.write("                                                <option value=\"furnitures\">Furnitures</option>\n");
      out.write("                                                <option value=\"books\">Books</option>\n");
      out.write("                                                \n");
      out.write("                                          </select><br/><br/>\n");
      out.write("                                           Category\n");
      out.write("                                          <select name=\"category\">\n");
      out.write("\t\t\t\t\t\t<option value=\"null\">----Select-----</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">Clothing</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">Footwear</option>\n");
      out.write("                                                <option value=\"3\">Watches</option>\n");
      out.write("                                                \n");
      out.write("                                                <option value=\"1\">Laptops</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">Mobiles</option>\n");
      out.write("                                                <option value=\"3\">Accessories</option>\n");
      out.write("                                                \n");
      out.write("                                                <option value=\"1\">Cleaning</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">Utensils</option>\n");
      out.write("                                                <option value=\"3\">Furnishing</option>\n");
      out.write("                                                \n");
      out.write("                                                <option value=\"1\">Bedroom</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">Drawing Room</option>\n");
      out.write("                                                <option value=\"3\">Others</option>\n");
      out.write("                                               \n");
      out.write("                                                <option value=\"1\">Children's Books</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">Entrance Books</option>\n");
      out.write("                                                <option value=\"3\">Stories Books</option>                                        \n");
      out.write("                                                                  \n");
      out.write("                                                                                                \n");
      out.write("                                          </select><br/><br/>\n");
      out.write("                                         \n");
      out.write("                                          \n");
      out.write("                                          \n");
      out.write("                                          <input type=\"text\" name=\"description\" placeholder=\"Description\" required=\" \"><br/><br/>\n");
      out.write("\t\t\t\t\t  <input type=\"submit\" value=\"Submit\"><br/><br/>\n");
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
