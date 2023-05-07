import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class EjemploFichero02 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./10_OperacionesFicheros/fruta.txt"));
            bw.write("naranja\n");
            bw.write("mango\n");
            bw.write("chirimoya\n");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}