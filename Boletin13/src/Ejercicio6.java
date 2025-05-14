import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    /*
    Codifica a aplicación que inserte nunha lista un conxunto de números enteiros entre 1 e 10. A partires desta lista crear:
Un conxunto cos elementos da lista sen repetir.
Un conxunto cos elementos repetidos.
Un conxunto cos elementos que só aparecen unha vez (únicos).

     */
    public static void main(String[] args) {
        Scanner recogedor = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList <Integer> repetidos = new ArrayList<>();
        ArrayList <Integer> unicos = new ArrayList<>();
        int numero = 0;

        do {
            System.out.println("Inserte un numero entre 1 y 10");
            numero = recogedor.nextInt();
            if (numero >= 1 && numero <= 10){
                numeros.add(numero);
            } else{
                System.out.println("el numero debe ser entre 1 y 10 bobin");
            }
        }while (numero != -1);

        for (int n : numeros){
            if (numeros.indexOf(n) != numeros.lastIndexOf(n)){
                    if (!repetidos.contains(n)){repetidos.add(n);
            }else if (!unicos.contains(n)){
                    unicos.add(n);}
            }
        }


        System.out.println("Lista de numeros: " + numeros);
        System.out.println("Lista de numeros repetidos: " + repetidos);
        System.out.println("Lista de numeros unicos: " + unicos);


    }




}
