import java.util.Scanner;

/**
 * Analiza si el numero es positivo, negativo o cero
 * @version 1
 * @author ivan
 */
public class bol3ej3 {
    public static void main(String[] args) {
        int a;
        Scanner entradaTec;
        entradaTec = new Scanner(System.in);
        System.out.println("introduce un numero:");
        a = (int) entradaTec.nextDouble();


        if (a > 0) {
            System.out.println("+");
        }
        if (a < 0) {
            System.out.println("-");
        }
        if (a == 0) {
            System.out.println("0");
        }
    }
}