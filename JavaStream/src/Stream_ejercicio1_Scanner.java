import java.io.*;
import java.util.Scanner;
// Ejercicio 1: Leer un fichero de texto que contiene números enteros separados por espacios y calcular la suma y el promedio de esos números.
public class Stream_ejercicio1_Scanner {
    public Stream_ejercicio1_Scanner(String RutaFicheriro){
        BufferedReader entrada = null;
        try{
            int suma = 0, cantidad = 0;
            entrada = new BufferedReader(new FileReader(RutaFicheriro));
            String linea = entrada.readLine();
            while (linea != null) {
                Scanner sc = new Scanner(linea);
            while (sc.hasNext()){
            suma = suma + sc.nextInt();
                cantidad++;
            }
            linea = entrada.readLine();
            }
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + (double) suma / cantidad);
            }catch (FileNotFoundException e){
            System.out.println("No se encuentra el fichero" + e.getMessage());
        } catch (IOException e){
            System.out.println("Error de entrada/salida" + e.getMessage());
        }
        finally {
            if (entrada != null){
                try {
                    entrada.close();
                }catch (IOException e){
                    System.out.println("Error al cerrar el archivo" + e.getMessage());
                }
            }
        }

    }
}
