import java.io.*;
import java.util.Scanner;
// Ejercicio 1: Leer un fichero de texto que contiene números enteros separados por espacios y calcular la suma y el promedio de esos números.
public class Stream_ejercicio1_Scanner {
    public Stream_ejercicio1_Scanner(String RutaFicheiro){
        Scanner entrada = null;
        try{
            int suma = 0, cantidad = 0;

            entrada = new Scanner(new File(RutaFicheiro));

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                Scanner sc = new Scanner(linea);
            while (sc.hasNextInt()){
            suma = suma + sc.nextInt();
                cantidad++;
            }
            sc.close();
            }
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + (double) suma / cantidad);
            }catch (FileNotFoundException e){
            System.out.println("No se encuentra el fichero" + e.getMessage());
        }
        finally {
            if (entrada != null){

                entrada.close();

            }
            }
        }

    }

