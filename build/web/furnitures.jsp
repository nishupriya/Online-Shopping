<%@ page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<title>Online Shopping - FirstBuy</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet" type="text/css" media="all" /> 
<!-- //font-awesome icons -->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<link href='//fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->

<style type="text/css">
    img.img-responsive{
        height: 200px;
    }
</style>




</head>
	
<body>
    <%
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
    %>
<!-- header -->
	<div class="agileits_header">
		<div class="w3l_offers">
			<a href="products.html">Today's special Offers !</a>
		</div>
		<div class="w3l_search">
			<form action="search_results.jsp" method="get">
				<input type="text" name="query" value="Search a product..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search a product...';}" required="">
				<input type="submit" value=" ">
			</form>
		</div>
		<div class="product_list_header">  
			<form action="cart.jsp" method="post" class="last">
                            <fieldset>
                                <input type="hidden" name="cmd" value="_cart" />
                                <input type="hidden" name="display" value="1" />
                                <input type="submit" name="submit" value="View your cart" class="button" />
                            </fieldset>
                        </form>
		</div>
		<div class="w3l_header_right">
			<ul>
				<li class="dropdown profile_details_drop">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                            <%
                                                if(email!=null)
                                                    out.print(email);
                                            %>
                                            <i class="fa fa-user" aria-hidden="true"></i><span class="caret"></span></a>
					<div class="mega-dropdown-menu">
						<div class="w3ls_vegetables">
							<ul class="dropdown-menu drp-mnu">
								<%
                                                                if(ses.getAttribute("email")==null)//user not logged in
                                                                {
                                                                    %>
                                                                    <li><a href="login.jsp">Login</a></li> 
                                                                     <li><a href="login.jsp">Sign Up</a></li>
                                                                     <%
                                                                }
                                                                else                //user logged in
                                                                {
                                                                    %>
                                                                    <li><a href="Logout">Logout</a></li>
                                                                    <%
                                                                }
                                                                
                                                            %>
							</ul>
						</div>                  
					</div>	
				</li>
			</ul>
		</div>
		<div class="clearfix"> </div>
	</div>
<!-- script-for sticky-nav -->
	<script>
	$(document).ready(function() {
		 var navoffeset=$(".agileits_header").offset().top;
		 $(window).scroll(function(){
			var scrollpos=$(window).scrollTop(); 
			if(scrollpos >=navoffeset){
				$(".agileits_header").addClass("fixed");
			}else{
				$(".agileits_header").removeClass("fixed");
			}
		 });
		 
	});
	</script>
<!-- //script-for sticky-nav -->
	<div class="logo_products">
		<div class="container">
			<div class="w3ls_logo_products_left">
				<h1><a href="index.jsp"><img src="images/logo.jpeg" height="100" width="170"></h1>
			</div>
			<div class="w3ls_logo_products_left1">
				<ul class="special_items">
					<li><a href="events.html">Events</a><i>/</i></li>
					<li><a href="about.html">About Us</a><i>/</i></li>
					<li><a href="products.html">Best Deals</a><i>/</i></li>
					<li><a href="services.html">Services</a></li>
				</ul>
			</div>
			<div class="w3ls_logo_products_left1">
				<ul class="phone_email">
					<li><i class="fa fa-phone" aria-hidden="true"></i>(+0123) 234 567</li>
					<li><i class="fa fa-envelope-o" aria-hidden="true"></i><a href="mailto:store@grocery.com">store@grocery.com</a></li>
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //header -->
<!-- products-breadcrumb -->
	<div class="products-breadcrumb">
		<div class="container">
			<ul>
				<li><i class="fa fa-home" aria-hidden="true"></i><a href="index.jsp">Home</a><span>|</span></li>
				<li>Womens</li>
			</ul>
		</div>
	</div>
