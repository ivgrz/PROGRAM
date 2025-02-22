package Boletin9;

/**
 * @author ivan
 * @version 1.0
 */
public class Librosalida {
    public static void main(String[] args) {
    //Usando el constructor por defecto
        System.out.println("Libro hecho con el constructor por defecto: ");
        Libro libro1 = new Libro();

        libro1.mostrar();

    //Usando el constructor con parametros
        System.out.println("Libro hecho con el segundo constructor: ");
        Libro libro2 = new Libro("La ciudad y los perros", "Mario Vargas Llosa", 1963,(short)448);
        libro2.mostrar();

    }
}
