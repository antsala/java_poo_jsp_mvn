package clases;

public class Bicicleta extends Vehiculo{
    private String marca;
    /**
     * Constructor parametrizado para la clase Coche
     * @param marca String
     * @param modelo String
     */
    public Bicicleta(String marca){
        super();
        this.marca = marca;
    }

    /**
     * Getter para el atributo marca
     * @return la marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Funcion que hace que el bici ande
     */
    public void andar(int km){
        System.out.println("Ring ring");
        kilometrosRecorridos += km;
        kilometrosTotales += km;
    }

    /**
     * Funcion para hacer un caballito con la bicicleta
     */
    public void hacerCaballito(){
        System.out.println("riiing");
    }
}
