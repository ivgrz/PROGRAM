package Calendario;

public class data {

    private int dia;

    private int mes;

    private int year;



    public data(){



        year = 1;

        dia = 1;

        mes = 1;



    }
    public void incrementodia(){



        }

    public void incrementomes(){

        if (dia >= 31){
            dia = 1;
            mes++;
        }

    }
    private void excepcionleapyear(){




    }




    }



