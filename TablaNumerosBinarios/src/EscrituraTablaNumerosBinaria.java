import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class EscrituraTablaNumerosBinaria {
    public EscrituraTablaNumerosBinaria(int[] taboa) {
        ObjectInputStream fluxoEntrada = null;
        ObjectOutputStream fluxoSaidaPares = null;
        ObjectOutputStream fluxoSaidaImpares = null;

        try {
            // Crear flujos de salida para números pares e impares
            fluxoSaidaPares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
            fluxoSaidaImpares = new ObjectOutputStream(new FileOutputStream("impares.dat"));

            // Verificar si la tabla no es nula
            if (taboa != null) {
                for (int num : taboa) {
                    if (num % 2 == 0) {
                        fluxoSaidaPares.writeInt(num); // Escribir números pares
                    } else {
                        fluxoSaidaImpares.writeInt(num); // Escribir números impares
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } finally {
            try {
                if (fluxoEntrada != null) {
                    fluxoEntrada.close();
                }
                if (fluxoSaidaPares != null) {
                    fluxoSaidaPares.close();
                }
                if (fluxoSaidaImpares != null) {
                    fluxoSaidaImpares.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los flujos: " + e.getMessage());
            }
        }
    }
}