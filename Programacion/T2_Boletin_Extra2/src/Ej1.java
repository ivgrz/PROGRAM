import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        double precioTarifa, precioPagado, descuento;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio tarifa");
        precioTarifa = teclado.nextDouble();

        System.out.println("Introduce el precio pagado");
        precioPagado = teclado.nextDouble();

        descuento = (precioTarifa - precioPagado) / precioTarifa * 100;
        System.out.println("El porcentaje de descuento es: " + descuento + "%" );

        if ( precioPagado > precioTarifa) {
            System.out.println("Error, intentelo de nuevo");

        }

    }
}