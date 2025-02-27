public abstract class Animal {
    private String Nombre;
    private int edad;

    public Animal(String nombre, int Edad){
    this.Nombre= nombre;
    this.edad = Edad;

    }
    public String getNombre(){
       return Nombre;
    }
    public void setNombre(){

    }
    public int getEdad(){
    return  edad;
    }
    public void setEdad(){
        this.edad = Math.abs(edad);
    }
    public void comer(){
        System.out.println(Nombre+" esta comiendo");
    }
    public String dormir(){


    }
    public String desplazar(){


    }





}

