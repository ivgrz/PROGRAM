import java.util.Scanner;

/**
 * Corregir esto
 */
public class ejerciciop3 {
    public static void main(String[] args) {
        Scanner entTec = new Scanner(System.in);
        int media = 0;
        System.out.println("introduce la nota del alumno(-1 para terminar): ");
        int nota = entTec.nextInt();
        while (num != -1){
           media= (nota + num)/;
           nota = nota++;
            System.out.println("introduce la nota del alumno(-1 para terminar): ");
            num = entTec.nextInt();
        }
        System.out.println("La media es " + media);
    }
}