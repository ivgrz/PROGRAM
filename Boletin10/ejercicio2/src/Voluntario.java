public class Voluntario extends Trabajadores implements CalculoGasto{
import DataHora.Data;



private int edad;
private String profesion;
private double horasusadas;

public Voluntario(String dni, String nombre, Data dataIngreso, int edad, String profesion, double horasusadas){
    super(dni, nombre, dataIngreso);


}
@Override
    public double gastosIngresos(){
    return ;
}
}
