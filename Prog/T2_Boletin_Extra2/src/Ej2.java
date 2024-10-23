/**
 * Cambio temperatura
 * i
 */

import  java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double temperaturaCentigrado, tFahrenheit, tKelvin;
        System.out.println("Introduce la temperatura en grados centigrados");
        temperaturaCentigrado = teclado.nextDouble();

        tFahrenheit = (((temperaturaCentigrado * 9) /5) + 32);
        tKelvin = temperaturaCentigrado + (273.15);

        System.out.println(temperaturaCentigrado + " es equivalente a " + tFahrenheit + " en Fahrenheit y a " + tKelvin + " en Kelvin");


    }
}