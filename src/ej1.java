import java.util.Scanner;

public class ej1 {
    public static void main (String [] args){
    //Boletin 2 ejercicio 1
        double base, altura, area;
        base = 4;
        altura = 3;
        area = base * altura / 2;
        System.out.println(area);

    //Boletin 2 ejercicio 2
        double lado, areal;
        lado = 3;
        areal = lado * lado;
        System.out.println(areal);

    //Boletin 2 ejercicio 3
        double cambio, euros, dolares;

        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce el cambio dolar-euro del dia de hoy:");
        cambio = entradaTeclado.nextDouble();
        System.out.println("Introduce la cantidad de euros a cambiar");
        euros = entradaTeclado.nextDouble();
        dolares = euros/cambio;
        System.out.println(dolares + " dolares de cambio, por "+ euros+ "Euros.");
        entradaTeclado.close();



    }



}
