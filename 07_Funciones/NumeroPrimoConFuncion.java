import java.util.Scanner;

public class NumeroPrimoConFuncion {
    // Programa principal //////////////////////////////////////
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número entero positivo: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (esPrimo(n)) {
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }

        scanner.close();
    }

    // Funciones ///////////////////////////////////////////////
    /**
     * Comprueba si un número entero positivo es primo o no.
     * Un número es primo cuando únicamente es divisible entre
     * él mismo y la unidad.
     *
     * @param x un número entero positivo
     * @return <code>true</code> si el número es primo
     * @return <code>false</code> en caso contrario
     */
    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
