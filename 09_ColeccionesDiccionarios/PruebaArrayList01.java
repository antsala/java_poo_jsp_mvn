import java.util.ArrayList; // Necesario para que se encuentre la clase.

public class PruebaArrayList01 {
    public static void main(String[] args) {
        // Observa el uso del operador diamante para indicar el tipo del objeto al crear
        // el ArrayList.
        ArrayList<String> a = new ArrayList<String>();

        System.out.println("Nº de elementos: " + a.size());
        a.add("rojo");
        a.add("verde");
        a.add("azul");

        System.out.println("Nº de elementos: " + a.size());

        a.add("blanco");

        System.out.println("Nº de elementos: " + a.size());
        System.out.println("El elemento que hay en la posición 0 es " + a.get(0));
        System.out.println("El elemento que hay en la posición 3 es " + a.get(3));

        // Creamos un ArrayList de enteros.
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(18);
        b.add(22);
        b.add(-30);
        System.out.println("Nº de elementos: " + b.size());
        System.out.println("El elemento que hay en la posición 1 es " + b.get(1));

        // Ahora una de String.
        ArrayList<String> c = new ArrayList<String>();

        c.add("rojo");
        c.add("verde");
        c.add("azul");
        c.add("blanco");
        c.add("amarillo");
        System.out.println("Contenido de la lista: ");
        for (String color : c) { // Observa como se itera por el ArrayList.
            System.out.println(color);
        }
    }
}
