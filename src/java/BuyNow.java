import java.io.*;
import java.util.*;
import java.text.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class BuyNow extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        
        HttpSession ses = req.getSession();//establishing session
        String email = (String)ses.getAttribute("email");//getAttribute() to get the value of the session value
        String address = req.getParameter("address");
        
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        
        String date = ft.format(dNow);
                
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
            
            int fl = 0,oid = 0,itemno=0;
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            String q1 = "select * from cart where usrid='"+email+"'";
            ResultSet rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value
            
            Statement stmt1 = con.createStatement();//creating a statement reference requestuired to execute a query
            String q2 = "select ai_orders.nextval from dual";
            ResultSet rs1 = stmt1.executeQuery(q2);//if query runs successfully it gives a +ve value
            if(rs1.next())
            {
                oid = rs1.getInt(1);
            }
            while(rs.next())   //user exist
            {
                   //inserting data from cart into orders table
                   //--incrementing pid--
                
                int pid = rs.getInt("pid");
                int qty = rs.getInt("qty");
                Float amount = rs.getFloat("amount");
                                                             
                Statement stmt2 = con.createStatement();//creating a statement reference requestuired to execute a query
                String q3 = "insert into orders values("+oid+",'"+email+"',"+pid+","+qty+","+amount+",'"+address+"',"+(++itemno)+",'"+date+"')";
                int x = stmt2.executeUpdate(q3);//if query runs successfully it gives a +ve value
                
                if(x<0)
                {
                    fl = 1;
                    break;
                }
                
            }
            if(fl==1)
                pw1.println("Error occured while processing data.");
            else
            {
                Statement stmt3 = con.createStatement();//creating a statement reference required to execute a query
                String q4 = "delete from cart where usrid='"+email+"'";
                int y = stmt3.executeUpdate(q4);//if query runs sucessfully it gives a +ve value
                
                if(y>0)
                {
                    pw1.println("Your order has been placed successfully.<br/>Click <a href=\"invoice.jsp?oid="+oid+" \">here</a> to continue.");
                }
            }
            
            
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
