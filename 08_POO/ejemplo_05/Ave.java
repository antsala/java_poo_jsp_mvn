package ejemplo_05;

public class Ave extends Animal {
    public Ave(Sexo s) {
        super(s); // Llamada a constructor de la clase base (Animal)
    }

    public Ave() {
        super(); // Llamada a constructor de la clase base (Animal)
    }

    /**
     * Hace que el ave se limpie.
     */
    public void aseate() {
        System.out.println("Me estoy limpiando las plumas");
    }

    /**
     * Hace que el ave levante el vuelo.
     */
    public void vuela() {
        System.out.println("Estoy volando");
    }
}
