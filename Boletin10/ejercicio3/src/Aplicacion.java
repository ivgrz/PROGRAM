import java.time.LocalDate;
//Este es el main


public class Aplicacion {

    public class Main {
        public static void main(String[] args) {
            // Crear un socio
            Socio socio = new Socio("12345678A", "Juan Pérez", LocalDate.of(2020, 5, 15),
                    "Calle Falsa 123", "A Coruña", LocalDate.of(2020, 5, 15), 50.0);
            System.out.println(socio.aCadena());
            System.out.println("Ingresos/Gastos: " + socio.gastosIngresos() + " €");

            // Crear un asalariado
            Asalariado asalariado = new Asalariado("87654321B", "Ana García", LocalDate.of(2019, 3, 10),
                    1500.0, 15.0, 12.0);
            System.out.println(asalariado.aCadena());
            System.out.println("Ingresos/Gastos: " + asalariado.gastosIngresos() + " €");

            // Crear un voluntario
            Voluntario voluntario = new Voluntario("56781234C", "Luis Martínez", LocalDate.of(2021, 7, 20),
                    30, "Ingeniero", 20);
            System.out.println(voluntario.aCadena());
            System.out.println("Ingresos/Gastos: " + voluntario.gastosIngresos() + " €");
        }
    }}
