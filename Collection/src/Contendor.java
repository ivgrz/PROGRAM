public class Contendor <T> {
    private T obxeto;
    public Contendor (){}

    void guardar (T novo){
        obxeto = novo;
    }
    T extraer (){
        T res = obxeto;
        obxeto = null;
        return res;
    }



}
