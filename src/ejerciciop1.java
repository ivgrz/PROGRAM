/**
 * Hallar los multiplos de 7 menores que 100
 * @version 1.1
 * @author ivan
 */
public class ejerciciop1 {
    public static void main(String[] args) {

        int i = 1;
        int numero = 7;
        for (;i <= 14; i++) {
            System.out.println((numero * i));
        }


        for (int x=0; x<100;x++) {
            if (x % 7 == 0) {
                System.out.println(x);
            }

        }
    }
}