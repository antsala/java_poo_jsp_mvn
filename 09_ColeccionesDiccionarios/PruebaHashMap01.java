import java.util.HashMap; // Aquí está la definición de la clase HashMap.
import java.util.Map.Entry;; // Necesario para poder recorrer el diccionario como una colección.

public class PruebaHashMap01 {
    public static void main(String[] args) {

        // Usamos el operador diamante para indicar los tipos de la clave y del valor.
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(924, "Amalia Núñez");
        m.put(921, "Cindy Nero");
        m.put(700, "César Vázquez");
        m.put(219, "Víctor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito ");

        System.out.println("Los elementos de m son: \n" + m);

        // Para extraer elementos usamos el método 'get()'
        System.out.println(m.get(921));
        System.out.println(m.get(605));
        System.out.println(m.get(888));

        // Si queremos mostrar todas las entradas y recorrer el diccionario como una
        // colección, primero debemos
        // convertilo en un "entrySet", ya qie no se pueden sacar todas las entradas del
        // diccionario directamente.

        for (Entry<Integer, String> pareja : m.entrySet()) {
            System.out.println(pareja);
        }
    }
}
