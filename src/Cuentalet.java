import java.util.Scanner;

/**
 * Prueba y documentacion de funciones
 *
 * @author ivan
 * @version 1.1
 */
public class Cuentalet {
    /**
     * Metodo principal, entrada de la aplicacion
     *
     * @param args
     */
    public static void main(String[] args) {
        cuentaletras("hola","mundo");
        //pide el primer numero
        int primernum =obtenernumero();
        //pide segundo numero
        int segundonum = obtenernumero();
    }

    /**
     * Cuenta la totalidad de las letras de dos palabras
     *
     * @param palabra1 palabra palabra1 contar caracteres
     * @param palabra2 palbra palabra1 contar caracteres
     * @return numero de letras totales
     */
    static int cuentaletras(String palabra1, String palabra2){
        int total = palabra1.length() + palabra2.length();
        return 0;
    }

    /**
     * Pide el primer numero
     * @return numero introducido por teclado
     */
    static int obtenernumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int numero = sc.nextInt();
    return numero;
    }
}


