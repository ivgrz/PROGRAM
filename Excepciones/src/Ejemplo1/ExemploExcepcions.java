package Ejemplo1;

/**
 * @author ivan
 * @version 1.0
 */
public class ExemploExcepcions {
    /**
     * Exemplo de excepcións
     * @param args
     */
    public static void main(String[] args) {
        int a,b,c;
        a = 0;
        b = 0;
        try{
        c = a/b;
        } catch (ArithmeticException erro){
            System.out.println("Parece que b è 0 ,non se pode dividir entre 0");
            System.out.println(erro.getMessage());//Muestra y recorre el mensaje de error

        }
    }
}
