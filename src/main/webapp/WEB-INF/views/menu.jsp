<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "sec" uri = "http://www.springframework.org/security/tags"  %>

<!DOCTYPE html >
<html lang="en">

<!-- <link rel="stylesheet" href="base.css" /> -->
<link rel="stylesheet" href="assets/css/menustyle1.css" /> 

<%@page import="java.sql.*" %>

<%
Connection conn=null;
try
{
	Class.forName("com.mysql.jbdc.Driver");
	conn = DriverManager.getConnection("jbdc:mysql://localhost:3306/iadjuster","root","password");
	if(conn!=null)
	{ 
		out.print("connection successful");
	}
}
	catch(Exception e)
	{
		out.print("connection unsuccessful");
	}


%>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to iAdjustersss</title>


<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="node_modules/bootstrap/dist/css/bootstrap.css"
	rel="stylesheet" />
<link href="app/app.component.css" rel="stylesheet" />

<!-- 1. Load libraries -->
<!-- IE required polyfills, in this exact order -->
<script src="node_modules/angular2/es6/dev/src/testing/shims_for_IE.js"></script>
<script src="node_modules/es6-shim/es6-shim.min.js"></script>
<script src="node_modules/systemjs/dist/system-polyfills.js"></script>

<script src="node_modules/angular2/bundles/angular2-polyfills.js"></script>
<script src="node_modules/systemjs/dist/system.src.js"></script>
<script src="node_modules/rxjs/bundles/Rx.js"></script>
<script src="node_modules/angular2/bundles/angular2.dev.js"></script>


<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="mystyle1.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="my_jquery1.js"></script>

<script src="http://maps.googleapis.com/maps/api/js"></script>

<script src="/js/GoogleMap1.js"></script>

<script src="js/jquery-1.9.1.min.js"></script>
<script>
    $(document).ready(function() {
        $( '.dropdown' ).hover(
            function(){
                $(this).children('.sub-menu').slideDown(300);
            },
            function(){
                $(this).children('.sub-menu').slideUp(300);
            }
        );
    }); // end ready
</script>


<!-- 2. Configure SystemJS -->
<script>
        System.config({
        packages: {        
          app: {
            format: 'register',
            defaultExtension: 'js'
          }
        }
      });
      System.import('app/main')
            .then(null, console.error.bind(console));
    </script>


</head>
<body>
	<br>
	<br>

	<h2>
		Hello <sec:authentication property="name" />! <br>Welcome to iAdjuster
	</h2>
	<br>
	<br>
	
	
	
	 <form method="post" enctype="multipart/form-data">
<table width="350" border="0" cellpadding="1" cellspacing="1" class="box">
<tr> 
<td width="246">
<input type="hidden" name="MAX_FILE_SIZE" value="2000000">
<input name="userfile" type="file" id="userfile"> 
</td>
<td width="80"><input name="upload" type="submit" class="box" id="upload" value=" Upload "></td>
</tr>
</table>
</form>



	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Le styles -->
	<link href="assets/css/bootstrap.css" rel="stylesheet">
	<style>
body {
	padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */
}



</style>
	<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
	<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
	<!-- Le fav and touch icons -->
	<link rel="shortcut icon" href="assets/ico/favicon.ico">
	<link rel="apple-touch-icon-precomposed" sizes="144x144"
		href="assets/ico/apple-touch-icon-144-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="114x114"
		href="assets/ico/apple-touch-icon-114-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72"
		href="assets/ico/apple-touch-icon-72-precomposed.png">
	<link rel="apple-touch-icon-precomposed"
		href="assets/ico/apple-touch-icon-57-precomposed.png">
	<style>
</style>
</head>


<div class="navbar navbar-fixed-top navbar-inverse">
	<div class="navbar-inner">
		<div class="container">
