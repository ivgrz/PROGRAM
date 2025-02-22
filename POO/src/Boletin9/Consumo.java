package Boletin9;

public class Consumo {
    private int kilometros;
    private int litros;
    private int velocidadm;
    private int pGas;
public Consumo(){
    this.kilometros = 0;
    this.litros = 0;
    this.pGas = 0;
    this.velocidadm = 0;
}
public Consumo(int kilometros, int litros, int velocidadm, int pGas){
    this.kilometros = kilometros;
    this.litros= litros;
    this.velocidadm= velocidadm;
    this.pGas=pGas;
}
//funciones
public double getTiempo(){
 double tiempo = (double) kilometros /velocidadm;
return tiempo;
}
public double consumomedio(){
    double consum = (double)(litros/kilometros)*100;
    return consum;
}
public double consumoEuros(){
    double consumoe = (double)(pGas * consumomedio());
    return consumoe;
}
    //Gets y sets
public double getKilometros(){
    return kilometros;
}

public void setKilometros(int kilometros){
    this.kilometros = kilometros;
}
public double getlitros(){
    return litros;
}
public void setLitros(int Litros){
    this.litros = litros;
}
public double getvelocidadm(){
    return velocidadm;
}
public void setVelocidadm(int velocidadm){
    this.velocidadm = velocidadm;
}
public double getpGas(){
    return pGas;
}
public void setpGas(int pGas){
    this.pGas = pGas;
}
}
