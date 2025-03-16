import java.time.LocalDate;

public abstract class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaIngreso;

    public Persona(String dni, String nombre, LocalDate fechaIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public abstract String aCadena();

    public abstract double gastosIngresos();
}