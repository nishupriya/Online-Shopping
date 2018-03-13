import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class Cart extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        
        HttpSession ses = req.getSession();//establishing session
        String email = (String)ses.getAttribute("email");//getAttribute() to get the value of the session value
        
        if(email==null)
        {
            
            pw1.printf("Please <a href=\"login.jsp\">login</a> first");
            //res.sendRedirect("login.jsp"); 
        }
        else
        {
            String pid = req.getParameter("pid");
            Float prc = Float.parseFloat(req.getParameter("price"));
            int qty = 0;
            
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                //connection with the child databasae(kd,password) by giving fulll path to the database
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface

                Statement stmt = con.createStatement();//creating a statement reference required to execute a query
                String q1 = "select * from cart where usrid='"+email+"' and pid='"+pid+"'";
                ResultSet rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value
                if(rs.next())   //product already in cart
                {
                       qty = rs.getInt("qty") + 1;
                       //pw1.println("Qty : "+qty);
                       Statement stmt1 = con.createStatement();//creating a statement reference required to execute a query
                       String q2 = "update cart set qty="+qty+" where usrid='"+email+"' and pid="+pid;
                       int x = stmt1.executeUpdate(q2);//if query runs sucessfully it gives a +ve value
                       if(x>0)   //user exist
                       {
                            //qty = rs.getInt(pid);
                            pw1.println("Your item has been successfully added to you cart.<br/>"
                                    + "Click <a href=\"cart.jsp\">here</a> to view your cart");
                       }
                }
                else//product not in cart
                {
                    qty = 1;
                    //inserting into the cart

                    Statement stmt1 = con.createStatement();//creating a statement reference required to execute a query
                    String q2 = "insert into cart values('"+email+"',"+pid+","+qty+","+qty*prc+")";
                    int x = stmt.executeUpdate(q2);//if query runs sucessfully it gives a +ve value
                    if(x>0)   //user exist
                    {
                           pw1.println("Your item has been successfully added to you cart."
                                    + "Click <a href=\"cart.jsp\">here</a> to view your cart");
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
}
