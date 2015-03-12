/**
 * 
 */

$(function() {
    //date picker
   $( '.dateenter').datepicker({
          showOn : "button",
          buttonImage : "/images/calendar.png" ,
          buttonImageOnly : true,
          buttonText : 'Calendar',
          dateFormat : 'yy-mm-dd',
          constrainInput : false
   });
   $( '.ui-datepicker').bind('click' , function() {
           return false ;
});
