public class Boltein6_9 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(36));

    }


        static int Fibonacci ( int x){
        if (x <= 1) return (x+1) + (x+2) ;
        else
            return Fibonacci(x-2)+Fibonacci(x-1);
        }

    }