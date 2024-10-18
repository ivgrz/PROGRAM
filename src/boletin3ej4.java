import java.util.Scanner;

public class boletin3ej4 {
    public static void main(String[] args) {

        int p1, p2, res;

        Scanner entradaTec;
        entradaTec = new Scanner(System.in);
        System.out.println("Introduce nombre de la primera persona:");
        String nombre = entradaTec.next();


        System.out.println("introduce el peso de la primera persona: ");
        p1 = entradaTec.nextInt();

        System.out.println("Introduce el nombre de la segunda persona:");
        String nombre2 = entradaTec.next();

        System.out.println("introduce el peso de la segunda persona:");
        p2 = entradaTec.nextInt();

        res = (p1 - p2);
        if (p1 > p2) {

            System.out.println("La persona que pesa mas es " + nombre);
            System.out.println("la diferencia de peso entre los dos es " + res);
        } else {
            System.out.println("La persona que pesa mas es " + nombre2);
            System.out.println("La diferencia entre sus pesos es " + (p2 - p1));
        }
    }
}


