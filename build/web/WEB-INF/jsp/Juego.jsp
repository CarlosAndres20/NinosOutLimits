<%-- 
    Document   : Juegos
    Created on : Aug 16, 2019, 11:49:01 AM
    Author     : Usuario
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/form.css" rel="stylesheet" type="text/css"/>
        <link href="boots/css/styles.css" rel="stylesheet" type="text/css"/>
        <link href="boots/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-2.2.4.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="js/main.js" type="text/javascript"></script>
        <script src="boots/js/bootstrap.min.js" type="text/javascript"></script>
        <title>Niños Sin Limites</title>
    </head>
    <body>
    <div class="container">
    <c:forEach var="dato" items="${lista}">
    <ul class="nav justify-content-center ">
    <li class="nav-item">
      <a class="nav-link active titulo" href="#">Inicio</a>
    </li>
    <li class="nav-item">
      <a class="nav-link active titulo" href="indexActivo.html?id_Usuarios=${dato.id_Usuarios}">Logros</a>
    </li> 
    <li class="nav-item">
      <a class="nav-link titulo" href="contacto.html">Perfil</a>
    </li>
    </ul>
    </c:forEach>
    <div class="row mb-5">
        <div class="col-sm-12 col-md-6 col-lg-4">
            <div class="placeBox bg-white"data-aos="fade-up" data-aos-duration="1000"  data-aos-delay="0">
                <img class="card-img-top" src="boots/img/Logros.jpg" alt="">
            <div class="card-body bg-white text-center border-dark">
                <h4 class="card-title text-dark">Juego de números</h4>
                 <p class="card-text ">
                    Ven, descubre y aprende la magia de los números.
                 </p>
                 <a href="#" class="mt-3 btn btn-info icon-check">Ver mas..</a>
            </div>
            </div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-4">
            <div class="placeBox" data-aos="fade-up" data-aos-duration="1000"  data-aos-delay="500">
              <div class="imgBx">
                <img src="boots/img/child-2.jpg" class="img-fluid">
              </div>
              <div class="content">
                <h3 class="mt-3">Completar la palabra<br>
                  <a href="#" class="mt-3 btn btn-info icon-check">Ver mas..</a>
                </h3>
              </div>
            </div>
        </div>
          <div class="col-sm-12 col-md-12 col-lg-4">
            <div class="placeBox"  data-aos="fade-up" data-aos-duration="1000"  data-aos-delay="1000" >
              <div class="imgBx">
                <img src="boots/img/child-3.jpg" class="img-fluid">
              </div>
              <div class="content">
                <h3 class="mt-3">Colorea tus pensamientos <br>
                  <a href="#" class="mt-3 btn btn-info icon-check">Ver mas..</a>
                </h3>
              </div>
            </div>
          </div>
    </div>
            </div>
    </body>
</html>
