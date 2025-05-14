/*
Implementa un método xenérico estático o que se lle pasa como parámetro dúas táboas
con elementos do mesmo tipo xenerico e devolta unha nova táboa cos elementos de
ambas concatenados (os da segunda táboa despois dos da primeira).

 */


public class Ejercicio1 <T> {
    public static <T> String[] concatenar(T []tabla1, T []tabla2){
        String[] tabla3 = new String[tabla1.length + tabla2.length];

                    if (tabla1.length != tabla2.length){
                        throw new IllegalArgumentException("Los tamaños de las tablas no son iguales");
                    }else {
                        for (int i = 0; i <tabla1.length; i++ ){
                            tabla3[i] = tabla1[i] + " " + tabla2[i];
                        }
                    }




        return tabla3;
    }



}
