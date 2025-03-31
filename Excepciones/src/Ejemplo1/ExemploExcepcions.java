package Ejemplo1;

/**
 * @author ivan
 * @version 1.0
 */
public class ExemploExcepcions {
    /**
     *  Metodo principal que ejecuta el ejemplo de manejo de excepciones.
     * @param args
     */
    public static void main(String[] args) {
        int a,b,c; //Variables para la division
        a = 0;
        b = 0;
        try{ //Bloque de codigo que puede lanzar una excepcion
        c = a/b;
        } catch (ArithmeticException erro){ //Captura la excepcion
            System.out.println("Parece que b è 0 ,non se pode dividir entre 0");
            System.out.println(erro.getMessage());//Muestra y recorre el mensaje de error

        } catch (Exception erro2){
            System.out.println("Volvio a fallar bobin");
            System.out.println(erro2.getMessage());
        }
    }
}
