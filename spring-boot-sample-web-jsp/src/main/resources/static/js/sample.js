$(document).ready(function(){
    $("button").click(function(){
        var username=$("#username").val();
        var password=$("#password").val();
        $.ajax({ type: "POST",
            url: "j_security_check",
            data: { j_username: username, j_password: password }, success: function(result){
            $("#div1").html(result);
        }});
    });
});

