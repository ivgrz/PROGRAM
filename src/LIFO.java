import java.util.Scanner;

public class LIFO {
    public static void main(String[] args) {
        int list[];
        int inicio = -1;
        list = new int[5];

        inicio = apilar(list, inicio, 5);
        inicio = apilar(list, inicio, 6);
        inicio = apilar(list, inicio, 7);
        inicio = apilar(list, inicio, 8);
        inicio = apilar(list, inicio, 9);
        inicio = leer(list,inicio);
        inicio = leer(list,inicio);
        inicio = leer(list,inicio);
        inicio = leer(list,inicio);
        inicio = leer(list,inicio);
        inicio = leer(list,inicio);
        inicio = desapilar(list,inicio);
        inicio = desapilar(list,inicio);
        inicio = desapilar(list,inicio);
        inicio = desapilar(list,inicio);
        inicio = desapilar(list,inicio);
        inicio = desapilar(list,inicio);

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

    public static int leer(int listadol[], int x){
        if (x >= 0) {
            for (int i = 0; i >= 0; i--){
                System.out.println( listadol[i] + " Es un numero del listado");
            }
        }   else {
            System.out.println("Listado vacio");
        }

        return x;
    }

    public static int desapilar(int list[], int c){
        if (c >= 0){
            System.out.println("El valor quitado es: "+ list[c]);
            c--;
        }else {
            System.out.println("no hay nada pa quitar bobo");
        }



        return  c;
    }


}



