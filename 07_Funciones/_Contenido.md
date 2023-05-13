# 07. Control de Flujo.


Una función es un trozo de código que realiza una tarea muy concreta y que se puede
incluir en cualquier programa cuando hace falta resolver esa tarea. Opcionalmente,
las funciones aceptan una entrada (parámetros de entrada) y devuelven una salida.


Abrimos con VSC el archivo ***07_Funciones/NumeroPrimoConFuncion.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.

Si la función ***esPrimo()*** va a ser usada en tres programas diferentes se puede copiar y pegar su código en cada uno de los programas, pero hay una solución mucho más elegante y práctica.

Las funciones de un determinado tipo (por ejemplo funciones matemáticas) se pueden agrupar para crear un paquete (package) que luego se importará desde el programa que necesite esas funciones.

Cada paquete se corresponde con un ***directorio***. Por tanto, si hay un paquete con nombre ***matematicas*** debe haber un directorio llamado también matematicas en la misma ubicación del programa que importa ese paquete (normalmente el programa principal).

Las funciones se pueden agrupar dentro de un paquete de dos maneras diferentes. Puede haber subpaquetes dentro de un paquete; por ejemplo, si quisiéramos dividir las funciones matemáticas en funciones relativas al cálculo de áreas y volúmenes
de figuras geométricas y funciones relacionadas con cálculos estadísticos, podríamos crear dos directorios dentro de matematicas con nombres ***geometria*** y ***estadistica*** respectivamente.

Estos subpaquetes se llamarían ***matematicas.geometria*** y ***matematicas.estadistica***.

Nota: Los paquetes no son clases, por eso la primera letra no va en mayúscula.

Otra manera de agrupar las funciones dentro de un mismo paquete consiste en crear varios ficheros dentro de un mismo directorio. En el ejemplo vamos a crear un paquete con nombre ***matematicas*** que contenga dos clases: ***Varias*** (para funciones matemáticas de propósito general) y ***Geometria***. Observa como se ha creado una carpeta con nombre ***matematicas*** que contiene los ficheros ***Varias.java*** y ***Geometria.java***.

Abrimos con VSC el archivo ***07_Funciones/matematicas/Varias.java*** y lo estudiamos.

Abrimos con VSC el archivo ***07_Funciones/matematicas/Geometria.java*** y lo estudiamos.

Es el momento de que el programa principal importe las definiciones de nuestras clases.

Abrimos con VSC el archivo ***07_Funciones/matematicas/Varias.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.

En Java, como en la mayoría de lenguajes de programación existen dos maneras de pasar parámetros: por ***valor*** y por ***referencia***.

Cuando se pasa un parámetro por valor, en realidad se pasa una copia de la variable, únicamente importa el valor. Cualquier modificación que se le haga a la variable que se pasa como parámetro dentro de la función no tendrá ningún efecto fuera de la
misma.


Abrimos con VSC el archivo ***07_Funciones/PruebaParametros1.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.


Cuando se pasa un parámetro por referencia, por el contrario, sí se modifica su valor dentro de la función, los cambios se mantienen una vez que la función ha terminado de ejecutarse.

En la mayoría de los lenguajes de programación es el programador quien decide cuándo un parámetro se pasa por valor y cuándo se pasa por referencia. 

En Java ***no podemos*** elegir. Todos los parámetros que son de tipo ***int***, ***double***, ***float***, ***char*** o ***String*** se pasan ***siempre por valor*** mientras que los ***arrays*** (y los objetos cuando los veamos) se pasan siempre por referencia.

Esto quiere decir que cualquier cambio que efectuemos en un array que se pasa como parámetro permanece cuando termina la ejecución de la función, por lo que hay que tener especial cuidado en estos casos.

Abrimos con VSC el archivo ***07_Funciones/PruebaParametrosArray.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.


[Vamos al siguiente capítulo](../08_POO/_Contenido.md)
