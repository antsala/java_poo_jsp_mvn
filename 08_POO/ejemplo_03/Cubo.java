package ejemplo_03;

public class Cubo {
    // atributos ////////////////////////////
    private int capacidad; // capacidad máxima en litros. Se declara privado para que solo se pueda acceder
                           // desde el getter.
    private int contenido; // contenido actual en litros. Idem.

    // métodos //////////////////////////////

    // constructor
    public Cubo(int c) {
        this.capacidad = c;
    }

    // métodos getter
    public int getCapacidad() {
        return this.capacidad;
    }

    public int getContenido() {
        return this.contenido;
    }

    // método setter
    public void setContenido(int litros) {
        this.contenido = litros;
    }

    // otros métodos
    public void vacia() {
        this.contenido = 0;
    }

    /**
     * Llena el cubo al máximo de su capacidad.
     */
    public void llena() {
        this.contenido = this.capacidad;
    }

    /**
     * Pinta el cubo en la pantalla.
     * Se muestran los bordes del cubo con el carácter # y el
     * agua que contiene con el carácter ~.
     */
    public void pinta() {
        for (int nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.contenido >= nivel) {
                System.out.println("#~~~~#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }

    /**
     * Vuelca el contenido de un cubo sobre otro.
     * Antes de echar el agua se comprueba cuánto le cabe al
     * cubo destino.
     */
    public void vuelcaEn(Cubo destino) {
        int libres = destino.getCapacidad() - destino.getContenido();
        if (libres > 0) {
            if (this.contenido <= libres) {
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            } else {
                this.contenido -= libres;
                destino.llena();
            }
        }
    }
}
