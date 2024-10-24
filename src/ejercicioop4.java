import java.util.Scanner;

public class ejercicioop4 {
    public static void main(String[] args) {
    double nota = 0, suma = 0, numero = 0, media;
        Scanner ent = new Scanner(System.in);
        do {
            System.out.println("introduce una nota(-1 para salir) ");
            nota = ent.nextDouble();
            suma = suma + nota;
            numero++;
            if (nota != -1) {
            suma = suma + nota;
            numero++;
            }
        }

                while (nota != -1) ;

                media = suma / numero;
                System.out.println("La media de las notas de los alumnos es: " + media);



    }
}