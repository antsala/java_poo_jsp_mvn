package ejemplo_11;

public class ExcepcionAlturaFueraDeRango extends Exception {
    public ExcepcionAlturaFueraDeRango() {
        System.out.println("ExcepcionAlturaFueraDeRango: La altura está fuera del rango permitido.");
    }
}