import java.io.OutputStream;
import java.io.*;
/*
Crea a aplicación que premita gardar e recuperar os datos dos clentes dunha empresa. Para o cal, defina a clase Cliente, que teña os atributos:
id, identificador de cliente
nome
teléfono
	Os obxectos Cliente se recollerán nunha táboa .
	A aplicación terá un menú que posibilitará as seguintes opcións:
Engadir novo cliente
Modificar datos
Dar de baixa clientes.
Listar os clientes.
	A información se gardará nun ficheiro binario, que se cargará en memoria o iniciar o programa e se gardará en disco, actualizado o rematar.
*/
public class Cliente {
    private String id;
    private String nome;
    private String telefono;
    public Cliente(String ruta, String id, String nome, String telefono) {
        OutputStream fluxoSaida = null;
    }

}
