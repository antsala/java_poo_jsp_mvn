<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="mipaquete.Gato"%> <!-- Los imports de las clases en JSP se hacen así -->
<!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Gatos con clase</title>
        </head>
        <body>
            <h1>Gatos con clase</h1>
            <hr>
            <%
                // Instanciamos tres gatos.
                Gato g1 = new Gato("Pepe", "Pepe.jpg");
                Gato g2 = new Gato("Garfield", "Garfield.jpg");
                Gato g3 = new Gato("Tom", "Tom.jpg");
                
                // Llamamos a métodos 'toString()'
                out.println(g1);
                out.println(g2);
                out.println(g3);

                // Llamamos a otros métodos.
                out.println(g1.maulla());
                out.println(g2.come("sardinas"));
            %>
        </body>
    </html>