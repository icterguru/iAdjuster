<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   

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
<!-- 
 	<div class="container">
			<video  autoplay  width="812" height="288" loop muted>
				<source src='assets/videos/horse.mp4' type='video/mp4'>
			</video>
			<div class="text">Test Video</div>
		</div>
 -->

<br>
<br>
<br>
<br>

<!--Playing multiple videos  -->
<div class="container" style="text-align:center">


  <video id="myvideo" autoplay muted >
  <source class="active" src="assets/videos/jasper.mp4" type="video/mp4" />
  <source src="assets/videos/horse.mp4" type="video/mp4" />
</video>

    <div class="text"><h1 style='color:red'>Hello World</h1></div>
    <a href="maps.html"><button> maps </button></a>
    <a href="welcome.html"><button> Welcome </button></a>
    <a href="images.html"><button> Images </button></a>

</div>
</body>
</html>