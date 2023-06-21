import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce un número entero: ");
        String linea = scanner.nextLine();

        int x = Integer.parseInt(linea);

        if (x < 0) {
            System.out.println("El número introducido es negativo.");
        } else {
            System.out.println("El número introducido es positivo.");
        }

        scanner.close();
    }
}