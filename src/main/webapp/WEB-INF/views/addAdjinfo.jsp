<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title></title>
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

<script type="text/javascript" src="jquery-1.8.3.js"></script>

<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$
								.getJSON(
										'<spring:url value="tasks.json"/>',
										{
											ajax : 'true'
										},
										function(data) {
											var html = '<option value="">--Please select one--</option>';
											var len = data.length;
											for (var i = 0; i < len; i++) {
												html += '<option value="' + data[i].taskdesc + '">'
														+ data[i].taskdesc
														+ '</option>';
											}
											html += '</option>';

											$('#tasks').html(html);
										});

					});
</script>
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
				<a class="brand" href="#"> <spring:message code="adj.enterInfo" />
				</a>
				<ul class="nav">
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<div>
			<h3>
				<spring:message code="adj.enterInfo" />
			</h3>
		</div>
		<a class="btn" href="?language=en"> English </a> <a class="btn"
			href="?language=es"> Spanish </a> <br /> <br />

		<form:form commandName="work">
			<form:errors path="*" cssClass="errorblock" element="div" />

			<div class="control-group">


				<label for="textinput1"> <spring:message
						code="adj.insuredName" />
				</label>
				<form:input path="insuredName" />
				<form:errors path="insuredName" cssClass="error" />

				<label for="textinput2"> <spring:message
						code="adj.insuredContact" />
				</label>
				<form:input path="insuredContact" />
				<form:errors path="insuredContact" cssClass="error" />

				<label for="textinput3"> <spring:message
						code="adj.insuranceName" />
				</label>
				<form:input path="insuranceName" />
				<form:errors path="insuranceName" cssClass="error" />

				<label for="textinput4"> <spring:message
						code="adj.insuranceType" />
				</label>
				<form:input path="insuranceType" />
				<form:errors path="insuranceType" cssClass="error" />


				<label for="selectinput1"> <spring:message code="adj.insType" />
				</label>
				<form:select id="tasks" path="task" />


				<label for="textinput5"> <spring:message
						code="adj.adjusterName" />
				</label>
				<form:input path="adjusterName" />
				<form:errors path="adjusterName" cssClass="error" />

				<label for="textinput6"> <spring:message
						code="adj.adjusterId" />
				</label>
				<form:input path="adjusterId" />
				<form:errors path="adjusterId" cssClass="error" />

				<label for="selectinput2"> <spring:message code="adj.type" />
				</label>
				<form:select id="tasks" path="task" />

				<label for="textinput8"> <spring:message code="adj.claimStartDate" />
				</label>
				<form:input path="claimStartDate" />
				<form:errors path="claimStartDate" cssClass="error" />

				<label for="textinput9"> <spring:message code="adj.claimDueDate" />
				</label>
				<form:input path="claimDueDate" />
				<form:errors path="claimDueDate" cssClass="error" />

				<label for="textinput10"> <spring:message code="adj.hour" />
				</label>
				<form:input path="workHour" />
				<form:errors path="workHour" cssClass="error" />


			</div>

			<input type="submit" class="btn"
				value="<spring:message code="adj.button.enter"/>" />

		</form:form>

		<span class="label"> Please enter activity time for <spring:message
				code="claim.no" /> ${claim.claimNo}

		</span>
	</div>

	<script src="assets/js/bootstrap.js">
		
	</script>
</body>
</html>




















