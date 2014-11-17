"use strict";

function goto(page) {
    $(".item").css("background-color", "transparent");
    $(".login").css("background-color", "transparent");
			
    if (page === "home") {
        $("#home").css("background-color", "#E64A19");
        $(".home").css("display", "inline-block");
        $(".browse, .my").css("display", "none");
    }
    if (page === "browse") {
        $("#browse").css("background-color", "#E64A19");
        $(".browse").css("display", "inline-block");
        $(".home, .my").css("display", "none");
    }
    if (page === "my") {
        $("#my").css("background-color", "#E64A19");
        $(".my").css("display", "inline-block");
        $(".home, .browse").css("display", "none");
        
    }
    if (page === "log") 
        $("#login").css("background-color", "#E64A19");
}