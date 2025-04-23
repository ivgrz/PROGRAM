import java.util.Arrays;

public class ContendorElementos<T> implements Pila<T> {
    private T[] obxectos;

    public ContendorElementos(T[] obxectos) {
        this.obxectos = obxectos;

    }

    public void apilar(T novo) {
        obxectos = Arrays.copyOf(obxectos, obxectos.length + 1);
        obxectos[obxectos.length - 1] = novo;
    }
    public T desapilar(){
        T res = null;
        if (obxectos.length > 0){
            res = obxectos[obxectos.length - 1];
            obxectos = Arrays.copyOf(obxectos, obxectos.length - 1);
        }
        return res;
    }
}
