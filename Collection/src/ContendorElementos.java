import java.util.Arrays;

public class ContendorElementos<T> implements Pila<T>, Cola<T> {
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
    public T desencolar(){
        T res = null;
        if (obxectos.length > 0){
            res = obxectos[0];
            obxectos = Arrays.copyOfRange(obxectos, 1, obxectos.length);
        }
        return res;
    }
    public void encolar(T novo){
        obxectos = Arrays.copyOf(obxectos, obxectos.length + 1);
        obxectos[obxectos.length - 1] = novo;
    }

}
