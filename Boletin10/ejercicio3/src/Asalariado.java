import java.time.LocalDate;

public class Asalariado extends Persona {
    private double sueldo;
    private double porcentajeSeguridadSocial;
    private double porcentajeIRPF;

    public Asalariado(String dni, String nombre, LocalDate fechaIngreso, double sueldo, double porcentajeSeguridadSocial, double porcentajeIRPF) {
        super(dni, nombre, fechaIngreso);
        this.sueldo = sueldo;
        this.porcentajeSeguridadSocial = porcentajeSeguridadSocial;
        this.porcentajeIRPF = porcentajeIRPF;
    }

    @Override
    public String aCadena() {
        return String.format("Asalariado: DNI: %s, Nombre: %s, Sueldo: %.2f €, Seguridad Social: %.2f%%, IRPF: %.2f%%",
                getDni(), getNombre(), sueldo, porcentajeSeguridadSocial, porcentajeIRPF);
    }

    @Override
    public double gastosIngresos() {
        double seguridadSocial = sueldo * (porcentajeSeguridadSocial / 100);
        return -(sueldo + seguridadSocial); // Los asalariados generan gastos para la asociación
    }
}
