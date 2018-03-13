<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import = "javax.servlet.http.*" %>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@ page import = "org.apache.commons.io.output.*" %>
<%@ page import = "java.sql.*" %>


<%
    
    File file ;
    String fileName = "";
   int maxFileSize = 5000 * 1024;
   int maxMemSize = 5000 * 1024;
   ServletContext context = pageContext.getServletContext();
   String filePath = context.getInitParameter("file-upload");

   // Verify the content type
   String contentType = request.getContentType();
   
   if ((contentType.indexOf("multipart/form-data") >= 0)) 
   {
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
         // Parse the request to get file items.
         List fileItems = upload.parseRequest(request);

         // Process the uploaded file items
         Iterator i = fileItems.iterator();

         out.println("<html>");
         out.println("<head>");
         out.println("<title>JSP File upload</title>");  
         out.println("</head>");
         out.println("<body>");
         
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
               //out.println("Uploaded Filename: " + filePath + fileName + "<br>");
            }
         }
         out.println("</body>");
         out.println("</html>");
      } catch(Exception ex) {
         System.out.println(ex);
      }
   } 
   else 
   {
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet upload</title>");  
      out.println("</head>");
      out.println("<body>");
      out.println("<p>Error: Image could not be uploaded. Click <a href=\"admin.jsp\">here</a> to go to admin home page.</p>"); 
      out.println("</body>");
      out.println("</html>");
   }
            //------------------updating image in the database--------------------//

            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                //connection with the child databasae(kd,password) by giving fulll path to the database
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
                
                //--incrementing pid--
                Statement stmt1 = con.createStatement();//creating a statement reference requestuired to execute a query
                String q2 = "select max(pid) from products";
                ResultSet rs = stmt1.executeQuery(q2);//if query runs successfully it gives a +ve value
                
                String pid ="";
                 if(rs.next())
                {
                    pid = rs.getString(1);
                }
                //----------------//
                
                Statement stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                String q1 = "update products set img ='"+filePath+fileName+"' where pid='"+pid+"' ";
                int x = stmt.executeUpdate(q1);//if query runs successfully it gives a +ve value
                
                //"insert into products values('"+pid"+','"+name+"',"+prc+",'"+filePath+fileName+"',"+rtng+",'"+sec+"','"+cat+"','"+desc+"')"
                
                if(x>0)
                {
                    out.println("Image has been uploaded Successfully<br/>");
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
%>