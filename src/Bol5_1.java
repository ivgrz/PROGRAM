import java.util.Scanner;

public class Bol5_1 {
    public static void main(String[] args) {
    int x = 0, cantE = 0, cantcero = 0, cantneg = 0;
        Scanner sc= new Scanner(System.in);
        for (;x<10;x++){
            System.out.println("introduce un numero");
            x = sc.nextInt();
            if (x > 0){
                cantE++;
            }
            else {
                cantcero++;
            }
            if (x < 0){
                cantneg++;
            }





        }
        System.out.println("hay " + cantE + " numeros enteros");
        System.out.println("hay " + cantcero + " ceros");
        System.out.println("hay " + cantneg + " numeros negativos");
    }
}