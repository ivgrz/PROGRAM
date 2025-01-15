
import java.util.Scanner;

public class ahorcadosolu {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String palabraAdivinar = solicitaPalabra();
            String cadenadeguiones = cadenaguiones(palabraAdivinar);
            int ronda = 0;
            boolean acierto = false;
            String letraopalabra = "";

            do {
                System.out.println("La palabra a adivinar es: " + cadenadeguiones);
                System.out.println("Jugador 2: introduce la palabra o letra a adivinar");
                letraopalabra = sc.nextLine();

                if (letraopalabra.length() > 1) {
                    if (letraopalabra.equals(palabraAdivinar)) {
                        acierto = true;
                    } else {
                        System.out.println("La palabra es incorrecta");
                    }
                } else {
                    cadenadeguiones = comprobarLetraenpalabra(cadenadeguiones, letraopalabra, palabraAdivinar);
                    if (cadenadeguiones.equals(palabraAdivinar)) {
                        acierto = true;
                    }
                }
                ronda++;
            } while (ronda < 7 && !acierto);

            if (acierto) {
                System.out.println("¡Acertaste! La palabra es: " + palabraAdivinar);
            } else {
                System.out.println("No acertaste, la palabra era: " + palabraAdivinar);
                System.out.println("______");
                System.out.println("|      |");
                System.out.println("|      0");
                System.out.println("|     /|\\ ");
                System.out.println("|     / \\  ");
                System.out.println("_");
            }
        }

        public static String solicitaPalabra() {
            String palabra = "";
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Escribe la palabra a adivinar:");
                palabra = sc.nextLine().trim();
            } while (palabra.isEmpty());
            return palabra;
        }

        public static String cadenaguiones(String palabra) {
            StringBuilder cadguiones = new StringBuilder();
            for (int i = 0; i < palabra.length(); i++) {
                cadguiones.append("-");
            }
            return cadguiones.toString();
        }

        public static String comprobarLetraenpalabra(String cadGuiones, String letra, String palabra) {
            char[] charsGuiones = cadGuiones.toCharArray();
            int inicio = 0;
            int i;

            // Búsqueda de la letra en la palabra
            while ((i = palabra.indexOf(letra, inicio)) != -1) {
                charsGuiones[i] = palabra.charAt(i);
                inicio = i + 1; // Continuar buscando después de la posición encontrada
            }

            return new String(charsGuiones);
        }
    }


