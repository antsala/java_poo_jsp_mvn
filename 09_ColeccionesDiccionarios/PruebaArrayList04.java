import java.util.ArrayList;
import java.util.Collections; // Necesario para llamar al método estático "sort()".

import ejemplo_10.*;

public class PruebaArrayList04 {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();
        g.add(new Gato("Mia", Sexo.HEMBRA, "2323232"));
        g.add(new Gato("Curro", Sexo.MACHO, "2323232"));
        g.add(new Gato("Bicho", Sexo.MACHO, "2323232"));

        Collections.sort(g);

        System.out.println("\nDatos de los gatos:\n");
        for (Gato gatoAux : g) {
            System.out.println(gatoAux + "\n");
        }
    }
}
