"use strict";

function goto(page) {
    $(".item").css("background-color", "transparent");
    $(".login").css("background-color", "transparent");
			
    if (page === "home")
        $("#home").css("background-color", "#E64A19");
    if (page === "browse") 
        $("#browse").css("background-color", "#E64A19");
    if (page === "my") 
        $("#my").css("background-color", "#E64A19");
}