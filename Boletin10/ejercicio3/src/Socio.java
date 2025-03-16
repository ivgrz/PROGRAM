import java.time.LocalDate;

public class Socio extends Persona {
    private String direccion;
    private String provincia;
    private LocalDate fechaAlta;
    private double cuotaMensual;

    public Socio(String dni, String nombre, LocalDate fechaIngreso, String direccion, String provincia, LocalDate fechaAlta, double cuotaMensual) {
        super(dni, nombre, fechaIngreso);
        this.direccion = direccion;
        this.provincia = provincia;
        this.fechaAlta = fechaAlta;
        this.cuotaMensual = cuotaMensual;
    }

    @Override
    public String aCadena() {
        return String.format("Socio: DNI: %s, Nombre: %s, Dirección: %s, Provincia: %s, Fecha de alta: %s, Cuota mensual: %.2f €",
                getDni(), getNombre(), direccion, provincia, fechaAlta, cuotaMensual);
    }

    @Override
    public double gastosIngresos() {
        return cuotaMensual;
    }
}
