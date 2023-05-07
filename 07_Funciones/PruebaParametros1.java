public class PruebaParametros1 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n);
        calcula(n);
        System.out.println(n);
    }

    public static void calcula(int x) {
        /*
         * A pesar de que la variable que se pasa como parámetro se modifica dentro de
         * la función, los cambios no tienen ningún efecto en el programa principal.
         */
        x += 24;
        System.out.println(x);
    }
}
