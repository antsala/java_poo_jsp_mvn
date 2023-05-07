package ejemplo_10;

public class Gato extends Animal implements Mascota, Comparable<Gato> { // Observa como se implementan dos interfaces.
    private String codigo;

    public Gato(String n, Sexo s, String c) {
        super(n, s);
        this.codigo = c;
    }

    // Esta es la implementación del método "compareTo()" que exige la interfaz
    // "Comparable"
    public int compareTo(Gato g) {
        return (this.getNombre()).compareTo(g.getNombre());
    }

    // Es buena práctica sobrecargar "equals", para indicar si es el mismo gato.
    // En este caso decidimos comparar con el código del animal.
    public boolean equals(Gato g) {
        return (this.getCodigo()).equals(g.getCodigo());
    }

    public String toString() {
        return (getNombre() + ": " + getSexo() + ": " + codigo);
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * Hace que el gato emita sonidos.
     */
    @Override
    public void hazRuido() {
        this.maulla();
        this.ronronea();
    }

    /**
     * Hace que el gato maulle.
     */
    public void maulla() {
        System.out.println("Miauuuu");
    }

    /**
     * Hace que el gato ronronee
     */
    public void ronronea() {
        System.out.println("mrrrrrr");
    }

    /**
     * Hace que el gato coma.
     * A los gatos les gusta el pescado, si le damos otra comida
     * la rechazará.
     *
     * @param comida la comida que se le ofrece al gato
     */
    @Override
    public void come(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    /**
     * Pone a pelear al gato contra otro animal.
     * Solo se van a pelear dos machos entre sí.
     *
     * @param contrincante es el animal contra el que pelear
     */
    @Override
    public void peleaCon(Animal contrincante) {
        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo() == Sexo.HEMBRA) {
                System.out.println("no peleo contra hembras");
            } else {
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }
}
