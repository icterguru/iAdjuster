<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link rel="stylesheet" href="assets/css/videoStyle.css">
<script src="<c:url value="/assets/js/videoMain.js" />"></script>
</head>
<body>
	<!--  <h1>background-video!!</h1> -->


	<!--Playing single video  -->

	<div class="container" style="text-align:center">
		<video autoplay width="812" height="288" loop muted>
			<source src='assets/videos/horse.mp4' type='video/mp4'>
		</video>
		<div class="text">Auto repeating Video</div>
		<div class="text">
			<h1 style='color: red'>Hello World.....</h1>
		</div>
		<button>Click me1</button>
		<button>Click me2</button>
		<button>Click me3</button>
	</div>


	<br>
	<br>
	<br>
	<br>


</body>
</html>