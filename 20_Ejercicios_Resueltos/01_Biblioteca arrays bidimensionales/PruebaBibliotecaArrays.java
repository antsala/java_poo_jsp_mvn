import bibliotecaArrays.Funcionalidades; //Importo el paquete para poder usar las funciones.

public class PruebaBibliotecaArrays {
    public static void main(String[] args) {
        
        /*Defino los valores fuera en vez de hacerlo por lectura de consola para que la prueba solo sea ejecutar y 
         * que no se tenga que escribir todo el rato para ir probandolas todas.
        * Voy a envolver los resultado con lineas de asteriscos para intentar facilitar la lectura de los resultados.
        */
        
        //Prueba generaArrayBiInt
        System.out.println("Prueba del método: generarArrayBiInt:");
        System.out.println("**************************");
        
        int minimo = 5; 
        int maximo = 9;
        int n = 3;
        int m = 5;
        int resultado[][] = Funcionalidades.generaArrayBiInt(n,m, minimo, maximo);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(resultado[i][j]);   //Muestro el resultado, pongo saltos de linea y espacios en blanco para darle un formato de matriz
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        System.out.println("**************************");
        System.out.println("");

        System.out.println("Prueba del método: filaDeArrayBiInt:");
        System.out.println("**************************");
        int filaIesima = 2;
        int resultado2[] = Funcionalidades.filaDeArrayBiInt(filaIesima, resultado); //Voy a aprovechar la matriz anterior para la prueba y ahorro tener que definir otra.
        for(int i = 0; i < resultado2.length; i++){
            System.out.print(resultado2[i] + " "); //Muestro la fila obtenida y dejo un espacio en blanco para dale formato
        }
        System.out.println(" ");
        System.out.println("**************************");


        System.out.println("");

        System.out.println("Prueba del método: columnaDeArrayBiInt:");
        System.out.println("**************************");
        int columnaJesima = 1;
        int resultado3[] = Funcionalidades.columnaDeArrayBiInt(columnaJesima, resultado); //Sigo aprovechando la matriz
        for(int i = 0; i < resultado3.length; i++){
            System.out.print(resultado3[i] + " "); //Muestro la fila obtenida y dejo un espacio en blanco para dale formato
        }
        System.out.println(" ");
        System.out.println("**************************");


        System.out.println("Prueba del método: coordenadasEnArrayBiInt:");
        System.out.println("**************************");
        
        int elemento = 5;
        Funcionalidades.coordenadasEnArrayBiInt(elemento, resultado); 
        System.out.println(" ");
        System.out.println("**************************");


        System.out.println("Prueba del método: esPuntoDeSilla:");
        System.out.println("**************************");
        int elemento2 = 7;
        int[][] prueba= {{1,2},{2,7},{5,9}};
        Funcionalidades.esPuntoDeSilla(elemento2, prueba);
        System.out.println(" ");
        System.out.println("**************************");

    }
}
