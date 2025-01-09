public class arrayhorario {
    public static void main(String[] args) {
        System.out.println(horario("lunes",1));
    }
public static String horario(String dia, int hora) {
    String horario[][] = {
            {"BD", "BD", "PROG", "ENG", "COD"},
            {"BD", "BD", "PROG", "ENG", "LM"},
            {"BD", "BD", "PROG", "SI", "LM"},
            {"BD", "SI", "LM", "SI", "SI"},
            {"PROG", "PROG", "LM", "ENG", "SI"}
    };
    int numdia;
    switch (dia) {
        case "lunes"->
            numdia = 0;
        case "martes" ->
            numdia = 1;
        case "miercoles" ->
            numdia = 2;
        case "jueves" ->
            numdia = 3;
        case "viernes" ->
            numdia = 4;
        default ->
            numdia = -1;

    }

   if (numdia < 0 || numdia >= 5){
    return "Introduce un dia entre lunes y viernes";
   } else if (hora<=0 || hora > 8) {
       return "Introduce una hora entre 1 y 8";
   }
    else {
        return horario[numdia][hora];
    }
}
public static int horasMod (String horario[][], String modulo){
    int cantidadh = 0;
        for (int hora =0; hora <= 8; hora++ ){
    for (int dia = 0; dia < 5; dia++){
        if (modulo.equals(horario[dia][hora])){
            cantidadh++;
        }
    }
}
    return cantidadh;
}
    }

