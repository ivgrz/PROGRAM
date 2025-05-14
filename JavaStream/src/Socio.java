public class Socio {
    String dni;
    String nombre;
    public Socio (String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
