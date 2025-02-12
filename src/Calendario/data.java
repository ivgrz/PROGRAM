package Calendario;
//ejemplo class
public class data {

    private int dia;

    private int mes;

    private int year;



    public data(int dia, int mes, int year){


        setAno(year);
        setMes(mes);
        setDia(dia);





    }
    public void setDia(int dia){

        if (dia > 0 && dia <= diasMes()) this.dia = dia;
        else this.dia = 1;


    }
    public int getDia(){
        return dia;
    }
    public void setMes(int mes){
        if (mes > 0 && mes<13) this.mes = mes;
        else this.mes = 1;

    }
    public int getMes(){
        return mes;
    }
    public void setAno(int year){
    //Solo admitir fechas DC
        if (year >= 0) this.year = year;
        else this.year = 0;

    }
    public int getAno(){
        return year;
    }
    public void incrementarDia(){
        if (dia == diasMes())
    }
    public void incrementarmeses(){
        if (mes == 12 ){
            mes = 1;
            incrementarAno();
        }
        else mes++;
    }
    public void incrementarAno(){
        year++;
    }

    private boolean ebisiesto(){
    if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0){
        return true;
    }else return false;


    }

    private int diasMes(){
        int [] diasmaxMes = {31, 28, 31, 30, 31,30,31, 31, 30, 31, 30,31};
        int diasMes = diasmaxMes   [mes-1];
        if ((ebisiesto()==true)&& mes == 2) diasMes = 29;
        return diasMes;

    }



}



