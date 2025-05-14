import java.util.ArrayList;
import java.util.List;

public class Ejercicio2y3 {
    /*
    Codificar unha aplicación onde se insertan 100 números enteiros aleatorios entre 1 e 10 (ámbolos dous incluidos),
    poidendo estár repetidos, nunha colección. Despois elimínanse tódolos elementos que valen 5 e 7.
    Mostrar a colección antes e despois da eliminación.
     */





        public static <T extends Number> List<T> generarNumerosAleatorios(Class<T> type) {
            List<T> numeros = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                int randomValue = (int) (Math.random() * 10 + 1);
                if (type == Integer.class) {
                    numeros.add(type.cast(randomValue));
                }
            }
            return numeros;
        }
        public static <T extends Number> void eliminarValores(List<T> numeros, T valorAEliminar) {

                numeros.removeIf(num -> num.equals(valorAEliminar));
        /*
        Hace remove cuando se use este metodo en el main (agregar los numeros ahi)
         */
        }
}
