import DataHora.Data;
public class Socios extends Miembroasociacion implements CalculoGasto {

    private String direccion;
    private String Provincia;
    private int fechaalta;
    private double cuotamensual;
    private Data DataAlta;

    public Socios(String nombre, String dni, String direccion, String provincia){
        super (dni, nombre);
        this.direccion = direccion;
        this.Provincia = provincia;

    }
    public double gastosIngresos(){
        return
    }


    public String aCadea (){
        String aux = ", con direccion" + direccion + ", en la provincia "
                return super
    }
}

