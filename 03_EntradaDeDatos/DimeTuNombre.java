import java.util.Scanner;

public class DimeTuNombre {
    public static void main(String[] args) {
        // Instancio objeto scanner para poder leer stdin.
        Scanner scanner = new Scanner(System.in);
        String nombre;

        System.out.print("Por favor, dime cómo te llamas: ");
        nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");

        // Cierro el stream.
        scanner.close();
    }
}