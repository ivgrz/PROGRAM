import java.util.Scanner;

public class Boletin8ej1 {

    /**
     * Boletin 8 ejercicio1
     * @version 1.0
     * @author iv
     */
        /**
         * Desde donde es el menu
         * @param args
         */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String frase = "";
            int eleccion = 0;
            System.out.println("Escribe una palabra");
            frase = sc.nextLine();
            do {
                System.out.println("Elige que deseas hacer");
                System.out.println("1. imprimir los dos caracteres iniciales");
                System.out.println("2. imprimir los dos ultimos caracteres");
                System.out.println("3. imprimir la cadena cada dos caracteres");
                System.out.println("4. imprime la cadena en sentido inverso");
                System.out.println("5. salir");
                eleccion = sc.nextInt();

                if(eleccion == 1){
                    dosprimero(frase);
                }
                if (eleccion == 2){
                    tresultimos(frase);
                }
                if (eleccion == 3){
                    cadados(frase);
                }
                if (eleccion == 4){
                    inversa(frase);
                }
            }while(eleccion != 5);



        }

        /**
         * primera
         * @param f
         */
        public static void dosprimero(String f){

            System.out.println(f.substring(0,2));
        }
        public static void tresultimos(String fr){

            System.out.println(fr.substring(fr.length()-3,fr.length()));
        }
        public static void cadados(String ff){
            for (int i = 0; i < ff.length(); i = i+2){
                System.out.println(ff.charAt(i));
            }

        }
        public static void inversa(String fras){
            String inverso = new StringBuilder(fras).reverse().toString();
            System.out.println(fras);
            System.out.println(inverso);
        }

    }


