public class SalidaFormateada02 {
    /*
     * En la casilla %-10s se inserta una cadena de caracteres. Esta cadena debe ir
     * entrecomillada. Se reservan 10 caracteres; si la cadena es más pequeña, se
     * rellena con espacios en blanco hasta completar las 10 posiciones. El guión
     * indica que la cadena se debe alinear a la izquierda (%-10s alinea a la
     * izquierda y %10s alinea a la derecha).
     * 
     * Dentro de la casilla %8.2f se inserta un número con decimales. Se reservan 8
     * caracteres para el número completo, incluyendo la coma decimal y se muestran
     * exactamente 2 decimales.
     * 
     * Por último, la casilla %6d muestra por pantalla un número entero colocado en
     * un hueco de 6 posiciones. Si el número ocupa menos, se rellena con espacios
     * en blanco.
     * 
     * Más información de formato aquí:
     * https://xperti.io/blogs/formatting-with-printf-in-java/
     */
    public static void main(String[] args) {
        System.out.println(" Artículo Precio/caja Nº cajas");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s %8.2f %6d\n", "manzanas", 4.5, 10);
        System.out.printf("%-10s %8.2f %6d\n", "peras", 2.75, 120);
        System.out.printf("%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
    }
}
