# 02. Variables.

Escribiremos los nombres de variables en formato ***lowerCamelCase***. La primera letra se escribe en minúscula y, a continuación, si se utiliza más de una palabra, cada una de ellas empezaría con mayúscula. Por ejemplo, ***edadMin*** es un buen nombre para una variable que almacena la edad mínima a la que se puede acceder a un sitio web.

Observa que hemos usado una mayúscula para diferenciar dos partes (edad y Min). Puede que también encuentres nombres de variables con el carácter de subrayado ( _ ) de tal forma que el nombre de la variable sería edad_min, pero como hemos comentado es mejor usar el formato lowerCamelCase.

No se permiten símbolos como ***$, %, @, +, -,*** etc. Puedes usar números en los nombres de variables pero nunca justo al principio; ***5x*** no es un nombre válido pero ***x5*** sí lo es. No se debe poner una letra mayúscula al comienzo del nombre de una variable para no confundirla con una clase (los nombres de las clases comienzan por mayúscula).

Asegurarse que se está en el directorio ***java_poo_jsp_mvn/02_Variables***


Abrimos con VSC el archivo ***VariablesEnteras.java*** y lo estudiamos.

```
code ./VariablesEnteras.java
```

Compilamos el programa y observamos la salida en la terminal.


Usamos los tipos ***double*** o ***float*** cuando queremos (o esperamos) almacenar números con decimales en las variables. La diferencia está en la precisión, las variables de tipo double tienen mayor precisión que las de tipo float.


Abrimos con VSC el archivo ***VariablesConDecimales.java*** y lo estudiamos.

```
code ./VariablesConDecimales.java
```

Compilamos el programa y observamos la salida en la terminal.


Las ***cadenas de caracteres*** se utilizan para almacenar palabras y frases. Todas las cadenas de caracteres deben ir entrecomilladas mediante el símbolo de comillas dobles (").

Puede que te estés preguntando ¿por qué los tipos ***int***, ***long***, ***double*** y ***float*** empiezan por minúscula y ***String*** empieza por mayúscula? La respuesta es que String es en realidad una ***clase***, no un tipo primitivo. Veremos las clases en profundidad en el capítulo sobre la programación orientada a objetos.


Abrimos con VSC el archivo ***UsoDeStrings.java*** y lo estudiamos.

```
code ./UsoDeStrings.java
```

Compilamos el programa y observamos la salida en la terminal.


Un carácter suelto como una letra o un signo de puntuación se puede almacenar en una variable de tipo char. El carácter debe ir entrecomillado utilizando las comillas simples ('). Hay que tener en cuenta que no es lo mismo "a" que 'a'. Aunque el contenido en ambos casos es la letra ***a***, lo primero es una cadena de caracteres y lo segundo es un carácter. 


Abrimos con VSC el archivo ***UsoDeChar.java*** y lo estudiamos.

```
code ./UsoDeChar.java
```

Compilamos el programa y observamos la salida en la terminal.


Aquí tienes información sobre los tipos primitivos en Java: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html


Aquí tienes los operadores aritméticos que se usan en Java: https://docs.oracle.com/cd/E19253-01/819-6957/chp-typeopexpr-4/index.html


Abrimos con VSC el archivo ***UsoDeOperadoresAritmeticos.java*** y lo estudiamos.

```
code ./UsoDeOperadoresAritmeticos.java
```

Compilamos el programa y observamos la salida en la terminal.


La ***sentencia de asignación*** se utiliza para dar un valor a una variable. En Java (y en la mayoría de lenguajes de programación) se utiliza el símbolo igual ( = ) para este cometido. ***x = 7 + 1*** es una asignación en la cual se evalúa la parte derecha ***7 + 1***, y el resultado de esa evaluación se almacena en la variable que se coloque a la izquierda del igual. En el lado izquierdo debemos tener únicamente un nombre de variable.


Abrimos con VSC el archivo ***Asignaciones.java*** y lo estudiamos.

```
code ./Asignaciones.java
```

Compilamos el programa y observamos la salida en la terminal.


En ocasiones es necesario ***convertir*** una variable (o una expresión en general) de un tipo a otro. Simplemente hay que escribir ***entre paréntesis*** el tipo que se quiere obtener. 

Abrimos con VSC el archivo ***ConversionDeTipos.java*** y lo estudiamos.

```
code ./ConversionDeTipos.java
```

Compilamos el programa y observamos la salida en la terminal.



Vamos al siguiente capítulo.
```
cd ../03_EntradaDeDatos
```


