# 11. Control de Excepciones.

Asegurarse que se está en el directorio ***java_poo_jsp_mvn/11_Excepciones***.

Programando en Java se pueden producir diferentes tipos de error. El más común es el que se produce en ***tiempo de compilación*** y generalmente ocurre cuando hay alguna sentencia que no está bien escrita, por ejemplo si falta un punto y coma al final de una
línea, cuando hay comillas o paréntesis que se abren pero no se cierran, al intentar asignar una cadena de caracteres a una variable que es de tipo entero, etc.

Existen otros errores que se producen en ***tiempo de ejecución*** a los que llamaremos ***excepciones***. El programa compila y se puede ejecutar pero, por algún motivo, se produce un fallo. Un buen programador debe preveer esta situación y debe saber encauzar el programa para que quede todo bajo control.

Abrimos con VSC el archivo ***ejemploExcepciones01.java*** y lo estudiamos.

```
code ./EjemploExcepciones.java
```

Compilamos el programa y observamos la salida en la terminal. Intenta calcular la media de un número y un texto, se producirá una excepción.

El bloque ***try - catch - finally*** sirve para encauzar el flujo del programa de tal forma que, si se produce una excepción, no se termine de forma drástica y se pueda reconducir la ejecución de una manera controlada.

El formato de este bloque es el siguiente:
```
try {
    Instrucciones que se pretenden ejecutar
    (si se produce una excepción puede que
    no se ejecuten todas ellas).
} catch {
    Instrucciones que se van a ejecutar
    cuando se produce una excepción.
} finally {
    Instrucciones que se van ejecutar tanto
    si se producen excepciones como si no
    se producen.
}
```


[Vamos al siguiente capítulo](../12)

