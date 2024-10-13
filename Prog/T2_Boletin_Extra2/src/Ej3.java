import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los billetes de 100");
        int b100 = teclado.nextInt(); //son los billetes de 100

        System.out.println("Introduce los billetes de 20");
        int b20 = teclado.nextInt(); // son los

        System.out.println("Introduce los billetes de 5");
        int b5 = teclado.nextInt();

        System.out.println("Introduce las monedas de 1€");
        int m1 = teclado.nextInt();

        int total = (b100 * 100) + (b20 * 20) + (b5 * 5) + ( m1 * 1);
        System.out.println(total);











    }
}
