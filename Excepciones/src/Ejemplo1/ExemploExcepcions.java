package Ejemplo1;

public class ExemploExcepcions {
    public static void main(String[] args) {
        int a,b,c;
        a = 0;
        b = 0;
        try{
        c = a/b;
        } catch (arithmeticException erro){
            System.out.println("Parece que b e 0 ,non se pode dividir entre 0");
        }
    }
}