<!-- //products-breadcrumb -->
<!-- banner -->
	<div class="banner">
		<div class="w3l_banner_nav_left">
			<nav class="navbar nav_bottom">
			 <!-- Brand and toggle get grouped for better mobile display -->
			  <div class="navbar-header nav_2">
				  <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
			   </div> 
			   <!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav nav_1">
						<li><a href="mens.jsp">Mens</a></li>
						<li><a href="womens.jsp">Womens</a></li>
                                                <li><a href="kids.jsp">Kids</a></li>
                                                <li><a href="electronics.jsp">Electronics</a></li>
						<li class="dropdown mega-dropdown active">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Home and Furnitures <span class="caret"></span></a>				
							<div class="dropdown-menu mega-dropdown-menu w3ls_vegetables_menu">
								<div class="w3ls_vegetables">
									<ul>	
										<li><a href="home.jsp">Home</a></li>
										<li><a href="furnitures.jsp">Furniture</a></li>
									</ul>
								</div>                  
							</div>				
						</li>
                                                <li><a href="books.jsp">Books</a></li>
					</ul>
				 </div><!-- /.navbar-collapse -->
			</nav>
		</div>
		<div class="w3l_banner_nav_right">
			<div class="w3l_banner_nav_right_banner5">
                            <br/><br/><br/><br/><br/>
				<h3>Best Deals For New Products<span class="blink_me"></span></h3>
			</div>
			<div class="w3ls_w3l_banner_nav_right_grid w3ls_w3l_banner_nav_right_grid_sub">
				<h3>FURNITURES</h3>
				<div class="w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg">
                                    <h6>Bedroom</h6>
                                    <%
                                        Statement stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                                        String q1 = "select pid from products where section='furnitures' and category='1' and rownum<=10";
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
                                             %>
                                            <div class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd">
						<div class="hover14 column">
						<div class="agile_top_brand_left_grid w3l_agile_top_brand_left_grid">
							<div class="agile_top_brand_left_grid_pos">
								 
							</div>
	                                                        <div class="agile_top_brand_left_grid1">
								<figure>
									<div class="snipcart-item block">
										<div class="snipcart-thumb">
											<a href="product_details.jsp?pid=<%=pid %>">
                                                                                            <img src="<%=img %>" alt=" " class="img-responsive" />
                                                                                        </a>
											<p><% out.print(pname); %></p>
											<h4>RS.<% out.print(prc); %><span>Rs. <% out.print(prc + prc*.2); %></span></h4>
										</div>
										<div class="snipcart-details">
											<form action="Cart" method="get">
												<fieldset>
													<input type="hidden" name="pid" value="<%=pid %>" />
													<input type="hidden" name="price" value="<%=prc %>" />
													<input type="submit" name="submit" value="Add To Cart" class="button" />
												</fieldset>
											</form>
										</div>
									</div>
								</figure>
							</div>
						</div>
						</div>
                                            </div>
                                            <%
                                        }//if ends here
                                    %>
                                        <!-----individual products start here ----->
                                        
					<div class="clearfix"> </div>
				</div>
                                <div class="w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg">
                                    <h6>Drawing Room</h6>
                                    <%
                                        stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                                        q1 = "select pid from products where section='furnitures' and category='2' and rownum<=10";
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
                                             %>
                                            <div class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd">
						<div class="hover14 column">
						<div class="agile_top_brand_left_grid w3l_agile_top_brand_left_grid">
							<div class="agile_top_brand_left_grid_pos">
								 
							</div>
	                                                        <div class="agile_top_brand_left_grid1">
								<figure>
									<div class="snipcart-item block">
										<div class="snipcart-thumb">
											<a href="product_details.jsp?pid=<%=pid %>"><img src="<%=img %>" alt=" " class="img-responsive" /></a>
											<p><% out.print(pname); %></p>
											<h4>RS.<% out.print(prc); %><span>Rs. <% out.print(prc + prc*.2); %></span></h4>
										</div>
										<div class="snipcart-details">
											<form action="#" method="post">
												<fieldset>
													<input type="hidden" name="cmd" value="_cart" />
													<input type="hidden" name="add" value="1" />
													<input type="hidden" name="business" value=" " />
													<input type="hidden" name="item_name" value="Shirt" />
													<input type="hidden" name="amount" value="<%=prc %>" />
													<input type="hidden" name="discount_amount" value="<%= prc*.2 %>" />
													<input type="hidden" name="currency_code" value="USD" />
													<input type="hidden" name="return" value=" " />
													<input type="hidden" name="cancel_return" value=" " />
													<input type="submit" name="submit" value="Buy Now" class="button" />
												</fieldset>
											</form>
										</div>
									</div>
								</figure>
							</div>
						</div>
						</div>
                                            </div>
                                            <%
                                        }//if ends here
                                    %>
                                        <!-----individual products start here ----->
                                        
					<div class="clearfix"> </div>
				</div>
                                <div class="w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg">
                                    <h6>Others</h6>
                                    <%
                                        stmt = con.createStatement();//creating a statement reference requestuired to execute a query
                                        q1 = "select pid from products where section='furnitures' and category='3' and rownum<=10";
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
                                             %>
                                            <div class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd">
						<div class="hover14 column">
						<div class="agile_top_brand_left_grid w3l_agile_top_brand_left_grid">
							<div class="agile_top_brand_left_grid_pos">
								 
							</div>
	                                                        <div class="agile_top_brand_left_grid1">
								<figure>
									<div class="snipcart-item block">
										<div class="snipcart-thumb">
											<a href="product_details.jsp?pid=<%=pid %>"><img src="<%=img %>" alt=" " class="img-responsive" /></a>
											<p><% out.print(pname); %></p>
											<h4>RS.<% out.print(prc); %><span>Rs. <% out.print(prc + prc*.2); %></span></h4>
										</div>
										<div class="snipcart-details">
											<form action="#" method="post">
												<fieldset>
													<input type="hidden" name="cmd" value="_cart" />
													<input type="hidden" name="add" value="1" />
													<input type="hidden" name="business" value=" " />
													<input type="hidden" name="item_name" value="Shirt" />
													<input type="hidden" name="amount" value="<%=prc %>" />
													<input type="hidden" name="discount_amount" value="<%= prc*.2 %>" />
													<input type="hidden" name="currency_code" value="INR" />
													<input type="hidden" name="return" value=" " />
													<input type="hidden" name="cancel_return" value=" " />
													<input type="submit" name="submit" value="Buy Now" class="button" />
												</fieldset>
											</form>
										</div>
									</div>
								</figure>
							</div>
						</div>
						</div>
                                            </div>
                                            <%
                                        }//if ends here
                                    %>
                                        <!-----individual products start here ----->
                                        
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
<!-- //banner -->
<!-- newsletter -->
	<div class="newsletter">
		<div class="container">
			<div class="w3agile_newsletter_left">
				<h3>sign up for our newsletter</h3>
			</div>
			<div class="w3agile_newsletter_right">
				<form action="#" method="post">
					<input type="email" name="Email" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
					<input type="submit" value="subscribe now">
				</form>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //newsletter -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="col-md-3 w3_footer_grid">
				<h3>information</h3>
				<ul class="w3_footer_grid_list">
					<li><a href="events.html">Events</a></li>
					<li><a href="about.html">About Us</a></li>
					<li><a href="products.html">Best Deals</a></li>
					<li><a href="services.html">Services</a></li>
					<li><a href="short-codes.html">Short Codes</a></li>
				</ul>
			</div>
			<div class="col-md-3 w3_footer_grid">
				<h3>policy info</h3>
				<ul class="w3_footer_grid_list">
					<li><a href="faqs.html">FAQ</a></li>
					<li><a href="privacy.html">privacy policy</a></li>
					<li><a href="privacy.html">terms of use</a></li>
				</ul>
			</div>
			<div class="col-md-3 w3_footer_grid">
				<h3>what in stores</h3>
				<ul class="w3_footer_grid_list">
					<li><a href="pet.html">Pet Food</a></li>
					<li><a href="frozen.html">Frozen Snacks</a></li>
					<li><a href="kitchen.html">Kitchen</a></li>
					<li><a href="products.html">Branded Foods</a></li>
					<li><a href="household.html">Households</a></li>
				</ul>
			</div>
			<div class="col-md-3 w3_footer_grid">
				<h3>twitter posts</h3>
				<ul class="w3_footer_grid_list1">
					<li><label class="fa fa-twitter" aria-hidden="true"></label><i>01 day ago</i><span>Non numquam <a href="#">http://sd.ds/13jklf#</a>
						eius modi tempora incidunt ut labore et
						<a href="#">http://sd.ds/1389kjklf#</a>quo nulla.</span></li>
					<li><label class="fa fa-twitter" aria-hidden="true"></label><i>02 day ago</i><span>Con numquam <a href="#">http://fd.uf/56hfg#</a>
						eius modi tempora incidunt ut labore et
						<a href="#">http://fd.uf/56hfg#</a>quo nulla.</span></li>
				</ul>
			</div>
			<div class="clearfix"> </div>
			<div class="agile_footer_grids">
				<div class="col-md-3 w3_footer_grid agile_footer_grids_w3_footer">
					<div class="w3_footer_grid_bottom">
						<h4>100% secure payments</h4>
						<img src="images/card.png" alt=" " class="img-responsive" />
					</div>
				</div>
				<div class="col-md-3 w3_footer_grid agile_footer_grids_w3_footer">
					<div class="w3_footer_grid_bottom">
						<h5>connect with us</h5>
						<ul class="agileits_social_icons">
							<li><a href="#" class="facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
							<li><a href="#" class="twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							<li><a href="#" class="google"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
							<li><a href="#" class="instagram"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
							<li><a href="#" class="dribbble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
						</ul>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="wthree_footer_copy">
				<p>© 2016 Online Shopping. All rights reserved </p>
			</div>
		</div>
	</div>
<!-- //footer -->
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});
</script>
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
<script src="js/minicart.min.js"></script>
<script>
	// Mini Cart
	paypal.minicart.render({
		action: '#'
	});

	if (~window.location.search.indexOf('reset=true')) {
		paypal.minicart.reset();
	}
</script>
</body>
</html>