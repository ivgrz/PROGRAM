import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class cliente implements Comparable<cliente> {
    String dni;
    String nome;
    LocalDate dataNacemento;


    public cliente(String dni, String nome, String dataNacemento) {
        this.dni = dni;
        this.nome = nome;
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNacemento = dataNacemento;
    }

    int edad() {
        return (int) dataNacemento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(cliente outro) {
    /*    int res = 0;
        if (edad() > outro.edad()) res = 1;
        if (edad() < outro.edad()) res = -1;
        return res;
    */
    return this.edad() - outro.edad();

    }

    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNacemento=" + dataNacemento +
                '}';
    }



}
