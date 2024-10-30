import java.util.Scanner;

public class EjercicioFunc {
    static int Numeros(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pon el primero numero: ");
        int num1 = entrada.nextInt();
        return num1;
    }
    static int Numeros2(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Pon el segundo numero: ");
        int num2 = tec.nextInt();
        return num2;
    }

    public static void main(String[] args) {
    int num1 = Numeros();
    int num2 = Numeros2();
    for (int i = num1+1;i < num2;i++){
        System.out.println(i);
    }




    }
}