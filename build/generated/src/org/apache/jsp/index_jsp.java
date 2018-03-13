package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("author: W3layouts\n");
      out.write("author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("</head>\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("<!-- header -->\n");
      out.write("    ");

        String name="";
    
      out.write("\n");
      out.write("    ");

        HttpSession ses = request.getSession();//establishing session
        String email = (String)ses.getAttribute("email");//getAttribute() to get the value of the session value
        
        if(ses.getAttribute("email")!=null)//user logged in
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","password");//Connection is an interface
                                                    
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            String q1 = "select * from customer where email='"+email+"'";
            ResultSet rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value
            
            if(rs.next())   //
            {
                   name = rs.getString("cname");
                
            }
       }
        
       
    
      out.write("\n");
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
      out.write("\t\t\t<form action=\"cart.jsp\" method=\"post\" class=\"last\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\n");
      out.write("                                <input type=\"hidden\" name=\"display\" value=\"1\" />\n");
      out.write("                                <input type=\"submit\" name=\"submit\" value=\"View your cart\" class=\"button\" />\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3l_header_right\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"dropdown profile_details_drop\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                            ");

                                                if(email!=null)
                                                    out.print(name);
                                            
      out.write("\n");
      out.write("                                                                                       \n");
      out.write("                                            <i class=\"fa fa-user\" aria-hidden=\"true\"></i><span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t<div class=\"mega-dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3ls_vegetables\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu drp-mnu\">\n");
      out.write("                                                            \n");
      out.write("                                                            ");

                                                                if(ses.getAttribute("email")==null)//user not logged in
                                                                {
                                                                    
      out.write("\n");
      out.write("                                                                    <li><a href=\"login.jsp\">Login</a></li> \n");
      out.write("                                                                     <li><a href=\"login.jsp\">Sign Up</a></li>\n");
      out.write("                                                                     ");

                                                                }
                                                                else                //user logged in
                                                                {
                                                                    
      out.write("\n");
      out.write("                                                                    <li><a href=\"Logout\">Logout</a></li>\n");
      out.write("                                                                    ");

                                                                }
                                                                
                                                            
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>                  \n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
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
      out.write("                            <h1><a href=\"index.jsp\"><span></span><img src=\"images/logo.jpeg\" height=\"100\" width=\"170\"></a></h1>\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"furniture.jsp\">Furniture</a></li>\n");
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
      out.write("\t\t\t<section class=\"slider\">\n");
      out.write("\t\t\t\t<div class=\"flexslider\">\n");
      out.write("\t\t\t\t\t<ul class=\"slides\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3l_banner_nav_right_banner\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3l_banner_nav_right_banner1\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3l_banner_nav_right_banner2\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>upto <i>50%</i> off.</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- flexSlider -->\n");
      out.write("\t\t\t\t<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" />\n");
      out.write("\t\t\t\t<script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t$(window).load(function(){\n");
      out.write("\t\t\t\t  $('.flexslider').flexslider({\n");
      out.write("\t\t\t\t\tanimation: \"slide\",\n");
      out.write("\t\t\t\t\tstart: function(slider){\n");
      out.write("\t\t\t\t\t  $('body').removeClass('loading');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t  });\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t  </script>\n");
      out.write("\t\t\t<!-- //flexSlider -->\n");
      out.write("\t\t<div class=\"col-md-4 w3l_banner_nav_right_banner3_btml\">\n");
      out.write("\t\t\t\t\t<div class=\"view view-tenth\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/AA.jpg\" alt=\" \" class=\"img-responsive\" >\n");
      out.write("\t\t\t\t\t\t<div class=\"mask\">\n");
      out.write("                                                    <h4><a href=\"mens.jsp\">  Mens </a>,<a href=\"womens.jsp\"> Womens</a> & <a href=\"kids.jsp\">Kids</a></h4>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<h4>FASHION</h4>\n");
      out.write("\t\t\t\t\t<ol>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 w3l_banner_nav_right_banner3_btml\">\n");
      out.write("\t\t\t\t\t<div class=\"view view-tenth\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/LP1.jpeg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"mask\">\n");
      out.write("\t\t\t\t\t\t\t<h4><a href=\"electronic.jsp\">Electronics</a> &<a href=\"books.jsp\"> Books</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<h4>Acer aspire laptop</h4>\n");
      out.write("\t\t\t\t\t<ol>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 w3l_banner_nav_right_banner3_btml\">\n");
      out.write("\t\t\t\t\t<div class=\"view view-tenth\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/CC.jpeg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"mask\">\n");
      out.write("\t\t\t\t\t\t\t<h4><a href=\"home.jsp\">Home</a> &<a href=\"furnitures.jsp\"> Furniture</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<h4>FURNITURE</h4>\n");
      out.write("\t\t\t\t\t<ol>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("                \n");
      out.write("\t</div>\n");
      out.write("<!-- banner -->\n");
      out.write("\t<div class=\"banner_bottom\">\n");
      out.write("\t\t\t<div class=\"wthree_banner_bottom_left_grid_sub\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"wthree_banner_bottom_left_grid_sub1\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 wthree_banner_bottom_left\">\n");
      out.write("\t\t\t\t\t<div class=\"wthree_banner_bottom_left_grid\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/TT.jpeg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"wthree_banner_bottom_left_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 wthree_banner_bottom_left\">\n");
      out.write("\t\t\t\t\t<div class=\"wthree_banner_bottom_left_grid\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/PP.jpeg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"wthree_banner_btm_pos\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 wthree_banner_bottom_left\">\n");
      out.write("\t\t\t\t\t<div class=\"wthree_banner_bottom_left_grid\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/GK.jpeg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"wthree_banner_btm_pos1\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("<!-- top-brands -->\n");
      out.write("<!-- //top-brands -->\n");
      out.write("<!-- fresh-vegetables -->\n");
      out.write("<!-- //fresh-vegetables -->\n");
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
      out.write("\t\t\t\t\t<li><a href=\"pet.html\">Mens </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"frozen.html\">Womens </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"kitchen.html\">Electronics</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"products.html\">Kids </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"household.html\">Home</a></li>\n");
      out.write("                                        <li><a href=\"household.html\">furnitures</a></li>\n");
      out.write("                                        <li><a href=\"household.html\">Books</a></li>\n");
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
      out.write("\t\t\t\t<p>© 2016 Online Shopping. All rights reserved |</p>\n");
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
      out.write("</html>");
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
