import java.util.Scanner;

public class progext {
    public static void main(String[] args) {
        Scanner entradatec = new Scanner(System.in);
        System.out.println("introduce una nota: ");

        int grade = entradatec.nextInt();
        switch (grade) {
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("Bueno");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;

            case 9, 10:
                System.out.println("Sobresaliente");
                break;

            default:
                System.out.println("bobi");
        }
    }
}



