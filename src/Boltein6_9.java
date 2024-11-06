public class Boltein6_9 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(28));
    }


        static int Fibonacci ( int x){
        int resp;
        if (x <= 1) return x;
        else
            return Fibonacci(x-2)+Fibonacci(x-1);
        }

    }