
$(".category_menu div").hover(
  function () { 
    $(this).children('ul').slideDown("fast");
  },
  function () { 
	  
	  $(this).children('ul').stop().slideUp("fast");
   
  }
);


/*
$(".center a").click(
 function(){
	 $('.center a').css({
		 background:'',		 
		 });
		 
		 
	 $(this).css({
		  background:'#ededed',
		  display:"block",
		  margin:"0 auto",
		 });
	 }
);
*/