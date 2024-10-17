import java.util.Scanner;

public class boletin4_3 {
    public static void main(String[] args) {
        int x, v;
        Scanner et = new Scanner(System.in);
        System.out.println("Pon un numero sjafhas");
        x =et. nextInt();

        if(x<0) {
            v = (-1 * x);
            System.out.println("el valor absoluto de tu numero es " + v);
        }
        else {
            System.out.println("El valor absoluto de tu numero seria " + x);
        }
    }
}