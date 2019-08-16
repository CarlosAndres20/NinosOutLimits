<%-- 
    Document   : AgregarJuego
    Created on : Aug 16, 2019, 9:57:48 AM
    Author     : Usuario
--%>

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
        <h1 class="h1 bg-info text-white">Agregar Juegos</h1>
        <form method="POST">
            <label>Nivel</label><br>
            <input type="text" name="Nivel" placeholder="Nivel"><br>
            <label>Puntuacion</label><br>
            <input type="text" name="Puntuacion" placeholder="Puntuacion"><br>
            <label>condicion</label><br>
            <input type="number" name="condicion" placeholder="condicion"><br>
            <input type="submit" value="Agregar" class="agregar"><br>
            <a href="index.htm">Regresar</a>
        </form>
    </body>
</html>
