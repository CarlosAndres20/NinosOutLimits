<%-- 
    Document   : indexJuego
    Created on : Aug 14, 2019, 1:36:22 PM
    Author     : Usuario
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="Container">
            <table class="table table-hover" >
            <thead>
                <tr>
                    <th>Nivel</th>
                    <th>Puntuacion</th>
                    <th>condicion</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
        <c:forEach var="dato" items="${lista}">
                <tr>
                <td>${dato.Nivel}</td>
                <td>${dato.Puntuacion}</td>
                <td>${dato.condicion}</td>
                <td>
                    <a class="btn bg-warning text-white" href="editarAcudiente.htm?id_Acudientes=${dato.id_Juegos}">Editar</a>
                    <a class="btn bg-danger text-white" href="deleteAcudiente.htm?id_Acudientes=${dato.id_Juegos}" onclick="return confirm('Estas seguro de eliminar');">Eliminar</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
            </table>
            <a class="targeta2" href="AgregarJuego.htm">Agregar</a>
        </div>
    </body>
</html>
