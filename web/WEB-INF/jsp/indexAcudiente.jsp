<%-- 
    Document   : indexAcudiente
    Created on : Aug 12, 2019, 4:40:07 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                
        <h1 class="jumbo bg-success">Happy Child´s</h1>
        <div class="Container">
            <table class="table table-hover" >
            <thead>
                <tr>
                    <th>IdAcudiente</th>
                    <th>Nombre</th>
                    <th>Parentesco</th>
                    <th>Telefono</th>
                    <th>Email</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
        <c:forEach var="dato" items="${lista}">
                <tr>
                <td>${dato.IdAcudiente}</td>
                <td>${dato.Nombre}</td>
                <td>${dato.Parentesco}</td>
                <td>${dato.Telefono}</td>
                <td>${dato.Email}</td>
                <td>
                    <a class="btn bg-warning text-white" href="editarAcudiente.htm?id_Acudientes=${dato.id_Acudientes}">Editar</a>
                    <a class="btn bg-danger text-white" href="deleteAcudiente.htm?id_Acudientes=${dato.id_Acudientes}" onclick="return confirm('Estas seguro de eliminar');">Eliminar</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
            </table>
            <a class="targeta2" href="agregarAcudiente.htm">Agregar</a>
        </div>
    </body>
</html>
