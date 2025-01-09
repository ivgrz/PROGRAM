/**
 * Cuenta atras primer ejemplo (bucle)
 * @version 1.1
 * @author ivan
 */
public class boletin4_5 {
    public static void main(String[] args) {
        System.out.println("Cuenta: ");
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println(i);

        }

        System.out.println("PAW");
        for (i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("POW");

        int z = 10;
        while (z != 0) {
            System.out.println("Faltan " + z);
            z--;
        }
    }

}
