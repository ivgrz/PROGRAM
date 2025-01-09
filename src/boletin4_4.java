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



        switch (decenas) {
            case 0: decCadea = ""; break;
            case 1: if (unidades == 1) uniCadea = "Once";
                    else if (unidades == 2) uniCadea ="doce";
                    else if (unidades == 3) uniCadea = "Trece";
                    else if (unidades == 4) uniCadea = "Catorce";
                    else if (unidades == 5) uniCadea = "Quince";
                    else if (unidades == 6) uniCadea = "Dieciseis";
                    else if (unidades == 7) uniCadea = "Diecisiete";
                    else if (unidades == 8) uniCadea = "Dieciocho";
                    else if (unidades == 9) uniCadea = "Diecinueve";
                    else if (unidades == 0) uniCadea = "Diez";
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
        conjuncion = (unidades==0 || decenas==0 || decenas == 1)? "": "y ";
        System.out.println("El numero es " + decCadea + " " + conjuncion + "" + uniCadea);
    }
}