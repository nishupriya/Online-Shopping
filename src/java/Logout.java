/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Executive
 */
public class Logout extends HttpServlet {
   
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        
       
        
       try
       {
           HttpSession ses = req.getSession();//session is created by the request by getSession() using class HttpSession
           ses.setAttribute("email",null);//session value is stored in the server side in the (name,value) pair
           
           res.sendRedirect("index.jsp");
       }
       catch(Exception e)
       {
           pw.println(e);
       }
    }
}
