import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stream_ejercicio1 {
    public Stream_ejercicio1(String ruta) {

        try {
            int suma = 0, cantidad = 0;
            entrada = new ExemploBufferedReader(new FileReader(ruta));
            String linea = entrada.readLine();
            while (linea != null) {
                String[] numeros = linea.split(" ");
                for (String num : numeros) {
                    suma = suma + Integer.parseInt(num);
                    cantidad++;
                }

            }
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + (double) suma / cantidad);
        }catch (IOException e){
            System.out.println("Error de entrada/salida" + e.getMessage());
        }finally {
            if (entrada != null){
                try {
                    entrada.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}








