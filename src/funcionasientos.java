public class funcionasientos {
    public static void main(String[] args) {
        boolean [][]asiento;
/*
asiento = new boolean[4][4];

asiento [0][0] = true;

    asiento [0][0] = true;
        asiento [0][1] = true;
        asiento [0][2] = true;
        asiento [0][3] = false;
        asiento [1][0] = true;
        asiento [1][1] = true;
  */
   asiento  = new boolean[][] {
           {false, true, false, false},
           {false, true, true, false},
           {false, true, false,false},
           {false,false,false,false}
   };
   for(int fila = 0; fila < asiento.length;fila++){
       for (int columna = 0; columna < asiento[0].length;columna++){
           if (asiento[fila][columna]==true){
               System.out.print("U");
           }
           else {
               System.out.println("X");
           }

       }
       System.out.println("\n");

   }





    }

}

