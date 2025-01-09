public class EjemploTablas {
    public static void main(String[] args) {
        int[] edades;
        edades = new int[5];
        edades[0] = 31;
        edades[1] = 23;
        edades[2] = 56;
        edades[3] = 12;
        edades[4] = 32;
        System.out.println(edades[4]);
        String[] nombres = {"Manuel", "Jose", "Rosa", "Ana"};
        System.out.println(nombres[3]);

        int minimo = edades[0];
        for (int i = 1; i < edades.length; i++){
           if (minimo > edades[i]) minimo = edades[i];
            System.out.println("el valor minimo de edades es: "+ minimo);

            for (int edad: edades){
                if (minimo >edad) minimo = edad;

            }
            System.out.println("el valor minimo de edades es: "+ minimo);
        }

    }
}