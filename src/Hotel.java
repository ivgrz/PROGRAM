import java.util.Scanner;

/**
 * h
 */
public class Hotel {

    public static void main(String[] args) {

        String [][]Hotel = new String[4][6];

        Registro(Hotel,"Saul",11);
        Registro(Hotel,"Paola",22);
        Registro(Hotel,"Sara",31);
        Registro(Hotel,"Simon",41);
        Habitacionesvacias(Hotel);
    DejarHabitacion(Hotel,31);
    }

    static boolean Registro(String He[][], String n, int habitacion) {



        int i = (habitacion / 10) - 1;
        int j = (habitacion % 10) - 1;



        if (He[i][j] != null) {
            System.out.println("La habitacion " + habitacion + " esta ocupada");

            return false;
        } else {
            He[i][j] = n;
            System.out.println("Registrado");


        }
        return true;
    }
 /*       for (; i < He.length; i++) {
            for (; j < He[0].length; j++) {

            }
        }
*/


    static void DejarHabitacion(String Dh[][], int h){
    int i = (h/10)-1;
    int j = (h%10)-1;
    Dh[i][j] = null;
    }

    public static void Habitacionesvacias(String HV[][]){

for (int i = HV.length-1; i >= 0; i--){
    System.out.println("");
    System.out.print("Planta " + (i + 1) + " :");
    for (int j = 0; j<HV[i].length;j++){
      if (HV[i][j] == null) System.out.println("Vacio");
     else System.out.println(HV[i][j]+"");
    }

}

    }

}
