import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el número que estoy pensando.");
        System.out.print("Introduce un número entre el 1 y el 100: ");

        String linea = scanner.nextLine();
        int n = Integer.parseInt(linea);

        if ((n < 1) | (n > 100)) {
            System.out.println("El número introducido debe estar en el intervalo 1 - 100.");
            System.out.print("Tienes otra oportunidad, introduce un número: ");
            linea = scanner.nextLine();
            n = Integer.parseInt(linea);
        }
        if (n == 24) {
            System.out.println("¡Enhorabuena!, ¡has acertado!");
        } else {
            System.out.println("Lo siento, ese no es el número que estoy pensando.");
        }

        scanner.close();
    }
}
