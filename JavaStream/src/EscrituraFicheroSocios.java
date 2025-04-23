import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraFicheroSocios {
        public EscrituraFicheroSocios(String ruta, Socio[] socios){
            ObjectOutputStream fluxoSaida = null;
            try {
                fluxoSaida = new ObjectOutputStream(new FileOutputStream(ruta));
                for (Socio s : socios){
                    System.out.println("Escribo socio " + s.toString());
                    fluxoSaida.writeObject(s);
                }
            }catch (IOException e){
                System.out.println("Erro de entrada/saida: " + e.getMessage());
            }
            finally {
                try{
                    if (fluxoSaida != null){
                        fluxoSaida.close();
                    }
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }

        }
}
