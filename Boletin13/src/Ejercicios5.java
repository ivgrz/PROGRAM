import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios5 {
    /*
    Deseña a aplicación que solicite por consola números enteiros ata que se introduce o -1.
    Os números positivos se gardarán nunha colección.
    O programa mostrará por pantalla os enteiros apuntados cun índice par, multiplicados por 100.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;
        do{
            System.out.println("Inserte un numero");
            numero = scanner.nextInt();
            if (numero > 0){
                numeros.add(numero);
            }else {
                System.out.println("El numero no es positivo");
            }

        }while (numero != -1);
        System.out.println("Los numeros pares son(multiplicado por 100):");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(numeros.get(num) * 100);
            }

        }

    }


}
