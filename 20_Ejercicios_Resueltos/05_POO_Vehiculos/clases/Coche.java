package clases;
public class Coche extends Vehiculo{
    
    private String marca;
    private String modelo;
    /**
     * Constructor parametrizado para la clase Coche
     * @param marca String
     * @param modelo String
     */
    public Coche(String marca, String modelo){
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Getter para el atributo marca
     * @return la marca del coche
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Getter para el atributo modelo
     * @return el modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Funcion que hace que el coche ande
     */
    public void andar(int km){
        System.out.println("Brummm");
        kilometrosRecorridos += km;
        kilometrosTotales += km;
    }

    /**
     * Funcion para quemar rueda con el coche
     */
    public void quemarRueda(){
        System.out.println("FFFFF....");
    }
}
