
public class PruebaFiltraNumeros {
    /**
     * Devuelve un array con todos los números que contienen el 7 que se encuentren en otro array que se pasa como parámetro. 
     * El tamaño del array que se devuelve será menor o igual al que se pasa como parámetro.
     * @param x
     * @return Array del tamaño exacto de números que contengan el 7.
     */
    public static int[] fitraCon7(int x[]){

        /*Una forma que se me ha ocurrido es pasar el entero a cadena con valueOf y utilizar contains para ver si contiene el número 7
        Como el tamaño del array debe ser menor o igual, haré dos bucles, uno para saber el nº de elementos que contienen el 7
        Y otro para ir metiendolos en ese array, el cual inicializaré al tamaño del contador y no reservar memoria de más*/
        int contador = 0;
        for(int i = 0; i < x.length; i++){
            if(String.valueOf(x[i]).contains("7")){
                contador++;  //Incremento el contador cada vez que se cumpla la condición.
            }
        }

        if(contador == 0){  //Si el contador es 0 es porque no hay ningún elemento que contenga el 7, por lo que devuelvo -1 en un array.
            int resultado[] = {-1};
            return resultado;
        }
        else{
            int resultado[] = new int[contador]; //Creo el array del tamaño exacto
            int it = 0; //Creo un iterador para guardar los elementos que toquen en la posición correcta.
            for(int i : x){  //Voy a hacerlo con un foreach en este caso para practicarlo también.
                if(String.valueOf(i).contains("7")){
                    resultado[it] = i;  //Guardo el elemento.
                    it++; //Incremento el iterador para pasar a la siguiente posición.
                }
            }

            return resultado;
        }
    }

    public static void main(String[] args) {
        int array[] = {1,3,77,6778,71,11,90,77}; //Array de prueba
        int res[] = fitraCon7(array);
        for(int i : res){
            System.out.print(i + " "); //Imprimo el resultado
        }
    }
}