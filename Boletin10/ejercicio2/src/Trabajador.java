//inicio
import DataHora.Data;
public class Trabajador extends Miembroasociacion{
    private Data DataIngreso;

    public Trabajadores(String dni, String nombre){




    }

    public Trabajador(String dni, String nombre) {
        super(dni, nombre);
    }

    public Data getDataIngreso(){
        return DataIngreso;
    }
    public void setDataIngreso(){
        this.DataIngreso = DataIngreso;
    }



}
