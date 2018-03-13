import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        String email = req.getParameter("email");
        String passwd = req.getParameter("passwd");
        if(email.equals("admin@fiddlestick.com")&& passwd.equals("123456") )
        {
           HttpSession ses = req.getSession();//session is created by the request by getSession() using class HttpSession
           ses.setAttribute("email",email);//session value is stored in the server side in the (name,value) pair
            res.sendRedirect("admin.jsp"); 
        }
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            String q1 = "select * from customer where email='"+email+"' and password='"+passwd+"'";
            ResultSet rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value
            if(rs.next())   //user exist
            {
                   HttpSession ses = req.getSession();//session is created by the request by getSession() using class HttpSession
                   ses.setAttribute("email",email);//session value is stored in the server side in the (name,value) pair
                   res.sendRedirect("index.jsp");
                
            }
            else
                pw1.println("Invalid email or password");
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
