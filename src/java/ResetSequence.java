import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResetSequence extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------
        */
        String seqName = req.getParameter("seq");
              
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
            
            Statement stmt1 = con.createStatement();//creating a statement reference required to execute a query
            String q1 = "select "+seqName+".nextval from dual";
            ResultSet rs1 = stmt1.executeQuery(q1);
            int val = 0;
            if(rs1.next())   //user exist
            {
                val = -rs1.getInt(1);
            }
            
            Statement stmt2 = con.createStatement();//creating a statement reference required to execute a query
            String q2 = "alter sequence "+seqName+" increment by "+val;
            
            if(stmt2.execute(q2))   //user exist
            {
                Statement stmt = con.createStatement();//creating a statement reference required to execute a query
                String q = "select "+seqName+".nextval from dual";
                ResultSet rs = stmt2.executeQuery(q);
                
                Statement stmt3 = con.createStatement();
                String q3 = "alter sequence "+seqName+" increment by 1";
                
                if(stmt3.execute(q3))
                {
                    pw1.println("Sequence has been reset");
                }
                else
                {
                    pw1.println("Sequence could not be reset");
                }
            }
            else
                pw1.println("Error");
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
