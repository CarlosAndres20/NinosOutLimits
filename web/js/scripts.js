$(document).ready(function(){
    $('#ciudad').load('buscarCiudades.htm',"id="+$('#depto').val());
    $('#depto').on('change','',function(){
        $('#ciudad').load('buscarCiudades.htm',"id="+$('#depto').val());
    }
    );
    $('#cerrarSesion').on('click','',function(){
        $('#mensaje').load('cerrarSesion.htm',"");
    }
    );
});