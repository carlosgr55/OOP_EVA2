package eva2_4_formato_apa;

public class Documento {
    private String autor;
    private String titulo;
    private int año;
    private String mes;
    private int dia;
    private String ciudad;

    public Documento(String autor, String titulo, int año, String mes, int dia, String ciudad) {
        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.ciudad = ciudad;
    }

    public Documento() {
        this.autor = autor;
    }

    
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
