package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Online Shopping - FirstBuy</title>\n");
      out.write("<!-- for-mobile-apps -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- font-awesome icons -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /> \n");
      out.write("<!-- //font-awesome icons -->\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    img.img-responsive{\n");
      out.write("        height: 200px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("    ");

      HttpSession ses = request.getSession();//establishing session
      String email = (String)ses.getAttribute("email");//getAttribute() to get the value of the session value
      
       Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                //connection with the child databasae(kd,password) by giving fulll path to the database
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
      
      String pname = "";
      Float prc = (float)0;
      String img = "";
      int rtng = 0;
      String sec = "";
      String cat = "";
      String desc = "";
    
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write("\t<div class=\"agileits_header\">\n");
      out.write("\t\t<div class=\"w3l_offers\">\n");
      out.write("\t\t\t<a href=\"products.html\">Today's special Offers !</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3l_search\">\n");
      out.write("\t\t\t<form action=\"search_results.jsp\" method=\"get\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"query\" value=\"Search a product...\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search a product...';}\" required=\"\">\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\" \">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"product_list_header\">  \n");
      out.write("\t\t\t<form action=\"#\" method=\"post\" class=\"last\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\n");
      out.write("                    <input type=\"hidden\" name=\"display\" value=\"1\" />\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"View your cart\" class=\"button\" />\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3l_header_right\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"dropdown profile_details_drop\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i><span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t<div class=\"mega-dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3ls_vegetables\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu drp-mnu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">Login</a></li> \n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">Sign Up</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>                  \n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3l_header_right1\">\n");
      out.write("\t\t\t<h2><a href=\"mail.html\">Contact Us</a></h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("<!-- script-for sticky-nav -->\n");
      out.write("\t<script>\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t var navoffeset=$(\".agileits_header\").offset().top;\n");
      out.write("\t\t $(window).scroll(function(){\n");
      out.write("\t\t\tvar scrollpos=$(window).scrollTop(); \n");
      out.write("\t\t\tif(scrollpos >=navoffeset){\n");
      out.write("\t\t\t\t$(\".agileits_header\").addClass(\"fixed\");\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$(\".agileits_header\").removeClass(\"fixed\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t });\n");
      out.write("\t\t \n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //script-for sticky-nav -->\n");
      out.write("\t<div class=\"logo_products\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left\">\n");
      out.write("\t\t\t\t<h1><a href=\"index.jsp\"><img src=\"images/logo.jpeg\" height=\"100\" width=\"170\"></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left1\">\n");
      out.write("\t\t\t\t<ul class=\"special_items\">\n");
      out.write("\t\t\t\t\t<li><a href=\"events.html\">Events</a><i>/</i></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\">About Us</a><i>/</i></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"products.html\">Best Deals</a><i>/</i></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"services.html\">Services</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left1\">\n");
      out.write("\t\t\t\t<ul class=\"phone_email\">\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>(+0123) 234 567</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a href=\"mailto:store@grocery.com\">store@grocery.com</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //header -->\n");
      out.write("<!-- products-breadcrumb -->\n");
      out.write("\t<div class=\"products-breadcrumb\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><i class=\"fa fa-home\" aria-hidden=\"true\"></i><a href=\"index.jsp\">Home</a><span>|</span></li>\n");
      out.write("\t\t\t\t<li>Womens</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //products-breadcrumb -->\n");
      out.write("<!-- banner -->\n");
      out.write("\t<div class=\"banner\">\n");
      out.write("\t\t<div class=\"w3l_banner_nav_left\">\n");
      out.write("\t\t\t<nav class=\"navbar nav_bottom\">\n");
      out.write("\t\t\t <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t  <div class=\"navbar-header nav_2\">\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t  </button>\n");
      out.write("\t\t\t   </div> \n");
      out.write("\t\t\t   <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav nav_1\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"mens.jsp\">Mens</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"womens.jsp\">Womens</a></li>\n");
      out.write("                                                <li><a href=\"kids.jsp\">Kids</a></li>\n");
      out.write("                                                <li><a href=\"electronics.jsp\">Electronics</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown mega-dropdown active\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Home and Furnitures <span class=\"caret\"></span></a>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-menu mega-dropdown-menu w3ls_vegetables_menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3ls_vegetables\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"furnitures.jsp\">Furniture</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>                  \n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                <li><a href=\"books.jsp\">Books</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t </div><!-- /.navbar-collapse -->\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3l_banner_nav_right\">\n");
      out.write("\t\t\t<div class=\"w3l_banner_nav_right_banner4\">\n");
      out.write("                            <br/><br/><br/><br/><br/>\n");
      out.write("\t\t\t\t<h3>Best Deals For New Products<span class=\"blink_me\"></span></h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3ls_w3l_banner_nav_right_grid w3ls_w3l_banner_nav_right_grid_sub\">\n");
      out.write("\t\t\t\t<h3>HOME</h3>\n");
      out.write("\t\t\t\t<div class=\"w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg\">\n");
      out.write("                                    <h6>Cleaning</h6>\n");
      out.write("                                    ");

                                        Statement stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                                        String q1 = "select pid from products where section='home' and category='1' and rownum<=4";
                                        ResultSet rs = stmt.executeQuery(q1);//if query runs successfully it gives a +ve value
                                        
                                        String pid = "";
                                        while(rs.next())
                                        {                                            
                                            pid = rs.getString(1);
                                            
                                            Statement stmt1 = con.createStatement();//creating a statement reference requestuired to execute a query
                                            String q2 = "select * from products where pid='"+pid+"'";
                                            ResultSet rs1 = stmt1.executeQuery(q2);//if query runs successfully it gives a +ve value
                                            
                                            if(rs1.next())
                                            {
                                                pname = rs1.getString("pname");
                                                prc = Float.parseFloat(rs1.getString("price"));
                                                img = rs1.getString("img");
                                                rtng = Integer.parseInt(rs1.getString("rating"));
                                                sec = rs1.getString("section");
                                                cat = rs1.getString("category");
                                                desc = rs1.getString("description");
                                            }
                                             
      out.write("\n");
      out.write("                                            <div class=\"col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hover14 column\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_top_brand_left_grid w3l_agile_top_brand_left_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"agile_top_brand_left_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t                                                        <div class=\"agile_top_brand_left_grid1\">\n");
      out.write("\t\t\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"snipcart-item block\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"snipcart-thumb\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_details.jsp?pid=");
      out.print(pid );
      out.write("\">\n");
      out.write("                                                                                            <img src=\"");
      out.print(img );
      out.write("\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("                                                                                        </a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
 out.print(pname); 
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>RS.");
 out.print(prc); 
      out.write("<span>Rs. ");
 out.print(prc + prc*.2); 
      out.write("</span></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"snipcart-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"add\" value=\"1\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"business\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"item_name\" value=\"Shirt\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"amount\" value=\"");
      out.print(prc );
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"discount_amount\" value=\"");
      out.print( prc*.2 );
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"currency_code\" value=\"Rs\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"return\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cancel_return\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Buy Now\" class=\"button\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");

                                        }//if ends here
                                    
      out.write("\n");
      out.write("                                        <!-----individual products start here ----->\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                <div class=\"w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg\">\n");
      out.write("                                    <h6>Utensils</h6>\n");
      out.write("                                    ");

                                        stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                                        q1 = "select pid from products where section='home' and category='2' and rownum<=4";
                                        rs = stmt.executeQuery(q1);//if query runs successfully it gives a +ve value
                                        
                                        pid = "";
                                        while(rs.next())
                                        {                                            
                                            pid = rs.getString(1);
                                            
                                            Statement stmt1 = con.createStatement();//creating a statement reference requestuired to execute a query
                                            String q2 = "select * from products where pid='"+pid+"'";
                                            ResultSet rs1 = stmt1.executeQuery(q2);//if query runs successfully it gives a +ve value
                                            
                                            if(rs1.next())
                                            {
                                                pname = rs1.getString("pname");
                                                prc = Float.parseFloat(rs1.getString("price"));
                                                img = rs1.getString("img");
                                                rtng = Integer.parseInt(rs1.getString("rating"));
                                                sec = rs1.getString("section");
                                                cat = rs1.getString("category");
                                                desc = rs1.getString("description");
                                            }
                                             
      out.write("\n");
      out.write("                                            <div class=\"col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hover14 column\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_top_brand_left_grid w3l_agile_top_brand_left_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"agile_top_brand_left_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t                                                        <div class=\"agile_top_brand_left_grid1\">\n");
      out.write("\t\t\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"snipcart-item block\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"snipcart-thumb\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_details.jsp?pid=");
      out.print(pid );
      out.write("\"><img src=\"");
      out.print(img );
      out.write("\" alt=\" \" class=\"img-responsive\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
 out.print(pname); 
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>RS.");
 out.print(prc); 
      out.write("<span>Rs. ");
 out.print(prc + prc*.2); 
      out.write("</span></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"snipcart-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"add\" value=\"1\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"business\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"item_name\" value=\"Shirt\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"amount\" value=\"");
      out.print(prc );
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"discount_amount\" value=\"");
      out.print( prc*.2 );
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"currency_code\" value=\"USD\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"return\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cancel_return\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Buy Now\" class=\"button\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");

                                        }//if ends here
                                    
      out.write("\n");
      out.write("                                        <!-----individual products start here ----->\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                <div class=\"w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg\">\n");
      out.write("                                    <h6>Furnishes</h6>\n");
      out.write("                                    ");

                                        stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                                        q1 = "select pid from products where section='home' and category='3' and rownum<=4";
                                        rs = stmt.executeQuery(q1);//if query runs successfully it gives a +ve value
                                        
                                        pid = "";
                                        while(rs.next())
                                        {                                            
                                            pid = rs.getString(1);
                                            
                                            Statement stmt1 = con.createStatement();//creating a statement reference requestuired to execute a query
                                            String q2 = "select * from products where pid='"+pid+"'";
                                            ResultSet rs1 = stmt1.executeQuery(q2);//if query runs successfully it gives a +ve value
                                            
                                            if(rs1.next())
                                            {
                                                pname = rs1.getString("pname");
                                                prc = Float.parseFloat(rs1.getString("price"));
                                                img = rs1.getString("img");
                                                rtng = Integer.parseInt(rs1.getString("rating"));
                                                sec = rs1.getString("section");
                                                cat = rs1.getString("category");
                                                desc = rs1.getString("description");
                                            }
                                             
      out.write("\n");
      out.write("                                            <div class=\"col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hover14 column\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_top_brand_left_grid w3l_agile_top_brand_left_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"agile_top_brand_left_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t                                                        <div class=\"agile_top_brand_left_grid1\">\n");
      out.write("\t\t\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"snipcart-item block\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"snipcart-thumb\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_details.jsp?pid=");
      out.print(pid );
      out.write("\"><img src=\"");
      out.print(img );
      out.write("\" alt=\" \" class=\"img-responsive\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
 out.print(pname); 
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>RS.");
 out.print(prc); 
      out.write("<span>Rs. ");
 out.print(prc + prc*.2); 
      out.write("</span></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"snipcart-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"add\" value=\"1\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"business\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"item_name\" value=\"Shirt\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"amount\" value=\"");
      out.print(prc );
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"discount_amount\" value=\"");
      out.print( prc*.2 );
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"currency_code\" value=\"USD\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"return\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cancel_return\" value=\" \" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Buy Now\" class=\"button\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");

                                        }//if ends here
                                    
      out.write("\n");
      out.write("                                        <!-----individual products start here ----->\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner -->\n");
      out.write("<!-- newsletter -->\n");
      out.write("\t<div class=\"newsletter\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3agile_newsletter_left\">\n");
      out.write("\t\t\t\t<h3>sign up for our newsletter</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3agile_newsletter_right\">\n");
      out.write("\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"Email\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\" required=\"\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"subscribe now\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //newsletter -->\n");
      out.write("<!-- footer -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t<h3>information</h3>\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\n");
      out.write("\t\t\t\t\t<li><a href=\"events.html\">Events</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\">About Us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"products.html\">Best Deals</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"services.html\">Services</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"short-codes.html\">Short Codes</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t<h3>policy info</h3>\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\n");
      out.write("\t\t\t\t\t<li><a href=\"faqs.html\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"privacy.html\">privacy policy</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"privacy.html\">terms of use</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t<h3>what in stores</h3>\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\n");
      out.write("\t\t\t\t\t<li><a href=\"pet.html\">Pet Food</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"frozen.html\">Frozen Snacks</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"kitchen.html\">Kitchen</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"products.html\">Branded Foods</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"household.html\">Households</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t<h3>twitter posts</h3>\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list1\">\n");
      out.write("\t\t\t\t\t<li><label class=\"fa fa-twitter\" aria-hidden=\"true\"></label><i>01 day ago</i><span>Non numquam <a href=\"#\">http://sd.ds/13jklf#</a>\n");
      out.write("\t\t\t\t\t\teius modi tempora incidunt ut labore et\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">http://sd.ds/1389kjklf#</a>quo nulla.</span></li>\n");
      out.write("\t\t\t\t\t<li><label class=\"fa fa-twitter\" aria-hidden=\"true\"></label><i>02 day ago</i><span>Con numquam <a href=\"#\">http://fd.uf/56hfg#</a>\n");
      out.write("\t\t\t\t\t\teius modi tempora incidunt ut labore et\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">http://fd.uf/56hfg#</a>quo nulla.</span></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t<div class=\"agile_footer_grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid agile_footer_grids_w3_footer\">\n");
      out.write("\t\t\t\t\t<div class=\"w3_footer_grid_bottom\">\n");
      out.write("\t\t\t\t\t\t<h4>100% secure payments</h4>\n");
      out.write("\t\t\t\t\t\t<img src=\"images/card.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid agile_footer_grids_w3_footer\">\n");
      out.write("\t\t\t\t\t<div class=\"w3_footer_grid_bottom\">\n");
      out.write("\t\t\t\t\t\t<h5>connect with us</h5>\n");
      out.write("\t\t\t\t\t\t<ul class=\"agileits_social_icons\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"google\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"dribbble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"wthree_footer_copy\">\n");
      out.write("\t\t\t\t<p>© 2016 Online Shopping. All rights reserved </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //footer -->\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\".dropdown\").hover(            \n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideDown(\"fast\");\n");
      out.write("            $(this).toggleClass('open');        \n");
      out.write("        },\n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideUp(\"fast\");\n");
      out.write("            $(this).toggleClass('open');       \n");
      out.write("        }\n");
      out.write("    );\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!-- here stars scrolling icon -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //here ends scrolling icon -->\n");
      out.write("<script src=\"js/minicart.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t// Mini Cart\n");
      out.write("\tpaypal.minicart.render({\n");
      out.write("\t\taction: '#'\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tif (~window.location.search.indexOf('reset=true')) {\n");
      out.write("\t\tpaypal.minicart.reset();\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html> \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
