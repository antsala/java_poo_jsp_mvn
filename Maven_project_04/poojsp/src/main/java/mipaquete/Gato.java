package mipaquete; // Recuerda, la clase pertenece a un paquete (buena práctica)

public class Gato {
    private String nombre;
    private String imagen;

    public Gato(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        // En la carpeta 'img' del directorio 'webapp' tenemos las imagenes.
        return "<img src='./img/" + imagen + "' width='80'>Hola, soy " + nombre + "<br>";
    }

    public String maulla() {
        // En la carpeta 'img' del directorio 'webapp' tenemos las imagenes.
        return "<img src='./img/" + imagen + "' width='80'>Miauuuuuuuu<br>";
    }

    public String come(String comida) {
        // En la carpeta 'img' del directorio 'webapp' tenemos las imagenes.
        return "<img src='./img/" + imagen + "' width='80'>Estoy comiendo " + comida + "<br>";
    }
}