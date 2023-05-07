package ejemplo_05;

public class Pinguino extends Ave {
    public Pinguino() {
        super(); // Llamada a constructor de Animal.
    }

    public Pinguino(Sexo s) {
        super(s); // Llamada a constructor de Animal.
    }

    /**
     * Los pinguinos nos vuelan. Observa el uso de override.
     */
    @Override
    public void vuela() {
        System.out.println("No puedo volar");
    }
}
