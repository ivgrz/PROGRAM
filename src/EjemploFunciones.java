import java.util.Scanner;
public class EjemploFunciones {
    public static void main(String[] args) {

    String nombreEstudiante = obtenernom();
        saludos(3,"en");
        System.out.println("ola " + nombreEstudiante );
        saludos(5, "gl");
        System.out.println("Otras tareas en el medio");
        saludos(2, "es");
    }
    static void saludos(int veces, String idioma) {
        String nombreEstudiante = obtenernom();
        for (int i = 0; i < veces; i++) {
            if (idioma.equals("gl")) System.out.println("Ola "+ nombreEstudiante);
            else if (idioma.equals("es")) System.out.println("Hola " + nombreEstudiante);
            else if (idioma.equals("en")) System.out.println("Hello " + nombreEstudiante);
        }
    }
    static String obtenernom(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.next();
        //sc.close();
        return nombre;
    }
}