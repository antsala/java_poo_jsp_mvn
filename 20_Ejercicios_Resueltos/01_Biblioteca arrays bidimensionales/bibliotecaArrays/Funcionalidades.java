package bibliotecaArrays;  //Se ha hecho dentro de un paquete para luego importarlo en el caso de que a futuro se quiera llevar
                          //a diferentes clases.  

import java.util.Random; /*Importo la utilidad Random de java.util que me permite generar números enteros aleatorios con facilidad. También 
                            es posible usar la de Math, pero por costumbre siempre opto por esta*/

public class Funcionalidades{
    /**
     * 
     * Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
     * Se ha utilizado los números tanto de filas como de columnas como los mínimo y máximo para la generación de núimeros aleatorios
     * 
     * @param n Número de filas
     * @param m Número de columnas
     * @param minimo Número mínimo para el intervalo de los números aleatorios.
     * @param maximo Número máximo para el intervalo de los números aleatorios.
     * @return array n x m rellenado con números aleatorios.
     */
    public static int[][] generaArrayBiInt(int n, int m, int minimo, int maximo){
        Random r = new Random(); //Creo un objeto Random para ahora usarlo.

        int[][] arrayResultado = new int[n][m]; //Creo el array del tamaño que se ha obtenido de forma aleatoria.
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arrayResultado[i][j] = r.nextInt(maximo - minimo + 1) + minimo; /* De esta forma puedo generar un número aleatorio entre dos límites
                                                                                   ya que el aleatorio se genera entre 0 incluido y el número determinado
                                                                                   sin incluir*/
            }
        }
        
        return arrayResultado; //Devuelvo el array una vez lo he rellenado por completo
    }
    /**
     *  Devuelve la fila i-ésima del array que se pasa como parámetro.
     * 
     * @param i Fila i-ésima que se busca en la matriz.
     * @param array Array bidimensional del cual se obtendrá su fila.
     * @return Devuelve la fila obtenida.
     */
    public static int[] filaDeArrayBiInt(int i, int[][] array){
        
        int[] resultado = new int[array[i].length]; //Creo un array que será la fila resultado, lo haré del mismo tamaño de la fila.
        
        //Itero las columnas
        for(int x = 0; x < array[i].length; x++){
            resultado[x] = array[i][x]; //Almaceno en resultado el contenido de la fila i-ésima.
        }

        return resultado; //Devuelvo resultado.
    }
    /**
     * Devuelve la columna j-ésima del array que se pasa como parámetro.
     * @param j Columna j-ésima  del array que se pasa como parámetro
     * @param array Array bidimensional del cual se obtendrá la columna.
     * @return Devuelve la columna obtenida.
     */
    public static int[] columnaDeArrayBiInt(int j, int[][] array){
        int[] resultado = new int[array.length]; /*Creo un array ahora que será la columna resultado, con array.length tendre la cantidad de filas
                                                  que será el nº de elementos de una columna */
        
        //Itero las filas
        for(int x = 0; x < array.length; x++){
            resultado[x] = array[x][j]; //Almaceno en resultado el contenido de la fila i-ésima.
        }

        return resultado; //Devuelvo resultado.
    }
    /**
     * Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un número dentro de un array bidimensional. 
     * Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.
     * 
     * @param elemento Elemento que se busca dentro del array bidimensional,
     * @param array Array en el que se busca el elemento.
     * @return Un array de dos elementos para devolver las coordenadas.
     */
    public static int[] coordenadasEnArrayBiInt(int elemento, int[][] array){
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == elemento){
                    System.out.println("Se ha encontrado el elemento, las coordenadas son: i: " + i + " j: " + j);
                    int[] resultado = { i,j }; //Guardo las coordenadas y devuelvo el resultado.
                    return resultado;
                }
            }
        }
        //Si ha terminado el bucle y no se ha devuelvo nada significa que no ha encontrado el elemento, por lo que devolveré {-1,1}
        System.out.println("No se ha encontrado el elemento, se devuelve {-1,-1}");
        int[] resultado = { -1,-1 };    /*He mostrado las coordenadas desde la función
                                             pero he dejado que las devuelva para que se puedan usar si fuera necesario */
        return resultado;           
    }
    /**
     * Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
     * @param elemento Elemento para ver si es punto de silla.
     * @param array Array en el que se buscará el elemento.
     */
    public static void esPuntoDeSilla(int elemento, int[][] array){
        //Itero por el array bidimensional buscando el elemento
        int[] result = coordenadasEnArrayBiInt(elemento, array);
        boolean noEsPto = false;
        if(result[0] == -1){
            System.out.println("No se ha encontrado el elemento " + elemento + "dentro del array proporcionado");
        }else{
            int x = result[0];
            int y = result[1];
            for(int i = 0; i < array[y].length; i++){  //Primero itero por las filas para comprobar la condicion
                if(array[x][i] > elemento){
                    noEsPto = true;
                    System.out.println("No es punto de silla");
                    break;
                }
            }
            if(!noEsPto){  //Si resulta que por las filas no puede ser, compruebo columnas
                for(int j = 0; j < array.length; j++){
                    if(array[j][y] < elemento){
                        noEsPto = true;
                        System.out.println("No es punto de silla");
                        break;
                    }
                }
            }else{  //Si no se confirma ninguno de los 2 casos que hacen que NO sea punto de silla, significa que lo es
                System.out.println("El elemento " + elemento + "es un punto de silla");
            }


            
        }



    }

}