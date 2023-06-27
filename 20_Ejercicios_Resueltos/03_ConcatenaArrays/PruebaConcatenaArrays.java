public class PruebaConcatenaArrays{
    
    /**
     * Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de concatenar ambos. 
     * @param a Array de entrada
     * @param b Array de entrada
     * @return Array final con la concatenacion del array a y el array b.
     */
    public static int[] concatena(int a[], int b[]){
        int tam = a.length + b.length; //Primero calculo el tamaño del nuevo array concatenado, para ello obtengo el de los dos arrays de entrada.
        int resultado[] = new int[tam];

        for(int i = 0; i < a.length; i++){   //Lleno el vector con los elementos del primer vector
            resultado[i] = a[i];
        }
        
        /*Uso el tamaño del primer vector para continuar por la siguiente posicion y simplemente sumo i para
        avanzar en las posiciones hasta poner los elementos del segundo vector.*/
        for(int i = 0; i < b.length; i++){  
            resultado[a.length + i] = b[i];  
        }
        

        return resultado;  //Devuelvo el resultado
    }

    public static void main(String[] args) {
        /*Voy a realizar a partir de ahora lectura de datos desde consola y añadiré también excepciones para controlar la introducción
         * de dato erróneos.
         */
        
        try {
            System.out.print("Tamaño del primer vector: ");     
            int tam1 = Integer.parseInt(System.console().readLine());
            System.out.print("Tamaño del segundo vector: ");
            int tam2 = Integer.parseInt(System.console().readLine());
        
            int a[] = new int[tam1];
            int b[] = new int[tam2];
        
            for(int i = 0; i < tam1; i++){
                System.out.print("Introduzca un numero para el primer vector: ");
                a[i] = Integer.parseInt(System.console().readLine());
                System.out.println();
            }

            for(int i = 0; i < tam2; i++){
                System.out.print("Introduzca un numero para el segundo vector: ");
                b[i] = Integer.parseInt(System.console().readLine());
                System.out.println();
            }

            int resultado[] = concatena(a,b);  
            
            System.out.print("Resultado: ");
            for(int i : resultado){    //Muestro por pantalla el resultado
                System.out.print(i + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println("ERROR: No se ha introducido un número entero, por favor, escriba solo números");
        } catch (NegativeArraySizeException na) {
            System.out.println("ERROR: Se ha introducido un entero negativo para el tamaño, por favor, introduzca solo enteros positivos");
        }
    }
}