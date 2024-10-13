import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce suelo fijo");
        double sfijo = teclado.nextDouble();

        System.out.println("Importe total ventas");
        double ventas = teclado.nextDouble();

        System.out.println("Introduce km");
        double km = teclado.nextDouble();

        System.out.println("introduce dias de desplazamiento ");
        double desplazamiento = teclado.nextDouble();

        double comision = ventas * 0.05;
        double quilometraje = km * 2;
        double dieta = desplazamiento * 30;
        double sueldob = sfijo + comision + quilometraje + dieta;
        double irpf = sueldob * 0.18;
        double sliquido = (sueldob - irpf) - 36;

        System.out.println("El sueldo bruto es: " + sueldob);
        System.out.println("El sueldo liquido es: " + sliquido);







    }
}
