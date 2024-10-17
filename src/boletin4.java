import java.util.Scanner;

public class boletin4 {
    public static void main(String[] args) {
//Ejercicio1
        int x;

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el nombre del articulo");
         String articulo = sc.nextLine();

        System.out.println("introduce la cantidad de ventas anuales");
        x = sc.nextInt();

        if (x<=100) {
            System.out.println("El articulo es de tipo bajo");
        }
        if (x>100 && x<=500) {
            System.out.println("El articulo es de tipo medio");
        }
        if (x>500 && x<= 100) {
                    System.out.println("El articulo es de tipo alto");
        }
        if (x>=1000){
                        System.out.println("El articulo es de primera necesidad");
        }


    }
}