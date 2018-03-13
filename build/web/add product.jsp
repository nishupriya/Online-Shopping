<%-- 
    Document   : add product
    Created on : May 11, 2017, 11:43:37 PM
    Author     : NISTHA PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Adding Product</h1>
        <form action="add product1.jsp" method="get">
					  <input type="text" name="name" placeholder="Name" required=" "><br/><br/>
                                          <input type="text" name="price" placeholder="Price" required=" "><br/><br/>
					  
					  Rating
                                          <select name="rating">
						<option value="null">----Select-----</option>
						<option value="1">1</option>
						<option value="2">2</option>
                                                <option value="3">3</option>
                                                <option value="4">4</option>
                                                <option value="5">5</option>
                                                
                                                
                                          </select>
                                          <br/><br/>
					  
                                          Section
                                          <select name="section">
						<option value="null">----Select-----</option>
						<option value="mens">Mens</option>
						<option value="womens">Womens</option>
                                                <option value="kids">Kids</option>
                                                <option value="electronics">Electronics</option>
                                                <option value="home">Home</option>
                                                <option value="furnitures">Furnitures</option>
                                                <option value="books">Books</option>
                                                
                                          </select><br/><br/>
                                           Category
                                          <select name="category">
						<option value="null">----Select-----</option>
						<option value="1">Clothing</option>
						<option value="2">Footwear</option>
                                                <option value="3">Watches</option
                                                
                                                <option value="1">Laptops</option>
                                                <option value="1">Laptops</option>
						<option value="2">Mobile</option>
                                                <option value="3">Accessories</option>
                                                
                                                <option value="1">Cleaning</option>
						<option value="2">Utensils</option>
                                                <option value="3">Furnishing</option>
                                                
                                                <option value="1">Bedroom</option>
						<option value="2">Drawing Room</option>
                                                <option value="3">Others</option>
                                               
                                                <option value="1">Children's Books</option>
						<option value="2">Entrance Books</option>
                                                <option value="3">Stories Books</option>
                                                <option value="3">Toys</option> 
                                                                  
                                                                                                
                                          </select><br/><br/>
                                         
                                          
                                          
                                          <input type="text" name="description" placeholder="Description" required=" "><br/><br/>
					  <input type="submit" value="Submit"><br/><br/>
    </body>
</html>
