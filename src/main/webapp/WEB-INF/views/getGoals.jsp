<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
			<th>ID</th><th>Minutes</th>
		</tr>
	
		<c:forEach items="${to_goalreport}" var="goal">
		
			<tr>
				
				<td>${goal.id}</td><td>${goal.minutes}</td>
				
				<td>
					<table>
						<tr>
							<th>Exercise ID</th><th>Exercise Minutes</th><th>Exercise Activity</th>
						</tr>
						<c:forEach items="${goal.exercises}" var="exercise">
							<tr>
								<td>${exercise.id}</td><td>${exercise.minutes}</td><td>${exercise.activity}</td>
							</tr>
						</c:forEach>
						
					</table>
				</td>
				
			</tr>
		
		</c:forEach>
	
	</table>

</body>
</html>