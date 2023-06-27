import clases.Bicicleta;
import clases.Coche;
import clases.Vehiculo;

public class PruebaPOOVehiculo {
    public static void main(String[] args) {
        Coche coche = new Coche("Hyundai", "Ascent");
        Bicicleta bici = new Bicicleta("Scott");
        boolean salida = true; //Booleano para controlar el bucle, de esta forma puedo mantener el menú abierto siempre que quiera
        System.out.println("Menú");
        System.out.println("---------------");
        System.out.println("Seleccione entre las siguientes opciones:");
        System.out.println("1. Andar con la bicicleta");
        System.out.println("2. Hacer un caballito con la bicicleta");
        System.out.println("3. Andar con el coche");
        System.out.println("4. Quemar rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("---------------");
        try {
            while(salida){
                System.out.print("Introduzca una opción: ");
                int opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuánto ha andado la bici?: ");
                        int km = Integer.parseInt(System.console().readLine());
                        bici.andar(km);
                        System.out.println("");
                        break;
                    case 2:
                        bici.hacerCaballito();
                        break;
                    case 3:
                        System.out.print("¿Cuánto ha andado el coche?: ");
                        int kmCoche = Integer.parseInt(System.console().readLine());    
                        coche.andar(kmCoche);
                        System.out.println(""); 
                        break;
                    case 4:
                        coche.quemarRueda();
                        break;
                    case 5:
                        System.out.print("Kilómetros de la bicicleta: " + bici.getKilometrosRecorridos() + "\n");
                        break;
                    case 6:
                        System.out.println("Kilómetros del coche: " + coche.getKilometrosRecorridos() + "\n");
                        break;
                    case 7:
                        System.out.println("Kilómetros totales: " + Vehiculo.getKilometrosTotales() + "\n");
                        break;
                    case 8:
                        System.out.println("Hasta pronto");
                        salida = false;
                        break;
                    default:
                        System.out.println("Opción elegida incorrecta, vuelva a intentarlo.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca un número");
        }
        
    }
    
}
