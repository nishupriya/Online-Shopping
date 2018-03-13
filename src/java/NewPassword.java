import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class NewPassword extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        
        String email = req.getParameter("email");
        String ans = req.getParameter("sans");//answer given by user
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
            
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            String q1 = "select * from customer where email='"+email+"'";
            ResultSet rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value

            if(rs.next())   //user exist
            {
                    String sqans = rs.getString("sans");//actual answer
                    //pw1.println(email + "-" + sqans + "-" + ans + "-");
                    if(ans.equals(sqans))   //user exist
                    {
                
                          pw1.println("<html><body>"
                                        +"<form method=post action=UpdatePassword>"
                                            +"Email : <input type=text name=email value="+email+" readonly/>"
                                            +"New Password : <input type=text name=newpwd />"
                                            +"<input type=\"submit\" value=\"Submit\" />"
                                        + "</form>"
                                    + "</body></html>");
                
                    }
                    else
                    {
                        pw1.println("Answer did not match");
                    }
            }
            else
                pw1.println("Invalid email");
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