<nav>
    <ul class="content clearfix">
    
        <li class="dropdown">
            <a href="#">Menu 1</a>
            <ul class="sub-menu">
                <li><a href="#">Menu 1.1</a></li>
                <li><a href="#">Menu 1.2</a></li>
                <li><a href="#">Menu 1.3</a></li>
                <li><a href="#">Menu 1.4</a></li>
                <li><a href="#">Menu 1.5</a></li>
            </ul>
        </li>
        
         <li class="dropdown">
            <a href="#">Menu 2</a>
            <ul class="sub-menu">
                <li><a href="#">Menu 2.1</a></li>
                <li><a href="#">Menu 2.2</a></li>
                <li><a href="#">Menu 2.3</a></li>
                <li><a href="#">Menu 2.4</a></li>
                <li><a href="#">Menu 2.5</a></li>
            </ul>
        </li>
        
        <li class="dropdown">
            <a href="#">Menu 3</a>
            <ul class="sub-menu">
                <li><a href="#">Menu 3.1</a></li>
                <li><a href="#">Menu 3.2</a></li>
                <li><a href="#">Menu 3.3</a></li>
                <li><a href="#">Menu 3.4</a></li>
                <li><a href="#">Menu 3.5</a></li>
            </ul>
        </li>
        <li class="dropdown">
        	<a href="#">Menu 4</a>
           <ul class="sub-menu">
                <li><a href="#">Menu 4.1</a></li>
                <li><a href="#">Menu 4.2</a></li>
                <li><a href="#">Menu 4.3</a></li>
                <li><a href="#">Menu 4.4</a></li>
                <li><a href="#">Menu 4.5</a></li>
            </ul>
        </li>
        
        <li class="dropdown">
         <a href="#">Menu 5</a>
           <ul class="sub-menu">
                <li><a href="#">Menu 5.1</a></li>
                <li><a href="#">Menu 5.2</a></li>
                <li><a href="#">Menu 5.3</a></li>
                <li><a href="#">Menu 5.4</a></li>
                <li><a href="#">Menu 5.5</a></li>
            </ul>
        </li>
    </ul>
</nav>
			
		</div>
	</div>
</div>



<div class="container">
	<div class="hero-unit">
		<div>
			<h1>About iAdjustersss</h1>
			<p>iAdjustersss is an amazing application for Insurance Property
				Claims Adjusters, Property Appraisers, or even Real Estate
				professionals. You won't know how you lived without it!FEATURES:*
				Import claims data from email* Provides mapping directions from
				current location to claim address * Call contact directly from Claim
				Contact section* Collect information for a property's Rooms, Roof
				Sections, and Contents * Automatically detect and store the pitch of
				a roof* Create drawings (useful for roof or room diagrams)* Attach
				photos or drawings directly to Claim * Export claim data to an
				auto-formatted email; and many more features.</p>
		</div>



	</div>

	<div>

		<table class="w3-table w3-bordered w3-striped">
			<tr class="w3-red">
				<th>Adjuster Name</th>
				<th>Claim Number</th>
				<th>Claim Status</th>
			</tr>
			<tr>
				<td>Jill Smith</td>
				<td>1234</td>
				<td>Open</td>
			</tr>
			<tr>
				<td>Eve Robinson</td>
				<td>2347</td>
				<td>Resolved</td>
			</tr>
			<tr>
				<td>John Adam</td>
				<td>2345</td>
				<td>Open</td>
			</tr>
		</table>

	</div>

	<br> <br>

	<div class="w3-row-padding w3-section">

		<div class="w3-half">
			<div class="w3-card-2">
				<img src="images/acc_car1.jpeg" alt="images/acc_car1"
					style="width: 50%; height: 50%">
				<div class="w3-container">

					<br> <br>

					<p>Tasacom is IT Service and Solution company with headquarter
						in Dallas, Texas. Started in since 2007 it serves a lot of Fortune
						500 companies in the United States and Canada. Its goal is to
						provide cost effective optimized solutions with latest
						technologies to small and large business organizations. Website:
						http://tasacom.com</p>
				</div>


				<br> <br>

			</div>
		</div>



		<a class="btn btn-primary" href="addClaim.html"> Add a Claim � </a>

		<sec:authorize ifAnyGranted="ROLE_ADMIN">
			<a class="btn btn-primary" href="EditClaim.html"> Edit Claim � </a>

		</sec:authorize>


		<a class="btn btn-primary" href="addGoal.html"> Add Goal � </a>




	</div>




	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<h3>Web-based iAdjuster</h3>
				<p>The web-based iAdjuster is available for ...</p>
				<p>The web-based ..... ...</p>
			</div>
			<div class="col-sm-4">
				<h3>Mobile-based iAdjuster</h3>
				<p>The mobileb-based iAdjuster is available for ...</p>
				<p>The mobile-based ..... ...</p>
			</div>
			<div class="col-sm-4">
				<h3>My iAdjuster App</h3>
				<p>My iAdjuster App is available in the Apple's App Store as
					well as in Google's Play Store ...</p>
				<p>My iAdjuster App is ..... ...</p>
			</div>
		</div>
	</div>

	<br>
	<button class="button">Click here to bring the hidden content
		back</button>
	<br>

	<footer class="w3-container w3-red">

		<p>Copyright to Tasacom Technolies Inc., 2016</p>
</div>

<script src="jquery-1.8.3.js">
    </script>

<script src="assets/js/bootstrap.js">
    </script>
</body>

</html>


