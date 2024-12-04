import java.util.Scanner;

public class FIFO {
    public static void main(String[] args) {
        int list[];
        int inicio = -1;
        list = new int[5];

        inicio = apilar(list, inicio, 5);
        inicio = apilar(list, inicio, 6);
        inicio = apilar(list, inicio, 7);
        inicio = apilar(list, inicio, 8);
        inicio = apilar(list, inicio, 9);
        inicio = apilar(list, inicio, 10);
        inicio = apilar(list,inicio,11);
    }
    public static int apilar(int tabla[],int ini, int o){
    Scanner sc = new Scanner(System.in);


            if (ini < tabla.length-1){
                tabla[ini + 1] = o;
                ini ++;
                System.out.println("Numero "+ o + " registrado");
            }
            else if (ini > tabla.length){
                System.out.println("La lista esta desbordada bobi");
            }
        return ini;
    }


    }

