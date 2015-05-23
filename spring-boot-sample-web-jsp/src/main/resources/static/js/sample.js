/**
 * Created by nareshm on 22/05/2015.
 */

$(document).ready(function(){
    $("button").click(function(){
        alert( "Handler for .click() called." );
        var username=$("#username").val();
        var password=$("#password").val();
        setTimeout(function() {
            $.ajax({
                type: "POST",
                url: "j_security_check",
                data: { j_username: username, j_password: password }
            }).done(function(data,status){
                alert("Data: " + data + "\nStatus: " + status);
            });
        }, 2000);
    });
});

//$("#login" ).click(function() {
//    alert( "Handler for .click() called." );
//    setTimeout(function() {
//        $.ajax({
//            type: "POST",
//            url: "j_security_check",
//            data: { j_username: "admin", j_password: "6339098" }
//        }).done(function( msg ) {
//            alert( msg );
//        });
//    }, 2000);
//});
