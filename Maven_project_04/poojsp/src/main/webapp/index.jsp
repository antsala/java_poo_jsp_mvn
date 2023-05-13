<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="mipaquete.Gato"%> <!-- Los imports de las clases se hacen así -->
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
                Gato g1 = new Gato("Pepe", "pepe.jpg");
                Gato g2 = new Gato("Garfield", "Garfield.jpg");
                Gato g3 = new Gato("Tom", "Tom.jpg");
                
                out.println(g1);
                out.println(g2);
                out.println(g3);
                out.println(g1.maulla());
                out.println(g2.come("sardinas"));
            %>
        </body>
    </html>