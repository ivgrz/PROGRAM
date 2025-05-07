import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;

public class TratamientoClientes {
    public static void main(String[] args) {
        Collection <cliente> coleccionCliente;
        coleccionCliente = new java.util.ArrayList<>();
        coleccionCliente.add(new cliente("12345678A", "Juan", "01/01/2000"));
        coleccionCliente.add(new cliente("23456789B", "Ana", "02/02/1995"));
        coleccionCliente.add(new cliente("34567890C", "Luis", "03/03/1985"));
        cliente unCliente = new cliente("45678901D", "Maria", "04/04/1990");
        coleccionCliente.add(unCliente);
        Object [] clientes = coleccionCliente.toArray();
        Iterator<cliente> indice = coleccionCliente.iterator();
        for (;indice.hasNext();){
            cliente cli = indice.next();
            if (cli.dni.equals("44444Z"))indice.remove();
            }
        System.out.println(coleccionCliente.toString());
        for (cliente cli : coleccionCliente){
            System.out.println(cli);
            if (cli.dni.equals("55655R"))coleccionCliente.remove(cli);
        }
        coleccionCliente.clear();
        System.out.println(coleccionCliente.size());
        System.out.println(coleccionCliente.isEmpty());
        System.out.println(coleccionCliente.contains(unCliente));
        Object [] cliente = coleccionCliente.toArray();

    }
}
