import java.util.Scanner;

public class Evaluacion_prog_1 {
    public static void main(String[] args) {
    int hora, minuto, segundo, i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Registra la hora");

        hora = sc.nextInt();

        System.out.println("Registra el minuto");
        minuto = sc.nextInt();

        System.out.println("Registra los segundos");

        segundo = sc.nextInt();

        System.out.println("Añade el incremento (en segundos)");

        i = sc.nextInt();

    if(segundo <= 59 && i>1){
        minuto = minuto +1;
        segundo = 0;
        System.out.println(hora + ":" + minuto + ":" + segundo);

    }

    if(minuto == 59 && i>9){
        hora = hora + 1;
        segundo = (segundo + i)-50;
        minuto =0;
        System.out.println(hora + ":" + minuto + ":" + segundo);

    }

        if(minuto == 59 && i>=1 && segundo ==59){
            hora = hora + 1;
            minuto = 0;
            segundo = 0 + i;
            System.out.println(hora + ":" + minuto + ":" + segundo);

        }
        else {
            segundo = segundo + i;
        System.out.println(hora + ":" + minuto + ":" + segundo);

    }

    }
}