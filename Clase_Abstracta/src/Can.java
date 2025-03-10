public class Can extends Mamiferos implements Comunicacion {

    public Can (String nombre, int edad){
        super(nombre, edad);
    }
    public String parir(){
        return "un descanso";
    }
    public void desplazar (){
        System.out.println("Corre");
    }
    public void ronroneo(){
        System.out.println("umm-ummm");
    }
    public void voz (){
        System.out.println("Guau guau");
    }
}
