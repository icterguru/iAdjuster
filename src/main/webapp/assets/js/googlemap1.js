var startPoint, endPoint, userCurrentLocation, userDestinationLocation ;
        document.addEventListener('DOMContentLoaded', functionality);

        function functionality (){
          directions();
        }

        function directions(){
        	console.log('console log connected')
          document.getElementById("findDestinationRoute").onclick = function() {
             startPoint = document.getElementById('currentLocation').value;
             endPoint = document.getElementById('destination').value;
             localStorage.setItem('currentLocation',document.getElementById('currentLocation').value);
             localStorage.setItem('destination',document.getElementById('destination').value);
              userCurrentLocation = localStorage.getItem('currentLocation')
              userDestinationLocation = localStorage.getItem('destination')
             location.reload();
             };
        

         var directionsService = new google.maps.DirectionsService();
         var directionsDisplay = new google.maps.DirectionsRenderer();

         var map = new google.maps.Map(document.getElementById('map'), {
           zoom:7,
           mapTypeId: google.maps.MapTypeId.ROADMAP
         });

         directionsDisplay.setMap(map);
         directionsDisplay.setPanel(document.getElementById('panel'));

         var request = {
           origin: localStorage.getItem('currentLocation') || 'Plano, Tx',
           destination: localStorage.getItem('destination') || 'Irving, Tx',
           travelMode: google.maps.DirectionsTravelMode.DRIVING
         };

         directionsService.route(request, function(response, status) {
           if (status == google.maps.DirectionsStatus.OK) {
             directionsDisplay.setDirections(response);
           }
         });
        }