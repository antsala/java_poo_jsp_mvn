import matematicas.Varias;
import matematicas.Geometria;
import java.util.Scanner;

public class PruebaFunciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Prueba esPrimo()
        System.out.print("Introduzca un número entero positivo: ");
        n = Integer.parseInt(scanner.nextLine());
        if (matematicas.Varias.esPrimo(n)) { // Cualificamos la función.
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }

        // Prueba digitos()
        System.out.print("Introduzca un número entero positivo: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.println(n + " tiene " + matematicas.Varias.digitos(n) + " dígitos."); // Cualificamos la función.

        // Prueba volumenCilindro()
        double r, h;
        System.out.println("Cálculo del volumen de un cilindro");
        System.out.print("Introduzca el radio en metros: ");
        r = Double.parseDouble(scanner.nextLine());
        System.out.print("Introduzca la altura en metros: ");
        h = Double.parseDouble(scanner.nextLine());
        System.out.println("El volumen del cilindro es " + matematicas.Geometria.volumenCilindro(r, h) + " m3"); // Cualificamos
                                                                                                                 // la
        scanner.close();
    }
}
