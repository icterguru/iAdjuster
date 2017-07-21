<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
    <html>
    <head>
       <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
       <title>Google Maps API v3 Directions Example</title>       
          <script src="<c:url value="assets/js/googlemap1.js" />"></script>    
                 
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCsnhnyQERgM6zd0qKDnBUDzySC1pzF15k&callback=functionality"
    async defer></script>
           
    </head>
    <body style="font-family: Arial; font-size: 12px;">

<div>
      Enter Starting Location:<input type="text" name="name" value="" id='currentLocation'>
      Enter Destination:<input type="text" name="name" value="" id='destination'>
      <button type="button" name="button" id='findDestinationRoute'>Find Route</button>


       <div style="width: 600px;">
         <div id="map" style="width: 280px; height: 400px; float: left;"></div>
         <div id="panel" style="width: 300px; float: right;"></div>
       </div>
       	
</div>
    </body>
    </html>
