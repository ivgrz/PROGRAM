import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        int n1, n2, ns;
    Scanner sc = new Scanner(System.in);
        System.out.println("introduce el limite para la sucesion: ");
        int limite = sc.nextInt();
        System.out.println("introduce el primer numero");
        n1 = sc.nextInt();
        System.out.println("introduce el segundo numero");
        n2 = sc.nextInt();
        recursiva("hola ");
        for (int i = 0; i < limite; i++){

            ns = fibonacci(n1,n2);

            n1 = n2;
            n2 = ns;

        }




    }

    static void recursiva(String msg){
        System.out.println(msg);
        if (msg.length()<10) recursiva(msg+".");
    }
    static int  fibonacci(int a, int b){
        int suma = a + b;
        System.out.println(suma);

        return suma;
    }


}