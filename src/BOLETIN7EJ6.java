import java.util.Scanner;

public class BOLETIN7EJ6 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("introduce un numero");
       int valorBuscado =sc.nextInt();
       int tabla[] = {2,3,4,6,7,8,9,24,34};
       int indice = buscarValor(tabla,valorBuscado);
        if (indice != -1){
            System.out.println("El indice es "+ indice);
        }
        else {
            System.out.println(-1);
        }
   }
    public static int buscarValor(int[] tabla,int valor){
       int inicio = 0;
       int fin = tabla.length -1;

       while (inicio<=fin){
           int medio = (inicio + fin)/2;
            if (tabla[medio] == valor){
                return medio;
            }
            else if (valor < tabla[medio]){
                fin = medio - 1;
            }else if (valor > tabla[medio]){
                inicio = medio + 1;
            }

       }

       for (int i=0; i< tabla.length; i++){
        if (tabla[i]==valor){
            return i;
        }

       }
   return -1;
   }


}