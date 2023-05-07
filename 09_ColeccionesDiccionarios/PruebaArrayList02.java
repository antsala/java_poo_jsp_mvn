import java.util.ArrayList;

public class PruebaArrayList02 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(7);
        a.add(14);
        a.add(32);
        a.add(3);

        System.out.println("Contenido de la lista: ");
        System.out.println(a);

        /*
         * Observa la sintaxis en el parámetro. Se borran aquellos números que
         * satisfacen el predicado.
         * Los predicados los veremos cuando tratemos las novedades de Java SE 8)
         */
        a.removeIf(numero -> numero < 10); // Se usa un predicado.

        System.out.println("Contenido de la lista después de borrar los menores de 10: ");
        System.out.println(a);
    }
}
