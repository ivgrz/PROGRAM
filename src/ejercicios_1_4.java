import java.util.Scanner;

public class ejercicios_1_4 {
    public static void main (String [] args) {
/*
       int grade = 85;

        if (grade > 88) {
            System.out.println("you made the honor roll");
        }
         else {
                System.out.println("Pasaste");


//Boletin3, 1

    int x;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("introduce un numero:");
        x = (int) entradaTeclado.nextDouble();

    if (x >= 0);
        {
            System.out.println("es positivo");
        }


//Boletin3, ej2


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


// Boletin 3 ej 3

int a;
        Scanner entradaTec;
        entradaTec = new Scanner(System.in);
        System.out.println("introduce un numero:");
        a = (int) entradaTec.nextDouble();


        if (a > 0) {
            System.out.println("+");
        }
        if (a < 0) {
            System.out.println("-");
        }
        if (a == 0) {
            System.out.println("0");
        }

//Boletin 3 ej 4

int  p1, p2, res;

Scanner entradaTec;
entradaTec = new Scanner(System.in);
        System.out.println("Introduce nombre de la primera persona:");
    String nombre = entradaTec.nextLine();


    System.out.println("introduce el peso de la primera persona: ");
    p1 = entradaTec.nextInt();

    System.out.println("Introduce el nombre de la segunda persona:");
        String nombre2 = entradaTec.nextLine();
        entradaTec.nextLine();
        System.out.println("introduce el peso de la segunda persona:");
        p2 = entradaTec.nextInt();

        res = (p1 - p2);
if (p1 > p2) {

    System.out.println("La persona que pesa mas es: " + nombre);
    System.out.println("la diferencia de peso entre los dos es: " + res);
}
else {
    System.out.println("La persona que pesa mas es: " + nombre2);
}

//Boletin 3 ej 5
            int num1, num2, num3;
            entradaT = new Scanner(System.in)
            System.out.println("introduce el primer numero: ");
            num1 = entradaT.nextInt();
            System.out.println("introduce el segundo numero: ");
            num2 = entradaT.nextInt();
            System.out.println("introduce el tercer numero: ");
            num3 = entradaT.nextInt();
if (num1>num2){
*/

//Boletin3 ej 4 version B
        int  x, y, z;
        Scanner entradaTec = new Scanner(System.in);
        System.out.println("Introduce nombre de la primera persona:");
        String nom = entradaTec.next();
        System.out.println("introduce el peso de la primera persona: ");
        x = entradaTec.nextInt();
        System.out.println("Introduce el nombre de la segunda persona:");
        String nom2 = entradaTec.next();
        System.out.println("introduce el peso de la segunda persona:");
        y = entradaTec.nextInt();
        z = (y < x) ? x : y;
        z = (y < x) ? nom: nom2;
        System.out.println("la cantidad de mas peso es de " + z + " kilos y pertenece a: " + z); //de int a String q fue

        System.out.println("¿En que curso esta?");
        int grade = entradaTec.nextInt():
        switch (grade) {
            case
            case
            case
        }
    }
}
