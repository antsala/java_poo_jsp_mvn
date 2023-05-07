# 06. Arrays.


Asegurarse que se está en el directorio ***java_poo_jsp_mvn/06_Arrays***.


Un ***array*** es un tipo de dato capaz de almacenar múltiples valores. Se utiliza para agrupar datos muy parecidos.


Abrimos con VSC el archivo ***Array01.java*** y lo estudiamos.

```
code ./Array01.java
```

Compilamos el programa y observamos la salida en la terminal.


Una forma mejor de definir el array.

Abrimos con VSC el archivo ***Array02.java*** y lo estudiamos.

```
code ./Array02.java
```

Compilamos el programa y observamos la salida en la terminal.


Para recorrer todos los elementos de un array se suele utilizar un bucle for junto con un índice que va desde 0 hasta el tamaño del array menos 1.

Abrimos con VSC el archivo ***Array03.java*** y lo estudiamos.

```
code ./Array03.java
```

Compilamos el programa y observamos la salida en la terminal.


En Java, a diferencia de otros lenguajes como Python, todos los elementos de un array deben ser del mismo tipo; por ejemplo, no puede haber un entero en la posición 2 y una cadena de caracteres en la posición 7 del mismo array. En el siguiente ejemplo creamos un array de caracteres.

Abrimos con VSC el archivo ***Array04.java*** y lo estudiamos.

```
code ./Array04.java
```

Compilamos el programa y observamos la salida en la terminal.


Ahora in array de números de tipo ***double***.

Abrimos con VSC el archivo ***Array05.java*** y lo estudiamos.

```
code ./Array05.java
```

Compilamos el programa y observamos la salida en la terminal.


Un array ***bidimensional**+ utiliza dos índices para localizar cada elemento. Podemos ver este tipo de dato como un array que, a su vez, contiene otros arrays. También se puede ver como una cuadrícula en la que los datos quedan distribuidos en filas y columnas.

Abrimos con VSC el archivo ***ArrayBi01.java*** y lo estudiamos.

```
code ./ArrayBi01.java
```

Compilamos el programa y observamos la salida en la terminal.

Los valores del array bidimensional se pueden proporcionar en la misma línea de la definición.

Abrimos con VSC el archivo ***ArrayBi02.java*** y lo estudiamos.

```
code ./ArrayBi02.java
```

Compilamos el programa y observamos la salida en la terminal.

Al trabajar con arrays es muy frecuente cometer errores utilizando los índices. El error más típico consiste en intentar acceder a un elemento mediante un índice que se sale de los límites y provocará una excepción. Para recorrer un array de un modo más práctico y sencillo, sin que tengamos que preocuparnos de los límites, podemos utilizar el bucle for con el formato ***foreach***. 

De esta forma indicamos simplemente el nombre del array que queremos recorrer y en qué variable se va a ir colocando cada elemento con cada iteración del bucle. No hay que especificar con qué índice comienza y termina el bucle, de eso se encarga Java.


Abrimos con VSC el archivo ***ArrayForEach.java*** y lo estudiamos.

```
code ./ArrayForEach.java
```

Compilamos el programa y observamos la salida en la terminal.


[Vamos al siguiente capítulo](../07_Funciones/_Contenido.md)

