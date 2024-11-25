public class BOLETIN7EJ8 {
    public static void main(String[] args) {
        int []elementos = new int[10];
        for (int i=0; i< elementos.length;i++) {
            elementos[i] = i*2;
        }
        int[] listaP = elementospares(elementos);
        for (int elemento : listaP){
            System.out.println(elemento);
        }
        }

    public static int[] elementospares(int[] lista) {
        int numpares = 0;

        for (int numero : lista) {
            if (numero % 2 == 0) numpares ++;

        }
       int [] listapares = new int[numpares];

        for (int i=0, ipares = 0;i < lista.length;i++){
            if (lista[i]%2 == 0){
                listapares[ipares] = lista[i];
                ipares ++;
            }
        }
    return listapares;
    }
}
