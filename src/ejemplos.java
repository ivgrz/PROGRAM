import java.util.Scanner;

public class ejemplos {
    public static void main (String [] args) {

  /*      int grade = 85;

        if (grade > 88) {
            System.out.println("you made the honor roll");
        }
         else {
                System.out.println("Pasaste");
*/

//Boletin3, ej 1
/*
    int x;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("introduce un numero:");
        x = (int) entradaTeclado.nextDouble();

    if (x >= 0);
        {
            System.out.println("es positivo");
        }

 */
//Boletin3, ej2

     /*
        short z,y, r1, r2 = 0;
        Scanner entradaTec;
        entradaTec = new Scanner(System.in);
        System.out.println("introduce el primer numero");
        z = entradaTec.nextShort();

        Scanner entradaT;
        entradaT = new Scanner(System.in);
        System.out.println("introduce el segundo numero");
        y = entradaT.nextShort();

        if (z >= y)
        {
            r1 = (short) (z - y);
            System.out.println(r1);
        }

        else {
            r2 = (short) (y + z);
        }
        System.out.println(r2);
*/

// Boletin 3 ej 3

int a;
        Scanner entradaTec;
        entradaTec = new Scanner(System.in);
        System.out.println("introduce un numero:");
        a = (int) entradaTec.nextDouble();


        if (a > 0) {
            System.out.println("+");
        }
        if (a < 0){
            System.out.println("-");
        if (a == 0);
            System.out.println("0");

        }

    }
} //end method main
