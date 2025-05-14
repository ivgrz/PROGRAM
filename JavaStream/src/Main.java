import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        FileReader entrada = null;
        try {
            entrada = new FileReader ("FicheroTexto.txt");
                int caracter;

            caracter = entrada.read();
            while (caracter != -1) {
                texto = texto + (char) caracter;
                caracter = entrada.read();
            }
        }catch (IOException e){
            System.out.println("Erro de entrada/saida" + e.getMessage());
        }finally {
            if (entrada != null){
            try{
                    entrada.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}