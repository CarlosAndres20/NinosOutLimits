$(document).ready(function(){
    console.log('Jquery de acudientes'); 
    $('#Acudiente').hide();
        $("a").click(function(){
            $.ajax({
                url: 'listUser.php',
                type:'GET',
                success: function(response){
                    console.log("lista acudientes");
            
                   $('#Acudiente').html(response);
                   $('#Acudiente').show();
                }
            });
        });
});
           
           
    
        
