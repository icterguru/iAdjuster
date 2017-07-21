<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Claims Report</title>
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
            <spring:message code="adj.worked"/>
          </a>
        
          <a class="brand" href="addClaim.html"> AddClaim </a>
          <a class="brand" href="getClaims.html"> GetClaims </a>
           <a class="brand" href="getClaimReports.html"> GetClaimReports </a>
          
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    
	<table>
		<tr>
			<th>ClaimNo</th> <th>ClaimType</th> <th>InsType</th> <th>InsuredName</th> <th>InsuredContact</th>
			 <th>InsuranceName</th> <th> InsuranceType</th> <th>ClaimType</th>
			 <th> AdjusterName</th> <th> AdjusterId</th> <th>WorkedHour</th>
			 <th> ClaimStartDate</th> <th>ClaimDueDate</th>
					
		</tr>
		<c:forEach items="${to_claimReports}" var="claimReport">
			<tr>
				<td>${claimReport.claim_claimNo}</td> <td>${claimReport.claim_claimType}</td> 
								
				<td>${claimReport.work_insuranceType}</td> 
				<td>${claimReport.work_insuredName}</td> <td>${claimReport.work_insuredContact}</td> 
				<td>${claimReport.work_insuredContact}</td> <td>${claimReport.work_insuranceName}</td>  
				<td>${claimReport.work_task}</td> 		<td>${claimReport.work_adjusterName}</td> 
				<td>${claimReport.work_adjusterId}</td> <td>${claimReport.work_workHour}</td>
				
			   <td>${claimReport.work_claimStartDate}</td> <td>${claimReport.work_claimDueDate}</td>
		
			</tr>
			
		</c:forEach>
			
	</table>

</body>
</html>