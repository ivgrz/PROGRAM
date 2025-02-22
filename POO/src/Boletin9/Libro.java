package Boletin9;

public class Libro {
    private String titulo;
    private String autor;
    private int anho;
    private short numPaginas;
    private float valoracion;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.anho = 0;
        this.numPaginas = 0;
        this.valoracion = 0;

    }

    public Libro(String titulo, String autor, int anho, short numPaginas) {
        this.titulo =titulo;
        this.autor = autor;
        this.anho = anho;
        this.numPaginas = numPaginas;
        this.valoracion = 0.0f;


    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnho(){
        return anho;
    }
    public void setAnho(int anho){
        this.anho = anho;
    }
    public short getNumPaginas(){
        return numPaginas;
    }
    public void setNumPaginas(short numPaginas){
        this.numPaginas = numPaginas;
    }
    public float getValoracion(){
        return valoracion;
    }
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }
    public void mostrar(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Año: "+ anho);
        System.out.println("Numero de paginas: "+ numPaginas);
        System.out.println("Valoracion: "+ valoracion);
    }
}






