<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
  
  <head>
    <meta charset="utf-8">
    <title>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Le styles -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <style>
      body { padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */ }
    </style>
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
    <style>
		.error {
			color: #ff0000;
		}
		
		.errorblock {
			color: #000;
			background-color: #ffEEEE;
			border: 3px solid #ff0000;
			padding: 8px;
			margin: 16px;
		}
	</style>
  </head>
  <body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="#">
            Add a Claim
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    <div class="container">
      <div>
        <h3>
          <spring:message code="claim.info"/>
        </h3>
      </div>
      
      <form:form commandName="claim">
		<form:errors path="*" cssClass="errorblock" element="div" />
			<label for="textinput1">
	          Enter/Select a Claim Number:
	        </label>	
			<form:input path="claimNo" cssErrorClass="error" />
			<form:errors path="claimNo" cssClass="error" />
			
			<label for="textinput2">
	          Enter/Select a Claim Type:
	        </label>	
			<form:input path="claimType" cssErrorClass="error" />
			<form:errors path="claimType" cssClass="error" />
			
			<%-- 		
			<label for="textinput3">
	          Enter Customer's info:
	        </label>	
			<form:input path="claimType" cssErrorClass="error" />
			<form:errors path="claimType" cssClass="error" />
			
			<label for="textinput4">
	          Enter Claim Notes:
	        </label>	
			<form:input path="claimType" cssErrorClass="error" />
			<form:errors path="claimType" cssClass="error" /> --%>
			
			<br/>
			
			<input type="submit" class="btn" value="Enter Claim Info"/>
	
	
	  </form:form>
     
      <div class="control-group">
      </div>
    </div>

     <script src="jquery-1.8.3.js">
    </script>
    <script src="assets/js/bootstrap.js">
    </script>
  </body>
</html>
