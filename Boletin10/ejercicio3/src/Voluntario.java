import java.time.LocalDate;

public class Voluntario extends Persona {
    private int edad;
    private String profesion;
    private int horasDedicadas;

    public Voluntario(String dni, String nombre, LocalDate fechaIngreso, int edad, String profesion, int horasDedicadas) {
        super(dni, nombre, fechaIngreso);
        this.edad = edad;
        this.profesion = profesion;
        this.horasDedicadas = horasDedicadas;
    }

    @Override
    public String aCadena() {
        return String.format("Voluntario: DNI: %s, Nombre: %s, Edad: %d, Profesión: %s, Horas dedicadas: %d",
                getDni(), getNombre(), edad, profesion, horasDedicadas);
    }

    @Override
    public double gastosIngresos() {
        return -3.0; // Los voluntarios generan un gasto fijo de 3 € mensuales
    }
}