public class PruebaMezclaArrays{
    /**
     * Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de mezclar los números de ambos de forma alterna, se coge un número de a, luego de b, luego de a, etc. 
     * Los arrays a y b pueden tener longitudes diferentes; 
     * por tanto, si se terminan los números de un array se terminan de coger todos los que quedan del otro.
     * @param a Array de entrada.
     * @param b Array de entrada.
     * @return Un array resultado con la mezcla de ambos arrays de entrada.
     */
    public static int[] mezcla(int a[], int b[]) {
        
        int tam = a.length + b.length; //Calculo el tamaño para el vector resultado.
        int resultado[] = new int[tam];
        int i = 0; //Creo una variable para controlar el bucle while.
        int itA = 0; //Creo dos iteradores para controlar los elementos a tomar de cada array.
        int itB = 0;
        boolean cambio = true; /*Boolean para controlar de quien es el ultimo elemento, teniendo en cuenta que se empieza siempre con el primero
                                empieza en true para el array a y se cambiará a false para cuando queramos introducir uno de b*/
        while(i < tam){  //Debe ser menor que tam porque no debe de haber mas elementos.
            
            if(cambio){
                if(itA < a.length){   //Compruebo que sea el turno de A, si lo es compruebo que puedo meter elementos de A
                    resultado[i] = a[itA];
                    itA++;
                    cambio = false;
                }else{    //Si no puedo meter elementos de A, tonces meto el siguiente de B.
                    resultado[i] = b[itB];
                    itB++;
                }
            
            } else{     //Si no es el turno de A, es el de B
                if(itB < b.length){   //Compruebo que puedo meter un elemento de B.
                    resultado[i] = b[itB];
                    itB++;
                    cambio = true;
                }else{      //Si no puedo meter uno de B, es que me quede sin elementos, meto uno de A.
                    resultado[i] = a[itA];  
                    itA++;                  /*Es imposible que ambos arrays se queden sin elementos en la misma iteracion, entonces siempre tendré
                                            un elemento del otro array si de uno no puedo*/
                }
            }

            i++;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        //Haré igual que con la tarea 04.
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

            int resultado[] = mezcla(a, b);
            for(int i : resultado){
                System.out.print(i + " ");
            }

        } catch (NumberFormatException e) {
                System.out.println("ERROR: No se ha introducido un número entero, por favor, escriba solo números");
        } catch (NegativeArraySizeException na) {
                System.out.println("ERROR: Se ha introducido un entero negativo para el tamaño, por favor, introduzca solo enteros positivos");
        }
    }
}