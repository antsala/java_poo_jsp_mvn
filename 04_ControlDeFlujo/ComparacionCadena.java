public class ComparacionCadena {
    public static void main(String[] args) {
        String miFruta = "naranja";

        if ("naranja".equals(miFruta)) { // Se llama al método "equals" de un objeto String ("naranja")
            System.out.println("iguales");
        } else {
            System.out.println("distintas");
        }
    }
}
