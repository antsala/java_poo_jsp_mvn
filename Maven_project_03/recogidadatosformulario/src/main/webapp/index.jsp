<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Paso de cadena</title>
        </head>
        <body>
            <h1>Pasando una cadena de caracteres</h1>
            
            <!-- El evento submit llamará a la página "procesa.jsp" -->
            <form method="post" action="procesa.jsp"> Introduce tu nombre:
                <input type="text" name="nombre"> <!-- procesa.jsp leerá los parámetros de la query string--> 
                <input type="submit" value="OK">
            </form>
        </body>
    </html>