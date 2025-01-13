package ejemplos;

import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {
        String respuesta = "Messi";
        String letra = "";

        asignacion(respuesta);
    }
    public static void asignacion(String respuesta){

        Scanner sc = new Scanner(System.in);
        System.out.println("La palabra posee esta longitud:");
        System.out.println(respuesta.replaceAll("Messi","_____"));
        System.out.println("añade una letra");
        String letra = sc.nextLine();
        letra.equals(respuesta.);





    }
}

