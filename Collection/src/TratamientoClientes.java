import java.time.LocalDate;
import java.util.Collection;

public class TratamientoClientes {
    public static void main(String[] args) {
        Collection <cliente> coleccionCliente;
        coleccionCliente = new java.util.ArrayList<>();
        coleccionCliente.add(new cliente("12345678A", "Juan", "01/01/2000"));
        coleccionCliente.add(new cliente("23456789B", "Ana", "02/02/1995"));
        coleccionCliente.add(new cliente("34567890C", "Luis", "03/03/1985"));
        coleccionCliente.clear();
    }
}
