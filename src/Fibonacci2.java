import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        int n1, n2, ns;
    Scanner sc = new Scanner(System.in);
        System.out.println("introduce el limite para la sucesion: ");
        int limite = sc.nextInt();

        n1 = 2;
        n2 = 3;

        for (int i = 0; i < limite; i++){
            ns = n1 + n2;
            System.out.println(ns);

            n1 = n2;
            n2 = ns;

        }

    }



}