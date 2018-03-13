<%@ page import = "java.io.*,java.util.*, javax.servlet.*,java.sql.*" %>
<%@ page import = "javax.servlet.http.*" %>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@ page import = "org.apache.commons.io.output.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        
        
        <%
                
            
            String name = request.getParameter("name");
            String prc = request.getParameter("price");
            String rtng = request.getParameter("rating");
            String sec = request.getParameter("section");
            String cat = request.getParameter("category");
            String desc = request.getParameter("description");



            
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                //connection with the child databasae(kd,password) by giving fulll path to the database
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
                
                //--incrementing pid--
                Statement stmt1 = con.createStatement();//creating a statement reference requestuired to execute a query
                String q2 = "select ai_products.nextval from dual";
                ResultSet rs = stmt1.executeQuery(q2);//if query runs successfully it gives a +ve value
                
                String pid ="";
                 if(rs.next())
                {
                    pid = rs.getString(1);
                }
                //----------------//
                
                Statement stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                String q1 = "insert into products values('"+pid+"','"+name+"',"+prc+",'',"+rtng+",'"+sec+"','"+cat+"','"+desc+"')";
                int x = stmt.executeUpdate(q1);//if query runs successfully it gives a +ve value
                
                //"insert into products values('"+pid"+','"+name+"',"+prc+",'"+filePath+fileName+"',"+rtng+",'"+sec+"','"+cat+"','"+desc+"')"
                
                if(x>0)
                {
                    out.println("Product has been added Successfully<br/>Choose an image for the product from the buttton below<br/><br/>.");
                    out.println("<form action = \"insertimage.jsp\" method = \"post\" enctype = \"multipart/form-data\">"
                                    +"<input type = \"file\" name = \"file\" />"
                                    +"<br/>"
                                    +"<input type = \"submit\" value = \"Upload File\" />"
                                +" </form>");
                    
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
    </body>
</html>
