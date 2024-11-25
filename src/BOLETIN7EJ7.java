import java.util.Arrays;

public class BOLETIN7EJ7 {
    public static void main(String[] args) {
        //Codificar unha función que faga unha copia dunha matríz, pasado por parámetro e devolte a copia do matríz.
    int lista[]={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(lista));
    int copia[]= nuevalist(lista);
        System.out.println(Arrays.toString(copia));

    }
    public static int[] nuevalist(int[] lista2){

    int[] copia = new int[lista2.length];

        for (int i = 0; i< lista2.length;i++){
            copia[i] = lista2[i];
        }


        return copia;
    }


}
