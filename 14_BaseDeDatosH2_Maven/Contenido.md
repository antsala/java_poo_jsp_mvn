# Acceso a base de datos H2 con Maven.

## 01. ¿Qué es una base de datos H2?

Es un motor de base de datos SQL escrito en Java. Sus características más importantes son:

* Es Open Source, muy rápido y compatible con la API JDBC.
* Tiene la capacidad de crear BBDD en memoria, por lo que es muy apropiado para entornos de formación o PoC.
* Dispone de una consola de administración con interfaz web.
* Ocupa muy poco. El archivo ***jar*** ocupa alrededor de 2.5 MB.
* Puede ser incrustado en las aplicaciones Java.

## 02. Descarga de H2.

H2 se descarga de la siguiente url:
```
https://h2database.com/html/main.html
```

Debemos descargar la versión comprimida, que es multiplataforma.

![Descarga zip](../img/202306281153.png)

Descomprímela y mueve la carpeta descomprimida a la ruta ***C:\Archivos de programa\Java***. Luego localiza el ejecutable (archivo jar) de H2, como muestra la imagen.
(Nota: La versión de H2 descargada puede ser diferente)

![Ruta](../img/202306281201.png)

## 03. Usar la consola web de H2.

Para poder acceder a la consola web  de H2 y gestionar las bases de datos SQL debemos iniciarla.

Para ello, abrimos una consola de comandos, y cambiamos al directorio donde hemos descargado el jar de H2.
(Nota: la ruta puede ser diferente. Es mejor usar el Explorador de archivos y copiar el path a la carpeta ***bin***)

```
cd "C:\Program Files\Java\h2-2022-06-13\h2\bin"
```


Iniciamos la consola web de H2 con el siguiente comando.
(Nota: En nombre del archivo jar puede ser de una version diferente)

```
java -jar h2-2.1.214.jar
```

El navegador abrirá la consola web de H2. Observa como se va a conectar a una base de datos llamada ***test*** (En el directorio por defecto del usuario). Debes poner una contraseña para acceder de aquí en adelante. Te recomiendo poner ***Pa55w.rd***.

![Consola web](../img/202306281213.png)

Ma minimizamos para usarla en breve.

Se abrirá la consola de administración de H2.

![Consola web](../img/202306281219.png)

Vamos a proceder a crear una pequeña tabla. Para ello, en el campo ***SQL statement***, pegamos el siguiente comando.

```
create table alumnos (ID int primary key, Nombre varchar(48), Apellidos varchar(48));
```

Haz clic en el botón ***Ejecutar***.

Como podrás comprobar, se ha creado la tabla con sus tres columnas.

![Create table](../img/202306281239.png)

Prueba a dar de alta un par de alumnos. Para ello puedes ejecutar el siguiente código SQL.

```
insert into alumnos values (1, 'Jaime', 'Tralleta');
insert into alumnos values (2, 'Andrés', 'Trozado');
insert into alumnos values (3, 'Aitor', 'Menta');
insert into alumnos values (4, 'Dolores', 'Fuertes de Barriga');
```

Comprueba que los registros se han añadido.

```
select * from alumnos;
```

![Resultado inser](../img/202306281243.png)





