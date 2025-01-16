package Boletin8_2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contra ="";


        if (PedirContrsena(contra)){
            System.out.println("si se pudo :P");
        }else {
            System.out.println("No se pudo :c");
        }
    }
    public static boolean PedirContrsena(String c){
        Scanner pedir = new Scanner(System.in);

        System.out.println("Añade una contraseña (debe ser de 8 caracteres, al menos una mayuscula y una minuscula)");
        c = pedir.nextLine();

            boolean numero = false;
            boolean mayuscula = false;
            boolean minuscula = false;

            if (c.length() >= 8){
                for (int i = 0; i < c.length();i++){
                    char letra;
                    letra = c.charAt(i);

                    if (Character.isDigit(letra)){
                     numero = true;
                    }

                    if (Character.isUpperCase(letra)){
                     mayuscula = true;
                    }

                    if (Character.isLowerCase(letra)){
                         minuscula = true;

                    }
                    if (numero && mayuscula && minuscula){
                        return  true;
                    }


                }





            }





        return false;
    }











}
