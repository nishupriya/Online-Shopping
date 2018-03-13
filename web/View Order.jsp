<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <li><a href="View Product.jsp"> View Product</a></li>
        <ul>
            <li><a href="add product.jsp">Add Products</a></li>
        </ul>
       <li><a href="View Order.jsp">View Order</a></li>
       <li><a href="View Customer.jsp">View Customer</a></li>
       <li><a href="Logout">Logout</a></li>
        <h1>Hello Customer</h1>
        <table border="2">
            <tr>
                <td>Customer emailD</td>
                <td>Name</td>
                <td>Password</td>
                <td>Contact</td>
                <td>Security Question</td>
                <td>Security Answer</td>
            </tr>
            <%
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                    //connection with the child databasae(kd,password) by giving fulll path to the database
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface

                    Statement stmt = con.createStatement();//creating a statement reference required to execute a query
                    String q1 = "select * from customer";
                    ResultSet rs = stmt.executeQuery(q1);//if query runs successfully it gives a +ve value

                    while(rs.next())
                    {
                        String email = rs.getString("email");
                        String name = rs.getString("cname");
                        String pwd = rs.getString("password");
                        String cno = rs.getString("contact");
                        String sq = rs.getString("sq");
                        String sqans = rs.getString("sans");
                        
                        %>
                            <tr>
                                <td><% out.print(email); %></td>
                                <td><% out.print(name); %></td>
                                <td><% out.print(pwd); %></td>
                                <td><% out.print(cno); %></td>
                                <td><% out.print(sq); %></td>
                                <td><% out.print(sqans); %></td>
                            </tr>
                        <%
                    }
                    con.close();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            %>
        </table>
        
    </body>
</html>
