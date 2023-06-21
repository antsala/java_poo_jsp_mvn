# 03. Entrada de datos.


Para recoger datos por teclado usamos ***System.console().readLine()***. Cuando llegamos a esta sentencia, el programa se detiene y espera que el usuario introduzca información mediante el teclado. La introducción de datos termina con la pulsación de la tecla ***INTRO***. Una vez que el usuario presiona INTRO, todo lo que se ha tecleado se almacena en una variable.

NOTA IMPORTANTE PARA EL ENTORNO ECLIPSE.

En Eclipse y otros IDEs (esto no pasa en VSC) no se puede usar ***System.console().readLine()***. La razón es que estos IDEs usan ***javaw.exe*** en luhar de ***java.exe*** para ejecutar código Java. La diferencia reside en que ***javaw*** ejecuta JAva sin asociarlo a ninguna terminal o consola (lo cual es útil para el GUI), y pueste que no hay consola, ***System.console()*** devuelve ***null***.

Pero aunque no exista una consola asociada, eso no significa que no podamos comunicarnos con el proceso ***javaw***. Este proceso todavía soporta streams de entrada y salida estándar.

Por lo tanto, para poder leer la entrada estándar, tenemos dos soluciones. 

La primera hace uso de ***InputStreamReader*** y de ***BufferedReader***

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Hello. Please write your name: ");
String name = br.readLine();
System.out.println("Your name is: "+name);
```

La segunda, que es más simple, hace uso de ***Scanner***.
```
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
```

Así que si se usa Eclipse, no podemos usar ***Console.readLine()***.


Abrimos con VSC el archivo ***03_EntradaDeDatos/DimeTuNombre.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.

Si en lugar de texto necesitamos datos numéricos, deberemos convertir la cadena introducida en un número con el método adecuado. 
***Integer.parseInt()*** convierte el texto introducido por teclado en un dato numérico, concretamente en un número entero.


Abrimos con VSC el archivo ***03_EntradaDeDatos/LeeNumeros.java*** y lo estudiamos.

Compilamos el programa y observamos la salida en la terminal.


Aquí tienes más información para la conversión de cadenas a números y viceversa: https://docs.oracle.com/javase/tutorial/java/data/converting.html


[Vamos al siguiente capítulo](../04_ControlDeFlujo/_Contenido.md)

