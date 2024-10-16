import java.util.Scanner;

public class bol3ej2 {
    public static void main(String[] args) {
        short z, y, r1, r2 = 0;
        Scanner entradaTec;
        entradaTec = new Scanner(System.in);
        System.out.println("introduce el primer numero");
        z = entradaTec.nextShort();

        Scanner entradaT;
        entradaT = new Scanner(System.in);
        System.out.println("introduce el segundo numero");
        y = entradaT.nextShort();

        if (z >= y) {
            r1 = (short) (z - y);
            System.out.println(r1);
        } else {
            r2 = (short) (y + z);
        }
        System.out.println(r2);
    }
}