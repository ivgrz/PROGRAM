public class implementacionCola extends Lista2 implements Cola {

public class ImplementacionCola (){
    super();
}
    public void encolar(int nuevoNum){
        super.AñadirUltimo(nuevoNum);
    }
    public int desencolar(){

        int valor = getNodo().getValor();
      return valor;
    }

}
