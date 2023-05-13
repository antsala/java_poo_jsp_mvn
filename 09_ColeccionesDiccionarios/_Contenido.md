# 09. Colecciones y Diccionarios.


Una ***colección*** en Java es una estructura de datos que permite almacenar muchos valores del mismo tipo; por tanto, conceptualmente es prácticamente igual que un array. Según el uso y según si se permiten o no repeticiones, Java dispone de un amplio
catálogo de colecciones: ***ArrayList*** (lista), ***ArrayBlockingQueue*** (cola), ***HashSet*** (conjunto), ***Stack*** (pila), etc. 

Vamos a estudiar la colección ArrayList, para el resto, te recomendamos que consultes la documentación: https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

Un ArrayList es una estructura en forma de lista que permite almacenar elementos del mismo tipo (pueden ser incluso objetos); su tamaño va cambiando a medida que se añaden o se eliminan esos elementos.

En capítulos anteriores hemos podido comprobar la utilidad del array; No obstante, el array presenta algunos inconvenientes. Uno de ellos es la necesidad de conocer el tamaño exacto en el momento de su creación. Una colección, sin embargo, se crea sin que se tenga que especificar el tamaño. Posteriormente se van añadiendo y quitando elementos a medida que se necesitan.

Trabajando con arrays es frecuente cometer errores al utilizar los índices; por ejemplo al intentar guardar un elemento en una posición que no existe (índice fuera de rango). Aunque las colecciones permiten el uso de índices, no es necesario indicarlos siempre.

Por ejemplo, en una colección del tipo ***ArrayList***, cuando hay que añadir el elemento "Amapola", se puede hacer simplemente ***flores.add("Amapola")***. Al no especificar índice, el elemento "Amapola" se añadiría justo al final de ***flores*** independientemente del tamaño y del número de elementos que se hayan introducido ya.

Los principales métodos que podemos usar con un ArraList los encontramos en la documentación: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#method.summary. 

Para cada nueva clase que vayas a usar de un framework, es muy importante que estudies su documentación primero.

Ahora vamos a probar la ***ArrayList***.

Abrimos con VSC el archivo ***09_ColeccionesDiccionarios/PruebaArrayList01.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.

Ahora usamos el método ***removeIf()***.

Abrimos con VSC el archivo ***09_ColeccionesDiccionarios/PruebaArrayList02.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.

Una colección ArrayList puede contener objetos que son instancias de clases definidas por el programador. Esto es muy útil sobre todo en aplicaciones de gestión para guardar datos de alumnos, productos, libros, etc.

En el siguiente ejemplo, definimos una lista de gatos. En cada posición de la lista se almacenará un objeto de la clase Gato.

En esta ocasión hemos modificado la clase ***Animal*** para que almacene el nombre. Observa la clase y como se ha creado un constructor nuevo que inicializa el nombre del animal.

Abrimos con VSC el archivo ***09_ColeccionesDiccionarios/ejemplo_09/Animal.java*** y lo estudiamos.

Abrimos con VSC el archivo ***09_ColeccionesDiccionarios/PruebaArrayList03.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.

Los elementos de una ***ArrayList*** se pueden ordenar con el método ***sort()***, pero solo para los tipos primitivos (int, double, String, ...) Si queremos que se ordene un array de objetos de nuestra clase, debemos indicar a Java como queremos que se ordene.

Para ello, debemos indicar que la clase implementa la interfaz ***Comparable***, que nos obliga a definir el método ***compareTo()*** que establecerá la ordenación de los gatos.

Podemos ordenar por lo que deseemos, por el nombre del gato, por su sexo o por su identificación. El método ***compareTo()*** debe devolver un ***0*** si los elementos a comparar son iguales. un número ***negativo*** si el primer elemento que se compara es menor que el segundo y, un número ***positivo*** en caso contrario.

Abrimos con VSC el archivo ***09_ColeccionesDiccionarios/ejemplo_10/Gato.java*** y lo estudiamos.

Ahora solo queda probar.

Abrimos con VSC el archivo ***09_ColeccionesDiccionarios/PruebaArrayList04.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.


Imagina un diccionario inglés-español. Queremos saber qué significa la palabra “stiff ”. Sabemos que en el diccionario hay muchas entradas y en cada entrada tenemos una palabra en inglés y su correspondiente traducción al español. 

Un diccionario en Java funciona exactamente igual. Contiene una serie de elementos que son las entradas que a su vez están formadas por un par (***clave***, ***valor***). 

La clave(key) permite acceder al valor. No puede haber claves duplicadas. 

Java dispone de varios tipos de diccionarios: ***HashMap***, ***EnumMap***, ***Hashtable***, ***IdentityHashMap***, ***LinkedHashMap***, etc. Nosotros estudiaremos el diccionario ***HashMap***. Aquí tienes la documentación de esta clase: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html


Abrimos con VSC el archivo ***09_ColeccionesDiccionarios/PruebaHashMap01.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.


[Vamos al siguiente capítulo](../10_OperacionesFicheros/_Contenido.md)

