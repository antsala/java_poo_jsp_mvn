import java.util.Scanner;

public class Array02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición del array y reserva de memoria en la misma línea. Esto es más
        // limpio.
        int[] x = new int[5];
        x[0] = 8;
        x[1] = 33;
        x[2] = 200;
        x[3] = 150;
        x[4] = 11;
        System.out.println("El array x tiene 5 elementos ¿cuál de ellos quiere ver?");
        System.out.print("Introduzca un número del 0 al 4: ");
        int indice = Integer.parseInt(scanner.nextLine());
        System.out.print("El elemento que se encuentra en la posición " + indice);
        System.out.println(" es el " + x[indice]);

        scanner.close();
    }
}