import java.util.Scanner;

public class pruebaswitch {
    public static void main(String[] args) {
/**
 * Dado el mes q nos devuelva el numero de dias
 */
        System.out.println("Tecla el numero del mes (1-12)");

        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();

        int dias = switch (mes) {

            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                System.out.println("Error: valor del mes incorrecto");
                yield -1;
            }
        };
    if (dias != -1) {
        System.out.println("El numero de dias del mes " + mes + " es " + dias);
    }
    }
}