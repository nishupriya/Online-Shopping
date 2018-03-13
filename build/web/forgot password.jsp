<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Online Shopping-FirstBuy</title>
        
    </head>
    <body>
        <%HttpSession ses = request.getSession();//establishing session
        String email = (String)ses.getAttribute("email");//getAttribute() to get the value of the session value%>
        <form method="post" name="" action="ForgotPassword">
                 Email : <input type="text" name="email"/>
                 <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
