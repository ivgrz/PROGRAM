import java.util.Scanner;

/**
 * Programa para sacar numero en texto introduciendo valor del (1-99)
 * @version 1
 * @author ivan gutierrez
 */

public class boletin4_4 {
    public static void main(String[] args) {
        Scanner et = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = et.nextInt();

        int decenas, unidades;
        String decCadea = "", uniCadea="", conjuncion="", espacio ="";
        decenas = numero/10;
        unidades = numero%10;

        switch (decenas) {

            case 1: decCadea=
                "Diez";
                break;
            case 2: decCadea=
                "Veinte";
                break;
            case 3: decCadea=
                "Treinta";
                break;
            case 4: decCadea=
                "Cuarenta";
                break;
            case 5: decCadea=
                "Cincuenta";
                break;
            case 6: decCadea=
                "Sesenta";
                break;
            case 7: decCadea=
                "Setenta";
                break;
            case 8: decCadea=
                "Ochenta";
                break;
            case 9: decCadea=
                "Noventa";
                break;
        }
         switch (unidades){
             case   0: uniCadea=""; break;
             case   1:  uniCadea="uno"; break;
             case   2:  uniCadea="dos";  break;
             case   3:  uniCadea="tres"; break;
             case   4:  uniCadea="cuatro";   break;
             case   5:  uniCadea="cinco";    break;
             case   6:  uniCadea="seis"; break;
             case   7:  uniCadea="siete"; break;
             case   8:  uniCadea="ocho"; break;
             case   9:  uniCadea="nueve"; break;
         }
        conjuncion = (unidades==0|| decenas==0)? "": "y ";
        System.out.println("El numero es " + decCadea + " " + conjuncion + uniCadea);
    }
}