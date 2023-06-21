import java.util.Scanner;

public class LeeNumeros {
    public static void main(String[] args) {
        // Instancio objeto scanner para poder leer stdin.
        Scanner scanner = new Scanner(System.in);
        String linea;

        System.out.print("Por favor, introduce un número: ");

        linea = scanner.nextLine();

        int primerNumero;
        primerNumero = Integer.parseInt(linea);

        System.out.print("introduce otro, por favor: ");

        linea = scanner.nextLine();

        int segundoNumero;
        segundoNumero = Integer.parseInt(linea);

        int total;
        total = (2 * primerNumero) + segundoNumero;
        System.out.print("El primer número introducido es " + primerNumero);
        System.out.println(" y el segundo es " + segundoNumero);
        System.out.print("El doble del primer número más el segundo es ");
        System.out.print(total);

        // Cierro el stream.
        scanner.close();
    }
}
