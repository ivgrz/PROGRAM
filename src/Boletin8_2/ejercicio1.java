package Boletin8_2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe una cadena de caracteres: ");
        String cadena = sc.nextLine();
        int n = 0;
        dosprimeroscaract(cadena, n);
        ultimostrescaract(cadena);
        cadados(cadena);
        reversa(cadena);
    }

public static void dosprimeroscaract(String cadena, int n){

        for (int i = 0; i < 1; i++){
            String subcadena = cadena.substring(0,2);
            System.out.println(subcadena);

        }

}
    public static void ultimostrescaract(String cadena){

      if (cadena.length() >= 3){
                String subcad = cadena.substring(cadena.length()-3);
            System.out.println(subcad);
        }else
        System.out.println("cadena muy corta");
    }

    public static void cadados(String cadena){
        String rest = "";
        for (int i = 0; i<cadena.length(); i+=2){

               rest += cadena.charAt(i);

        }
        System.out.println("la cadena cada dos caracteres resulta en: "+ rest);
    }
    public static void reversa(String cadena){
        StringBuilder reverse = new StringBuilder(cadena);

        reverse.reverse();
        System.out.println(reverse);
    }


}
