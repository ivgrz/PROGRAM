import java.util.ArrayList;
import java.util.Collection;

public class ColeccionNumeros {
    public static void main(String[] args) {
        Collection <Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            numeros.add((int)(Math.random()*10+1));

        }
    }
}
