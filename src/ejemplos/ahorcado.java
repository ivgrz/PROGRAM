package ejemplos;

import java.util.Scanner;
//Falta terminar
public class ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String palabraAdivinar = solicitaPalabra();
        System.out.printf(cadenaguiones(cadenadeguiones));
        int ronda = 0;
        boolean acierto = false;
        String letraopalabra = "";
        do {
            System.out.println("La palabra a adivinar es: " + cadenadeguiones);
            System.out.println("jugador 2: introduce la palabra o letra a adivinar");
            letraopalabra = sc.nextLine();
            if (letraopalabra.length() > 1){
                if (letraopalabra.equals(palabraAd)) acierto = true;
                   else System.out.println("La palabra es incorrecta");
            }else{
                comprobarLetraenpalabra(cadenadeguiones,letraopalabra);
                if (cadenadeguiones.equals(palabraAd)) acierto = true;
            }
            ronda++;
        }while (ronda < 7 || acierto == false);
        if (acierto) System.out.println("Acertaste" + palabraAd);
        else System.out.println("No acertaste, la palabra era: " + palabraAd);
    }
    public static String solicitaPalabra(){
        String palabra = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Escribe la palabra a adivinar");
            palabra = sc.nextLine();
            palabra = palabra.trim();
        }while (palabra.isEmpty());

    return palabra;
    }

    public static String cadenaguiones(String palabra){

        String cadguiones = "";
        for (int i = 0; i < palabra.length();i++){
            cadguiones = cadguiones + "-";//?
        }
        return cadguiones;

    }
    public static  String comprobarLetraenpalabra(String cadGuions, String letra, String palabra){
        char [] charsGuions = cadGuions.toCharArray();
        int inicio = 0, i;
        do {
            i = palabra.indexOf(letra, inicio);
            if (i>0) {
                charsGuions [i] = palabra.charAt(i);
                inicio = i + 1;
            }
        }while (i>0||i<palabra.length()-1);
        return new String (charsGuions);
    }


}

