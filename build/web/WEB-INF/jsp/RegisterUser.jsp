<%-- 
    Document   : RegisterUser
    Created on : Aug 13, 2019, 12:17:25 PM
    Author     : Usuario
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="boots/css/styles.css" rel="stylesheet" type="text/css"/>
        <link href="boots/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../boots/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery-2.2.4.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="js/mainUser.js" type="text/javascript"></script>
        <title>Niños Sin Limites</title>
    </head>
    <body>
            <div class="container ">
              <h1 class="display-4 d-none d-md-none d-lg-none d-xl-block">Registro Usuario</h1>
              <form method="POST" id="frm-registro">
                <div class="form-group">
                    <label for="IdAcudiente">IdAcudiente</label><br>
                    <select name="IdAcudiente" class="custom-select" id="IdAcudiente">
                     <c:forEach var="dato" items="${lista}">
                         <option value="${dato.IdAcudiente}">${dato.Nombre}</option>
                    </c:forEach>
                  </select>
                </div>
                <div class="form-group">
                  <label for="Nombre">Nombre</label>
                  <input type="text" class="form-control" id="Nombre" name="Nombre" placeholder="Nombre" >
                </div>
                <div class="form-group">
                  <label for="Apellido">Apellido</label>
                  <input type="text" class="form-control" id="Apellido" name="Apellido" placeholder="Apellido" >
                </div>
                <div class="form-group">
                  <label for="Documento">Documento</label>
                  <input type="text" class="form-control" id="Documento" name="Documento" placeholder="Documento" >
                </div>
                <div class="form-group">
                  <label for="FechaNacimiento">FechaNacimiento</label>
                  <input type="text" class="form-control" id="FechaNacimiento" name="FechaNacimiento" placeholder="FechaNacimiento">
                </div>
                <div class="form-group">
                  <label for="Telefono">Telefono</label>
                  <input type="text" class="form-control" id="Telefono" name="Telefono" placeholder="Telefono">
                </div>
                <div class="form-group">
                  <label for="Contrasena">Contrasena</label>
                  <input type="text" class="form-control" id="Contrasena" name="Contrasena" placeholder="Contrasena">
                </div>
                  <div class="form-group">
                  <label for="Contrasena">Repite la contraseña</label>
                  <input type="text" class="form-control" name="Clave" placeholder="Contrasena2" id="Contrasena2">
                </div>
                <div class="form-group">
                  <label for="Correo">Email</label>
                  <input type="email" class="form-control " id="Correo" name="Correo" aria-describedby="emailHelp" placeholder="Correo">
                  <small id="emailHelp" class=" text-white">El Correo debe ser unicó y contener minimo 8 caracteres</small>
                </div>
                  <input type="submit" value="Agregar" class="btn btn-primary alert-info">
              </form>
            </div>
    </body>
</html>
