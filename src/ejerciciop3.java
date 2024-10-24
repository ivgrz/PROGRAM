import java.util.Scanner;

/**
 * Corregir esto
 */
public class ejerciciop3 {
    public static void main(String[] args) {

        int nota,suma = 0,numero = 0;
        double media;
        Scanner entTec = new Scanner(System.in);
        System.out.println("introduce la nota del alumno(-1 para terminar): ");
        nota = entTec.nextInt();
        while (nota != -1){
            suma = suma + nota;
            numero++;
            nota = entTec.nextInt();
                   }
        media =suma/numero;
        System.out.println("La media es " + media);


    }
}






