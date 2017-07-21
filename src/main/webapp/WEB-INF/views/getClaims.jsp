<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Claim Report</title>
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
			<th>ClaimId</th><th>ClaimNo</th>
		</tr>
	
		<c:forEach items="${to_claimreport}" var="claim">
		
			<tr>
				
				<td>${claim.claimId}</td><td>${claim.claimNo}</td>
				
				<td>
					<table>
						<tr>
							<th>ClaimId</th><th> InsuredName</th> <th>InsuredContact</th> <th>InsuranceName</th>
							<th> InsuranceType</th> <th>WorkedHour</th><th> WorkedTask</th> <th> AdjusterName</th> <th> AdjusterId</th>
						</tr>
						<c:forEach items="${claim.claimedworks}" var="claimedwork">
							<tr>
								<td>${claimedwork.workId}</td> <td>${claimedwork.InsuredName}</td><td>${claimedwork.InsuredContact}</td>
								<td>${claimedwork.InsuranceName}</td> <td>${claimedwork.InsuranceType}</td>
								
								<td>${claimedwork.WorkedHour}</td><td>${claimedwork.AdjusterName}</td>
								<td>${claimedwork.AdjusterId}</td> <td>${claimedwork.task}</td> 
								
								<td>${claimedwork.workHour}</td>
								
								
							</tr>
						</c:forEach>
						
					</table>
				</td>
				
			</tr>
		
		</c:forEach>
	
	</table>

</body>
</html>