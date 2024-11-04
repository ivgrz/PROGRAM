public class Ejemplofunciones4 {
    public static void main(String[] args) {
        System.out.println(ElevadoN(5,3));
    }
    static int ElevadoN (int x, int y){
        int resp;
        if (y == 0) resp = 1;

        else resp = x * ElevadoN(x, y-1);
        return resp;

    }

}