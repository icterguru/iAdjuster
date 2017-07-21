
function initialize() {
  var mapProp = {
    center:new google.maps.LatLng(24.431345, 89.361254),
    zoom:16,
    mapTypeId:google.maps.MapTypeId.SATELLITE
  };
  var map=new google.maps.Map(document.getElementById("googleMap"), mapProp);
}

google.maps.event.addDomListener(window, 'load', initialize);
