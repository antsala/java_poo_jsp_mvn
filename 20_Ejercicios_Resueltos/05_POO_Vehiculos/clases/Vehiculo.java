package clases;
/**
 * Clase Vehículo
 */
public class Vehiculo {

    private static int vehiculosCreados;
    protected static int kilometrosTotales; //Lo pongo protected para que desde las clases hijas este valor pueda ser incrementado
    protected int kilometrosRecorridos;  //Lo pongo como protected para que lo puedan usar las clases hijas
    
    public Vehiculo(){
        kilometrosRecorridos = 0;
        vehiculosCreados++;
    }
    /**
     * Getter para vehiculos creados
     * @return Número de vehículos creados
     */
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    /**
     * Getter para los kilómetros totales
     * @return Número de kilómetros totales
     */
    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }
    /**
     * Getter para los kilómetros recorridos
     * @return Número de kilómetros recorridos
     */
    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
}