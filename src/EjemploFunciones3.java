public class EjemploFunciones3 {
    public static void main(String[] args) {
        System.out.println(funcReces(3));
    }
    static long funcReces ( int n ) {
        long res;

        if (n == 0) {
            res = 1;
            return res;
        }
        else res = n * funcReces(n-1);
        return res;
    }
}