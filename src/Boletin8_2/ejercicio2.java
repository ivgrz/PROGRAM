package Boletin8_2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una cadena de caracteres: ");

        String palabra = sc.nextLine();



        separacomas(palabra);
        remplazarespacios(palabra);
        reemplazardigitos(palabra);
        System.out.println(cadatres(palabra));

    }
    public static void separacomas(String cadena){
        for (int i = 0; i < 1; i++){
            String subcadena = cadena.replaceAll("|n",",");
            System.out.println(subcadena);
        }


    }
    public static void remplazarespacios(String cadena) {
        for (int i = 0; i < 1; i++) {
            String espacio = cadena.replace(' ', '_');
            System.out.println(espacio);

        }
    }
    public static void reemplazardigitos(String cadena){

        for (int i = 0; i < 1; i++){
            String reemplazo = cadena.replaceAll("\\d","X");
            System.out.println(reemplazo);
        }

    }
    public static String cadatres(String cadena){
        StringBuilder nuevacad = new StringBuilder();

        for (int i= 0; i  < cadena.length(); i++){
            nuevacad.append(cadena.charAt(i));
        if ((i + 1) % 3 == 0 && (i + 1) != cadena.length()){
            nuevacad.append(".");
        }


        }
        return  nuevacad.toString();

    }


}
