import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploBufferedReader {
    public ExemploBufferedReader(String Ruta) {
        String texto = "";
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader(Ruta));
            String linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada/saida: " + e.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}