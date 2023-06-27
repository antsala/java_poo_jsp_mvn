***01 Biblioteca arrays bidimensionales***
Crea una biblioteca de funciones para arrays de dos dimensiones de números enteros que contenga las siguientes funciones:
1. generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un número dentro de un array bidimensional. Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.
5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.

***02 Filtra números***
Crea la función de manejo de arrays que tenga la siguiente cabecera y luego haz lo que se pide.

public int[] filtraCon7(int x[]) ;

Devuelve un array con todos los números que contienen el 7 (por ej. 7, 27, 782) que se encuentren en otro array que se pasa como parámetro. El tamaño del array que se devuelve será menor o igual al que se pasa como parámetro.

Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio resulte más fácil, las repeticiones de números que contienen 7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si no existe ningún número que contiene 7 en el array x, se devuelve un array con el número -1 como único elemento.

***03 Concatena arrays***
Define la función concatena con la siguiente cabecera:
public static int[] concatena(int[] a, int[] b);
Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.

***04 Mezcla arrays***
Define la función mezcla con la siguiente cabecera:
public static int[] mezcla(int[] a, int[] b);
Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de mezclar los números de ambos de forma alterna, se coge un número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos los que quedan del otro.

***05 POO Vehículos***
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea también algún método específico para cada una de las subclases. 
Prueba las clases creadas mediante un programa con un menú como el que se muestra a continuación:

VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):

***06 POO Animales***
Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefine los métodos cuando sea necesario. Prueba las clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
Sólo se podrán instanciar objetos de las clases  Gato, Perro, Canario, Pinguino y Lagarto. 
Utiliza interfaces si lo crees necesario.
