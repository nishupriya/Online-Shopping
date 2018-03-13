package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.io.output.*;

public final class add_0020product1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

                
            
            String name = request.getParameter("name");
            float prc = Float.parseFloat(request.getParameter("price"));
            String img = request.getParameter("image");
            int rtng = Integer.parseInt(request.getParameter("rating"));
            String sec = request.getParameter("section");
            String cat = request.getParameter("category");
            String desc = request.getParameter("description");



            //code to upload image


            File file ;
            int maxFileSize = 5000 * 1024;
            int maxMemSize = 5000 * 1024;
            ServletContext context = pageContext.getServletContext();
            String filePath = context.getInitParameter("file-upload");
            String fileName = "";

            // Verify the content type
            String contentType = request.getContentType();

            if ((contentType.indexOf("multipart/form-data") >= 0)) {
               DiskFileItemFactory factory = new DiskFileItemFactory();
               // maximum size that will be stored in memory
               factory.setSizeThreshold(maxMemSize);

               // Location to save data that is larger than maxMemSize.
               factory.setRepository(new File("c:\\temp"));

               // Create a new file upload handler
               ServletFileUpload upload = new ServletFileUpload(factory);

               // maximum file size to be uploaded.
               upload.setSizeMax( maxFileSize );

               try { 
                  // Parse the requestuest to get file items.
                  List fileItems = upload.parseRequest(request);

                  // Process the uploaded file items
                  Iterator i = fileItems.iterator();

                  

                  while ( i.hasNext () ) {
                     FileItem fi = (FileItem)i.next();
                     if ( !fi.isFormField () ) {
                        // Get the uploaded file parameters
                        String fieldName = fi.getFieldName();
                        fileName = fi.getName();
                        boolean isInMemory = fi.isInMemory();
                        long sizeInBytes = fi.getSize();

                        // Write the file
                        if( fileName.lastIndexOf("\\") >= 0 ) {
                           file = new File( filePath + 
                           fileName.substring( fileName.lastIndexOf("\\"))) ;
                        } else {
                           file = new File( filePath + 
                           fileName.substring(fileName.lastIndexOf("\\")+1)) ;
                        }
                        fi.write( file ) ;
                        //out.println("Uploaded Filename: " + filePath + 
                        //fileName + "<br>");
                     }
                  }
               } catch(Exception ex) {
                  System.out.println(ex);
               }
            } else {
               //out.println("<html>");
               //out.println("<head>");
               //out.println("<title>Servlet upload</title>");  
               //out.println("</head>");
               //out.println("<body>");
               out.println("<p>No file uploaded</p>"); 
               //out.println("</body>");
               //out.println("</html>");
            }
            
            //image upload code ends ----------------url of image is filePath+fileName
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                //connection with the child databasae(kd,password) by giving fulll path to the database
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface

                Statement stmt1 = con.createStatement();//creating a statement reference requestuired to execute a query
                String q2 = "select ai_products.nextval from dual";
                 ResultSet rs = stmt1.executeQuery(q2);//if query runs successfully it gives a +ve value
                
                String pid ="";
                 if(rs.next())
                {
                    pid = rs.getString(1);
                }
                
                
                Statement stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                String q1 = "insert into products values('"+pid+"','"+name+"',"+prc+",'"+filePath+fileName+"',"+rtng+",'"+sec+"','"+cat+"','"+desc+"')";
                int x = stmt.executeUpdate(q1);//if query runs successfully it gives a +ve value
                
                //"insert into products values('"+pid"+','"+name+"',"+prc+",'"+filePath+fileName+"',"+rtng+",'"+sec+"','"+cat+"','"+desc+"')"
                
                if(x>0)
                {
                    out.println("Product has been added Successfully<br/>");
                    out.println("Click <a href=\"admin.jsp\">here</a> to go to admin home page");
                    
                }
                else
                {
                    out.println("Product could not be added due to some error");
                    out.println("Click <a href=\"admin.jsp\">here</a> to go to admin home page");
                }
                con.close();
            }
            catch(Exception e)
            {
                out.println(e);
            }
        
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
