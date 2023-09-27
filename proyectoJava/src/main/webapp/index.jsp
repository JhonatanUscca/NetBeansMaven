<%-- 
    Document   : index
    Created on : 2 jul. 2022, 15:17:01
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos6.css">
    </head>
    <body>
        <form action="Login" method="post">
            <div class="relleno">
                Primer Nombre:<input class="campos" type="text" name="primerNombre"><br>
                Segundo Nombre:<input class="campos" type="text" name="segundoNombre"><br>
                Primer Apellido:<input class="campos" type="text" name="primerApellido"><br>
                Segundo Apellido:<input class="campos" type="text" name="segundoApellido"><br>
                <input class="btn" type="submit" value="validar">
            </div>
        </form>
    </body>
</html>
