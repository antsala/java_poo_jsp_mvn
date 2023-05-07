# 09. Colecciones y Diccionarios.

Asegurarse que se está en el directorio ***java_poo_jsp_mvn/10_OperacionesFicheros***.

Para trabajar con ficheros se importarán las clases necesarias mediante imports.

Todas las operaciones que se realicen sobre ficheros deberán estar incluidas en un bloque ***try-catch***. Esto nos permitirá mostrar mensajes de error y terminar el programa de una forma ordenada en caso de que se produzca algún fallo - el fichero no existe,
no tenemos permiso para acceder a él, etc.

Ahora vamos a ver la forma de abrir un archivo.

Abrimos con VSC el archivo ***PruebaArchivo01.java*** y lo estudiamos.

```
code ./PruebaArchivo01.java
```

Compilamos el programa y observamos la salida en la terminal.

La escritura en un fichero de texto es, si cabe, más fácil que la lectura. Solo hay que cambiar ***System.out.print("texto")*** por ***manejador.write("texto")***. Se pueden incluir ***saltos de línea***, ***tabuladores*** y ***espacios*** igual que al mostrar un mensaje por pantalla.

Es importante ejecutar ***close()*** después de realizar la escritura; de esta manera nos aseguramos que se graba toda la información en el disco.

El siguiente programa crea un fichero de texto y almacena tres palabras.

Abrimos con VSC el archivo ***PruebaArchivo02.java*** y lo estudiamos.

```
code ./PruebaArchivo02.java
```

Compilamos el programa y observamos la salida en la terminal.

En este caso vemos como hacer lecturas y escrituras combinadas. Para ello debemos crear varios manejadores.

Abrimos con VSC el archivo ***PruebaArchivo03.java*** y lo estudiamos.

```
code ./PruebaArchivo03.java
```

Compilamos el programa y observamos la salida en la terminal.


[Vamos al siguiente capítulo](../11)

