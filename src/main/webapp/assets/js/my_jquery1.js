

$(document).ready(function(){
    $("p").dblclick(function(){
        $(this).fadeTo("slow", 0.25)
        .css("color", "red")
        .delay(3000)
        .fadeTo("slow", 1)
        .css("color", "black");
    });

});

$(document).ready(function(){
     $("img").dblclick(function(){
        $(this).hide();
    });
});

$(document).ready(function(){
    $("#flip").click(function(){
        $("#panel").slideToggle("slow");
    });
});

$(document).ready(function(){
    $("button").click(function(){
        $("img").slideUp(2000)
            .slideDown(2000);
    });
});

$(document).ready(function(){
    $("#btn1").click(function(){
        $("div1").animate({height: "150px"});
        $("div1").animate({width: "150px"});
        $("div1").delay(1200).animate({height: "300px"});
        $("div1").delay(1200).animate({width: "300px"});
    });
});