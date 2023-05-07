package ejemplo_10;

/*
 * Como puedes ver, únicamente se escriben las cabeceras de los métodos que deben tener la/s clase/s que implemente/n 
 * la interfaz Mascota.
 */
public interface Mascota {
    String getCodigo();

    void hazRuido();

    void come(String comida);

    void peleaCon(Animal contrincante);
}
