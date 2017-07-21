<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Goals Report</title>
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
            <spring:message code="minutes.exercised"/>
          </a>
          
          <a class="brand" href="addGoal.html"> AddGoal </a>
          <a class="brand" href="getGoals.html"> GetGoals </a>
           <a class="brand" href="getGoalReports.html"> GetGoalReports </a>
          
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    
	<table>
		<tr>
			<th>Minutes</th><th>Exercise Minutes</th><th>Activity</th>
		</tr>
		<c:forEach items="${to_goalReports}" var="goalReport">
			<tr>
				<td>${goalReport.goalMinutes}</td><td>${goalReport.exerciseMinutes}</td><td>${goalReport.exerciseActivity}</td>
			</tr>
			
		</c:forEach>
			
	</table>

</body>
</html>