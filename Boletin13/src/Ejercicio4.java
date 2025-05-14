import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    /*
    Crea a aplicación onde se piden por consola números reais ata que se introduce un 0.
    A medida que se len do teclado, os valores positivos se introducen nunha colección  e os negativos noutra.
    A aplicación, mostrara as dúas coleccións e as sumas dos elementos de cada unha delas.
    O fin, eliminaranse das dúas coleccións os elementos maiores de 10 e menores de -10 e se voltan a mostrar.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double>  numerosPositivos = new ArrayList();
        ArrayList<Double>  numerosNegativos = new ArrayList();

        double numero = 0;

        do {
            System.out.println("Inserte un numero");
            numero = scanner.nextInt();
            if (numero > 0){
                numerosPositivos.add(numero);

            }else if (numero < 0){
                numerosNegativos.add(numero);
            }
        }while (numero != 0);
        System.out.println("Numeros positivos: " + numerosPositivos);
        System.out.println("Numeros negativos: " + numerosNegativos);
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        for (double num : numerosPositivos) {
            sumaPositivos += num;
        }
        for (double num : numerosNegativos) {
            sumaNegativos += num;
        }
        System.out.println("Suma de positivos: " + sumaPositivos);
        System.out.println("Suma de negativos: " + sumaNegativos);

        numerosPositivos.removeIf(num -> num > 10);
        numerosNegativos.removeIf(num -> num < -10);
        System.out.println("Numeros positivos sin los mayores de 10: " + numerosPositivos);
        System.out.println("Numeros negativos sin los menores de -10: " + numerosNegativos);




    }





}
