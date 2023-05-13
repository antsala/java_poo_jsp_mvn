# 13. Accesos a bases de datos (JDBC)

Asegurarse que se está en el directorio ***java_poo_jsp_mvn/13_MySQL_JDBC***.

JDBC significa ***Java Database Connectivity*** y es una API (interfaz de programación de aplicaciones) de Java que permite a los desarrolladores conectarse a bases de datos relacionales, como ***MySQL***, ***Oracle*** o ***PostgreSQL***, desde una aplicación Java.

JDBC proporciona un conjunto de clases e interfaces que permiten al programador enviar consultas SQL a una base de datos y recibir resultados de esas consultas en forma de objetos Java. Además, JDBC permite a los programadores manejar transacciones, controlar la concurrencia y realizar operaciones de administración de bases de datos, como crear o borrar tablas.

JDBC es una parte importante del ecosistema de Java para la creación de aplicaciones empresariales que necesitan interactuar con bases de datos. Los desarrolladores pueden usar JDBC para conectarse a cualquier base de datos compatible con JDBC, lo que hace que la aplicación sea independiente de la base de datos subyacente.

Lo primero que debemos hacer es instalar un servidor MySQL.

Lo descargamos de la siguiente URL:
```
https://dev.mysql.com/downloads/file/?id=518835
```

En ***Choosing a Setup Type*** elegimos ***Custom***.

En ***Select Products*** elegimos:

* MySQL Servers / MySQL Server / MySQL Server 8.0 / MySQL Server 8.x.x
* Applications / MySQL Workbench 8.0 / MySQL Workbench 8.x.x
* MySQL Shell / MySQL Shell 8.0 / MySQL Shell 8.x.x
* MySQL Router / MySQL Router 8.0 / MySQL Router 8.x.x
* MySQL Connectors / Connector/J / Connector/J 8.x.x

Continuar la instalación. Cuando termine, En ***Type and Networking*** verificar el puerto (3306)

En ***Authentication Method***, seleccionar ***Use Strong Password Encryption for Authentication (RECOMMENDED)***

Escribir el password del root.

Finalizar la instalación.

Buscar con cortana ***MySQL 8.0 Command Line Client***

Autenticarse y tenemos el prompt a la base de datos. También tenemos el workbench con interfaz gráfica.

Vamos a crear una aplicación Java para probar la conexión con la BD.

En la paleta de comandos (Ctrl + Mayús + P), buscamos: ***java: Create Java Project...*** y seleccionamos ***No build tools***.

Pedirá una carpeta para crear el proyecto. Pon el nombre que quieras. (Nota: En el repositorio tienes el proyecto ***Prueba_JDBC*** terminado en la carpeta ***13_MySQL_JDBC***, por si necesitas ayuda)


Localiza en el explorador el archivo ***App.java*** que está en la carpeta ***src*** del proyecto y renómbralo a ***Crear_DB.java***

Abrimos ***Prueba12.java***


```
code ./Prueba12.java
```

Copia todo el texto y pégalo en el archivo ***Crear_DB.java***, descartando el contenido que éste tuviera. A continuación estúdialo.
Pon el password de tu base de datos dond ese indica y garda el archivo.

```
code ./src/Crear_DB.java
```

Si lo compilas fallará. Es necesario indicar al compilador de Java dónde puede encontrar el driver JDBC para comunicarse con MySQL. 

Para ello, en el Exploador, localiza la sección ***Java Projects***. 



[Vamos al siguiente capítulo](../14)

