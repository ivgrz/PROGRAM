public class Fibonacci3 {
    public static void main(String[] args) {

        recursiva(0,1);
        System.out.println("Termina");
    }

static  void recursiva(int a, int b){
        int suma = a + b;
    System.out.println(suma);
    a = b;
    b= suma;
    if (suma<10){
        recursiva(a,b);
    }

    }

}