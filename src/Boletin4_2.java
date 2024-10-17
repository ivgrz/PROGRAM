import java.util.Scanner;

public class Boletin4_2 {
    public static void main(String[] args) {
        int ac, x,y,b,h;
        double aq, ab;
        Scanner entradat = new Scanner(System.in);

        System.out.println("Elige el numero de la figura a la que le quieres encontrar el area: 1- Cuadrado 2- Triangulo 3-Circulo");
        int op = entradat.nextInt();

        switch (op){
            case 1:
                System.out.println("Dame la medida del lado");
                x = entradat.nextInt();
                ac =  (x * x);
                System.out.println("La medida del area del cuadrado es " + ac + " metros cuadrados");
            case 2:
                System.out.println("Dame la medida de la base");
                b = entradat.nextInt();
                System.out.println("Dame la medida de la altura");
                h = entradat.nextInt();
                ab = ((b * h)/2);
                System.out.println("El area del triangulo es de " + ab + " metros cuadrados");
            case 3:
                System.out.println("Dame el radio de la circunferencia");
                y = entradat.nextInt();
                aq = (3.14 * (y*y));
                System.out.println("El area de la circunferencia es de " + aq + " metros cuadrados");

        }

    }
}