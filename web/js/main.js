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
               maxlength:5,
               minlength:2
           },
           Parentesco:{
               required:true
           },
           Telefono:{
               required:true,
               number:true,
               minlength:10,
               maxlength:10,
               digits:true
               
           },
           Email:{
               required:true,
               email:true
           }
       },
       messages:{
           Nombre:{
               required:'Este campo es obligatorio',
               maxlength:'El campo debe tener maximo 5 caracteres',
               minlength:'El campo debe tener minimo 2 caracteres'
           },
           Parentesco:{
               required:'Este campo es obligatorio'
           },
           Telefono:{
               required:'Este campo es obligatorio',
               number:'Digite un numero',
               minlength:'El telefono debe tener minimo 10 numeros',
               maxlength:'El telefono debe tener maximo 10 numeros'
           },
           Email:{
               required:'Este campo es obligatorio',
               email:'Ingrese un email valido'
           }
       }
        
    });
});


