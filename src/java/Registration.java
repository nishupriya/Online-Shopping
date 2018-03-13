import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class Registration extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String passwd = req.getParameter("passwd");
        String cno = req.getParameter("contact");
        String sq = req.getParameter("sq");
        String sqans = req.getParameter("sqans");
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
            
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            String q1 = "insert into customer values('"+email+"','"+name+"','"+passwd+"',"+cno+",'"+sq+"','"+sqans+"')";
            int x = stmt.executeUpdate(q1);//if query runs successfully it gives a +ve value
            if(x>0)
            {
                pw1.println("Registration Successful");
            }
            else
            {
                pw1.println("Registration Unsuccessful");
            }
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
