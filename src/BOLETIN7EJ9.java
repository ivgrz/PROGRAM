import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BOLETIN7EJ9 {
    public static void main(String[] args) {
        int []lista={1,2,2,3,4,5,5,5,6,8,3,9,1,0,10,15,2,3};
        System.out.println("la lista original es "+ Arrays.toString(lista));
        for (int elemento : norepetidos(lista))
        System.out.println("mira lo que econtre "+ Arrays.toString(norepetidos(lista)));

        int []t1 = {1,2,3};
     int []t2 = {1,2,3};
    if (t1 == t2){
        System.out.println("iguales");
    }
    else {
        System.out.println("distintas");
    }
    int [][] tabla = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    for (int i = 0; i < tabla.length; i++){
        System.out.println("las filas de la matriz son: " + tabla.length);
        System.out.println("las columnas de la matriz son: "+ tabla[0].length);
    }
    }
public static int[] norepetidos(int[] listar){

        int []temporal= new int[0];
        for (int elemento : listar){
          if (BOLETIN7EJ5.buscarValor (temporal, elemento) == -1){

                int nuevo[] = new  int[temporal.length+1];
                for (int i = 0; i < temporal.length; i++){
                    nuevo[i] = temporal [i];
                }
            nuevo[temporal.length] = elemento;
                temporal = nuevo;
          }
        }


        return temporal;
}

}
