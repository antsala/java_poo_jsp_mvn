package ejemplo_05;

public class Animal {
    private Sexo sexo; // Se crea un miembro privado de la enumeración.

    public Animal() {
        sexo = Sexo.MACHO;
    }

    public Animal(Sexo s) {
        sexo = s;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String toString() {
        return "Sexo: " + this.sexo + "\n";
    }

    /**
     * Hace que el animal se eche a dormir.
     */
    public void duerme() {
        System.out.println("Zzzzzzz");
    }
}
