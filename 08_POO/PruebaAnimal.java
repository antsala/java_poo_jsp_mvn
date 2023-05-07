import ejemplo_05.*;

public class PruebaAnimal {
    public static void main(String[] args) {
        Gato garfield = new Gato(Sexo.MACHO, "romano");
        Gato tom = new Gato(Sexo.MACHO);
        Gato lisa = new Gato(Sexo.HEMBRA);
        Gato silvestre = new Gato();

        System.out.println(garfield);
        System.out.println(tom);
        System.out.println(lisa);
        System.out.println(silvestre);

        Ave miLoro = new Ave();
        miLoro.aseate();
        miLoro.vuela();

        Pinguino pingu = new Pinguino(Sexo.HEMBRA);
        pingu.aseate();
        pingu.vuela();
    }
}
