package ejemplo_04;

public class Cuadrado {
    int lado;

    public Cuadrado(int l) {
        this.lado = l;
    }

    // Observa como se ha definido "toString()".
    public String toString() {
        int i, espacios;
        String resultado = "";
        for (i = 0; i < this.lado; i++) {
            resultado += "X";
        }
        resultado += "\n";
        for (i = 1; i < this.lado - 1; i++) {
            resultado += "X";
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += " ";
            }
            resultado += "X\n";
        }
        for (i = 0; i < this.lado; i++) {
            resultado += "X";
        }
        resultado += "\n";
        return resultado;
    }
}
