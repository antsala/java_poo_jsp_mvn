# 10. Operaciones con ficheros.

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


El paso de argumentos por línea de comandos es necesario si arrancamos la aplicación desde la terminal.

El siguiente ejemplo lee los parámetros. Posteriormente los podríamos procesar mediante un ***switch***.

Abrimos con VSC el archivo ***PruebaParametros.java*** y lo estudiamos.

```
code ./PruebaParametros.java
```

Compilamos el programa, tendrás que poner los parámetros desde la terminal. 

Cuando se procesa un archivo de texto, los pasos a seguir son los siguientes:

1. Leer una línea del fichero origen mientras quedan líneas por leer.
2. Modificar la línea (normalmente utilizando los métodos que ofrece la clase String).
3. Grabar la línea modificada en el fichero destino.
4. Volver al paso 1.

Es recomendable usar la clase String para procesar el archivo, ya que sus métodos hacen todo lo que necesitamos. Aquí tienes su documentación: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

El siguiente ejemplo abre procesa un archivo y sustituye los tabuladores por 2 espacios en blanco.


Abrimos con VSC el archivo ***PruebaString.java*** y lo estudiamos.

```
code ./PruebaString.java
```

Compilamos el programa, pasamos el archivo original en la línea de comando de la terminal.


[Vamos al siguiente capítulo](../11_Excepciones/_Contenido.md)

