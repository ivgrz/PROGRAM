package Boletin9;

/**
 * @author ivan
 * @version 1.0
 */
public class Consumosalida {
    public static void main(String[] args) {

        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50);
        consumo1.setpGas(1.57);

        System.out.println("Datos do primeiro obxecto (constructor sen parámetros):");
        System.out.println("Litros: " + consumo1.getlitros() + " litros");
        System.out.println("Prezo da gasolina: " + consumo1.getpGas() + " €/litro");
        System.out.println("Tempo empregado: " + consumo1.getTiempo() + " horas");
        System.out.println("Consumo medio: " + consumo1.consumomedio() + " litros cada 100 km");
        System.out.println("Consumo en euros: " + consumo1.consumoEuros() + " € cada 100 km");
        System.out.println();

        Consumo consumo2 = new Consumo(300.0, 25.0, 80.0, 1.57);


        System.out.println("Consumo medio do 2º obxecto: " + consumo2.consumomedio() + " litros cada 100 km");


        consumo2.setLitros(30.0);
        System.out.println("Litros actualizados do 2º obxecto: " + consumo2.getlitros() + " litros");


        System.out.println("Velocidade media do 2º obxecto: " + consumo2.getvelocidadm() + " km/h");
    }
}