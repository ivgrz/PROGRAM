import java.util.Scanner;

public class correccion {


    /**
     * hola
     */

        public static void main(String[] args) {
            String tit = "";
            int indice = 0;
            int opcion;
            String [] biblioteca = new String[20];
            Scanner sc = new Scanner(System.in);

            System.out.println("Elige una opcion: ");
            System.out.println("1. Mostrar la biblioteca");
            System.out.println("2. Añadir un libro");
            System.out.println("3. Eliminar un libro");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            if (opcion == 1){
                mostrarLibros(biblioteca);
            }
            if (opcion == 2){
                for (int a = 0; a < biblioteca.length ; a++) {
                    System.out.println(anadirlibro(biblioteca, "hola"));
                    System.out.println(anadirlibro(biblioteca,"Don Quijote"));
                }
            }
            if (opcion == 3){
                BorrarPosicion(biblioteca,4);
            }else if (opcion == 4){

            }
        }

        public static void mostrarLibros (String [] biblioteca){
            for (String libro : biblioteca){
                if (libro != null) System.out.println(libro);
                else System.out.println("Vacio");
            }

        }
        public static boolean anadirlibro(String []anadir,String titulo){
            boolean lleno = true;

            for (int j = 0; j < anadir.length; j++){
                if (anadir[j] == null){
                    anadir[j] = titulo;
                    lleno = false;
                    break;
                }
            }

            return !lleno;
        }
        public static boolean BorrarPosicion(String []eliminar, int ind){
            if (ind < eliminar.length && ind >= 0 && eliminar[ind] != null){
                eliminar[ind] = null;
                return true;
            }
            else {
                return false;
            }

        }

    }


