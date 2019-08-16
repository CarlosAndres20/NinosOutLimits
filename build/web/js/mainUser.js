/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function (){
    
    //alert();
    $('#frm-registro').validate({
       rules:{
           Nombre:{
               required:true,
               maxlength:7,
               minlength:2
           },
           Apellido:{
               required:true,
               maxlength:7,
               minlength:2
           },
           Documento:{
               required:true,
               number:true
           },
           Telefono:{
               required:true,
               number:true,
               minlength:10,
               maxlength:10,
               digits:true
               
           },
           Contrasena:{
               required:true
           },
           Clave:{
               equalTo:"#Contrasena"
           },
           Email:{
               required:true,
               email:true
           }
       },
       messages:{
           Nombre:{
               required:'Este campo es obligatorio',
               maxlength:'El campo debe tener maximo 7 caracteres',
               minlength:'El campo debe tener minimo 2 caracteres'
           },
           Apellido:{
               required:'Este campo es obligatorio',
               maxlength:'El campo debe tener maximo 7 caracteres',
               minlength:'El campo debe tener minimo 2 caracteres'
           },
           Documento:{
               required:'Este campo es obligatorio',
               number:'Digite un numero valido'
           },
           Telefono:{
               required:'Este campo es obligatorio',
               number:'Digite un numero',
               minlength:'El telefono debe tener minimo 10 numeros',
               maxlength:'El telefono debe tener maximo 10 numeros'
           },
           Contrasena:{
               required:'Este campo es obligatorio'
           },
           Clave:{
               equalTo:"Ingresa la contraseña de nuevo"
           },
           Email:{
               required:'Este campo es obligatorio',
               email:'Ingrese un email valido'
           }
       }
        
    });
});


