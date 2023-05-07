package ejemplo_10;

public class Animal {
    private Sexo sexo; // Se crea un miembro privado de la enumeración.
    private String nombre;

    public Animal() {
        sexo = Sexo.MACHO;
    }

    public Animal(Sexo s) {
        sexo = s;
    }

    public Animal(String n, Sexo s) {
        nombre = n;
        sexo = s;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
