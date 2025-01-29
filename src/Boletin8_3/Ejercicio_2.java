package Boletin8_3;

public class Ejercicio_2 {
    public static void main(String[] args) {
String texto = """ 
        La Música Popular: Voz del Pueblo
        
        La música popular es un reflejo de las emociones y vivencias de las personas. 
        A través de sus melodías y letras, conecta a individuos de diferentes culturas, creando un lazo común que trasciende fronteras.
         Géneros como el pop, el reguetón, la salsa o el rock han logrado un impacto global, permitiendo que distintos estilos se fusionen y evolucionen con el tiempo.
          En sus acordes se encuentran historias de amor, lucha, alegría y tristeza, convirtiéndola en el medio perfecto para expresar lo que muchas veces no se puede decir con palabras. 
          Es la música de todos, esa que nos acompaña en los momentos más significativos de la vida.
        
        
        
        
        
        
        """;
        formatoHTML(texto);

    }


    public static void formatoHTML (String texto){
        int Primeralinea = texto.indexOf('\n');
        String titulo = texto.substring(0,Primeralinea);

        String parrafos = texto.substring(Primeralinea);

        System.out.println("<HTML>"+ "\n" + "<h1>" + titulo + "</h1>" + "\n" + "<p>" + parrafos + "</p>" + "\n" + "</HTML>");




    }
}
