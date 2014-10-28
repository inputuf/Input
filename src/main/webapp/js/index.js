function resize(width, height){
	$("div.wrap").css({
		"width": width + "px", 
		"height": height + "px",
		"margin-left": -width*0.5 + "px", 
		"margin-top": -200 + "px"
	});
}
function login(){
	resize(700, 400);
	$("#loginfield").css("display", "inline-block");
	$("#rdiv, #ldiv, #continue").css("display", "none");
}
function register(){
	resize(700, 900);
	$("#regfield").css("display", "inline-block");
	$("#rdiv, #ldiv, #continue").css("display", "none");
	
}
function back(){
	$("div.wrap").css({
		"width": "100%", 
		"height": "400px",
		"margin-left": "-50%", 
		"margin-top": "-10%"
	});
	$(".fields").css("display", "none");
	$("#rdiv, #ldiv, #continue").css("display", "inline-block");
}