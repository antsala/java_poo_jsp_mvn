# 11. Control de Excepciones.

Programando en Java se pueden producir diferentes tipos de error. El más común es el que se produce en ***tiempo de compilación*** y generalmente ocurre cuando hay alguna sentencia que no está bien escrita, por ejemplo si falta un punto y coma al final de una
línea, cuando hay comillas o paréntesis que se abren pero no se cierran, al intentar asignar una cadena de caracteres a una variable que es de tipo entero, etc.

Existen otros errores que se producen en ***tiempo de ejecución*** a los que llamaremos ***excepciones***. El programa compila y se puede ejecutar pero, por algún motivo, se produce un fallo. Un buen programador debe preveer esta situación y debe saber encauzar el programa para que quede todo bajo control.

Abrimos con VSC el archivo ***11_Excepciones/EjemploExcepciones01.java*** y lo estudiamos.

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

Se pueden especificar varios ***catch*** para controlar diferentes excepciones como veremos más adelante. La parte ***finally*** es opcional.

El programa que calcula la media aritmética, con control de excepciones es ***11_Excepciones/EjemploExcepciones02.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Intenta calcular la media de un número y un texto, ahora tenemos control de excepciones y controlaremos los errores.

Se puede mostrar tanto el ***tipo de excepción*** como el ***error exacto*** que se produce. Para ello, se aplican los métodos ***getClass()*** y ***getMessage()*** respectivamente al objeto ***e***. El tipo de excepción viene dado por el nombre de una clase que es subclase de Exception.

Esta nueva versión del programa mostrará el tipo de la excepción que se está produciendo. Abrimos  ***11_Excepciones/EjemploExcepciones03.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Intenta calcular la media de un número y un texto, verás como aparece información del tipo de excepción.

La clase ***Exception*** hace referencia a una excepción genérica. Existen muchas subclases de ella como ***DataFormatException***, ***IOException***, ***IndexOutOfBoundsException***, etc.

Mediante la utilización de ***varios catch*** con diferentes subclases de Exception se pueden discriminar las distintas excepciones.

Esta versión del programa usará varios bloques ***catch***. Abrimos  ***11_Excepciones/EjemploExcepciones04.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Cuando pregunte el número total de asteriscos pon ***10*** y cuando te pida el número de líneas pon ***3***, verás como funciona correctamente.

Ahora vuelve a ejecutarlo y cuando te pida el número total de asterisco, escribes un valor con decimales, por ejemplo ***23.75***. Se producirá una excepción. 

Modificamos el ejemplo y procedemos a introducir dos bloques ***catch***. Abrimos ***11_Excepciones/EjemploExcepciones05.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Introduces valores con decimales o de texto, verás como cada bloque catch captura el error correspondiente.

La orden ***throw*** permite lanzar de forma explícita una excepción. Por ejemplo, la sentencia ***throw new ArithmeticException()*** crea de forma artificial una excepción igual que si existiera una línea como ***System.out.println(1 / 0);***.

Lo probamos. Abrimos ***11_Excepciones/EjemploExcepciones06.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Ejecutamos y comprobarás que se produce la excepción.

Hay que tener en cuenta que ***throw*** solo puede lanzar excepciones que pertenezcan a la clase ***Throwable***.

Como ***throw*** permite lanzar de forma explícita una excepción, nos servirá para lanzar excepciones propias como veremos más adelante. También es útil cuando se recoge la excepción en un método y luego, esa misma excepción se vuelve a lanzar para que
la recoja, a su vez, otro método y luego otro y así sucesivamente hasta llegar al main.

Vamos a ver cómo se recoge y se trata una excepción dentro de una función y, además es la propia función la que “pasa la bola” al main. Partimos de un ejemplo sin control de excepciones.

Abrimos ***11_Excepciones/EjemploExcepciones07.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Prueba a poner ***10*** manzanas a repartir entre ***5*** personas. Luego ejecútalo de nuevo introduciendo ***10*** manzanas y ***0*** personas, se producirá una excepción.

Mejoramos el ejemplo. Observa como en el bloque catch del método se captura la excepción y se envía al bloque main, que en consecuencia la capturará. Abrimos ***11_Excepciones/EjemploExcepciones08.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Introduce ***0*** como número de personas.

Hemos aprendido cómo lanzar una excepción desde un método con ***throw***. Es muy recomendable indicar de forma explícita en la cabecera que existe esa posibilidad, es decir, que el método en cuestión puede provocar una excepción. Se trata de una declaración de intenciones, algo parecido al ***@Override***. 

Vamos a modificar la cabecera de la función ***reparteManzanas()*** para incluir ***throws***. Debería quedar así.

```
public static int reparteManzanas(int manzanas, int personas) throws ArithmeticException
```

Abrimos ***11_Excepciones/EjemploExcepciones09.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Prueba y verás que funciona igual, pero quien lea el código fuente tendrá claro que el método lanza una excepción, y esto es una buena práctica.

Java nos permite crear ***excepciones propias***. Para ello, no hay másque utilizar una de las características más importantes de la programación orientada a objetos: ***la herencia***. Crear una nueva excepción será tan sencillo como implementar una ***subclase de Exception***.

Veamos paso a paso cómo crear y utilizar una excepción propia. Tenemos un programa que pinta por pantalla una pirámide, tras haber pedido la altura a un usuario. 

Abrimos ***11_Excepciones/EjemploExcepciones10.java*** y lo estudiamos.


Compilamos el programa y observamos la salida en la terminal. Aunque aún no hay control de excepciones, puedes ejecutar el programa para ver qué hace.

Vamos a crear una nueva excepción llamada ***ExcepcionAlturaFueraDeRango*** de tal forma que si alguien intenta pintar una pirámide con una altura menor que 1 o mayor que 10, salte el error y se pueda tratar con un bloque ***try - catch***.


Abrimos ***11_Excepciones/ejemplo_11/ExcepcionAlturaFueraDeRango.java*** y lo estudiamos.

Has visto como se define una clase para controlar una Excepción propia.

Ahora vamos a estudiar el ejemplo que hace uso de esta nueva clase de excepción que hemos creado.

Abrimos ***11_Excepciones/PruebaExcepcionPropia.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal. Prueba a introducir un valor válido. Luego ejecútalo de nuevo con valores fuera del margen. Verás el control de excepción funcionando.

[Vamos al siguiente capítulo](../12_AplicacionesWebJSP/_Contenido.md)

