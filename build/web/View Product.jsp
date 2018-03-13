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
        <h1>Product Details</h1>
        <table border="2" cellspacing="0">
            <tr>
                <td>Image</td>
                <td>Product<br/>ID</td>
                <td>Product Name</td>
                <td>Price</td>
                <td>Rating</td>
                <td>Section</td>
                <td>Category</td>
                <td>Description</td>
                <td></td>
            </tr>
            <%
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                    //connection with the child databasae(kd,password) by giving fulll path to the database
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface

                    Statement stmt = con.createStatement();//creating a statement reference required to execute a query
                    String q1 = "select * from products";
                    ResultSet rs = stmt.executeQuery(q1);//if query runs successfully it gives a +ve value

                    while(rs.next())
                    {
                        String pid = rs.getString("pid");
                        String name = rs.getString("pname");
                        String prc = rs.getString("price");
                        String ig = rs.getString("img");
                        String rate = rs.getString("rating");
                        String sec = rs.getString("section");
                        String cat = rs.getString("category");
                        String des = rs.getString("description");
                        
                        %>
                            <tr>
                                <td><a href="product_details.jsp?pid=<%=pid %>"> <img src="<%=ig %>" height="30" width="30" /> </a> </td>
                                <td><% out.print(pid); %></td>
                                <td><a href="product_details.jsp?pid=<%=pid %>"><% out.print(name); %></a></td>
                                <td><% out.print(prc); %></td>
                                <td><% out.print(rate); %></td>
                                <td><% out.print(sec); %></td>
                                <td><% out.print(cat); %></td>
                                <td><% out.print(des); %></td>
                                <td><form method="get" action="DeleteProduct">
                                        <input type="hidden" name="pid" value="<%=pid %>" />
                                        <input type="submit" value="X" />
                                    </form></td>
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
