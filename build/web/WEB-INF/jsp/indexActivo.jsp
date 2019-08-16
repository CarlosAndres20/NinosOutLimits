<%-- 
    Document   : indexActivo
    Created on : Aug 14, 2019, 1:50:27 PM
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
        <script src="../boots/js/bootstrap.min.js" type="text/javascript"></script>
        <title>Ninos Sin Limites</title>
    </head>
    <body>
        <div class="container">
            <ul class="nav justify-content-center ">
    <li class="nav-item">
      <a class="nav-link active titulo" href="#">Inicio</a>
    </li>
    <li class="nav-item">
      <a class="nav-link titulo" href="indexActivo.html">Logros</a>
    </li>
    <li class="nav-item">
      <a class="nav-link titulo" href="contacto.html">Perfil</a>
    </li>
  </ul>
         <div class="row mb-5">
             <div class="col-sm-12 col-md-6 col-lg-4">
                 <div class="placeBox bg-white"data-aos="fade-up" data-aos-duration="1000"  data-aos-delay="0">
                <img class="card-img-top" src="boots/img/Logros.jpg" alt="">
             <div class="card-body bg-white">
            <h4 class="card-title text-dark">Juego de números</h4>
            <p class="card-text">
                <c:forEach var="dato" items="${listaj}">
                    ${dato.Nivel}
                </c:forEach>
            </p>
            <p class="card-text">
                Puntuacion
                <c:forEach var="dato" items="${listaj}">
                    ${dato.Puntuacion}
                </c:forEach>
            </p>
            </div>
            </div>
            </div>
          <div class="col-sm-12 col-md-6 col-lg-4">
            <div class="placeBox"data-aos="fade-up" data-aos-duration="1000"  data-aos-delay="0">
              <div class="imgBx img-fluid">
                  <img src="boots/img/puzzle.jpg" class="img-fluid">
              </div>
              <div class="content">
                <h3 class="mt-3">Juego de números<br>
                    Nivel
                   <c:forEach var="dato" items="${listaj}">
                    ${dato.Nivel}
                </c:forEach><br>
                    Puntuacion
                <c:forEach var="dato" items="${listaj}">
                    ${dato.Puntuacion}
                </c:forEach><br>
 
                </table>
                  <a href="indexJugar.htm" class="mt-3 btn btn-info icon-check " >Ver mas..</a>
                  </h3>
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
        <!--<div class="container">
        <h1 class=" h1 jumbotron fluid bg-success text-white text-center">Juegos</h1>
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>Nivel</th>
                    <th>Puntuacion</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
            
            
            </tbody>
            </table>
        </div>-->
    </body>
</html>
