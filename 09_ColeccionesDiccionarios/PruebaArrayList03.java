import java.util.ArrayList;
import ejemplo_09.*;

public class PruebaArrayList03 {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();
        g.add(new Gato("Mia", Sexo.HEMBRA, "2323232"));
        g.add(new Gato("Curro", Sexo.MACHO, "2323232"));
        g.add(new Gato("Bicho", Sexo.MACHO, "2323232"));

        System.out.println("\nDatos de los gatos:\n");
        for (Gato gatoAux : g) {
            System.out.println(gatoAux + "\n");
        }
    }
}
