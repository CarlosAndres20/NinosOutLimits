<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

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
        <title>Niños Sin Limites</title>
    </head>
    <body>
        </table>
        <%--<ul class="nav nav-bar">--%>
        <%--<div class="tarjeta"></div>
        <div class="tarjeta1"></div>
        <div class="tarjeta1"></div>
<div class="tarjeta1"></div>--%>
        
        <ul class="nav justify-content-center ">
    <li class="nav-item">
      <a class="nav-link active titulo" href="#">Inicio</a>
    </li>
    <li class="nav-item">
      <a class="nav-link titulo" href="acerca.html">Acerca</a>
    </li>
    <li class="nav-item">
      <a class="nav-link titulo" href="contacto.html">Contacto</a>
    </li>
  </ul>
  <div class="row font_play">
    <div class="col-sm-12 col-md-6 pl-5 mt-5 d-none d-md-block "><img src="../img/logo.png" alt="" style="width: 60%; "></div>
    <div class="col-sm-12 col-md-6 mt-md-3 ">
      <div class="jumbotron jumbotron-fluid">
        <div class="container ">
             <ul class="justify-content-center">
              <div class="form-group">
              <h1 class="display-6 mb-3 offset-3">Juega ya!!!</h1>
              <input type="text" class="form-control bg-success text-white mb-3 ml-4" id="NombreInicio" aria-describedby="Nombrei" placeholder="Nombre" style="width: 75% !important;">
              <h6 id="Nombrei" class=" mb-4 mt-3 ml-4 ">Escribe tu nombre secreto</h6>
              <button class="btn btn-success icon-check offset-4">Iniciar</button>
          </h1>
        </div>
       </ul>
      </div>
    </div>
  </div>
  <!--</div>
        <div class="container">
        <ul class="nav nav-tabs" id="navId">
        <li class="nav-item">
            <a href="#tab1Id" class="nav-link active">Inicio</a>
        </li>
        <li class="nav-item">
            <a href="#tab5Id" class="nav-link">Nosotros</a>
        </li>
        <li class="nav-item">
            <a href="#" class="nav-link disabled">Contactenos</a>
        </li>
    </ul>-->
    
    <!-- Tab panes -->
    <div class="tab-content">
        <div class="tab-pane fade show active" id="tab1Id" role="tabpanel"></div>
        <div class="tab-pane fade" id="tab2Id" role="tabpanel"></div>
        <div class="tab-pane fade" id="tab3Id" role="tabpanel"></div>
        <div class="tab-pane fade" id="tab4Id" role="tabpanel"></div>
        <div class="tab-pane fade" id="tab5Id" role="tabpanel"></div>
    </div>
    </div>
    <script>
        $('#navId a').click(e => {
            e.preventDefault();
            $(this).tab('show');
        });
    </script>
        <div class="container ">
              <h1 class="display-4 d-none d-md-none d-lg-none d-xl-block">Aprende a tu manera</h1>
              <h1 class="display-6">Datos Personales</h1>
              <form method="POST" id="frm-registro">
                <div class="form-group">
                  <label for="Nombre">Nombre</label>
                  <input type="text" class="form-control" id="Nombre" name="Nombre" placeholder="Nombre">
                </div>
                <div class="form-group">
                  <label for="Parentesco">Parentesco</label>
                  <input type="text" class="form-control" id="Parentesco" name="Parentesco" placeholder="Parentesco" >
                </div>
                <div class="form-group">
                  <label for="Telefono">Telefono</label>
                  <input type="text" class="form-control" id="Telefono" name="Telefono" placeholder="Telefono">
                </div>
                <div class="form-group">
                  <label for="Email">Email</label>
                  <input type="email" class="form-control " id="Email" name="Email" aria-describedby="emailHelp" placeholder="Email">
                  <small id="emailHelp" class=" text-white">El Correo debe ser unicó y contener minimo 8 caracteres</small>
                </div>
                <div class="form-group form-check">
                  <input type="checkbox" class="form-check-input" id="exampleCheck1">
                  <label class="form-check-label" for="exampleCheck1">He leído y acepto los términos y condiciones</label>
                </div>
                  <input type="submit" value="Inscribirse" class="btn btn-primary alert-info">
              </form>
            </div>
        <a href="Juego.htm">Juegos</a>
        <a href="indexJuego.htm">juegosAd</a>
    </body>
</html>
