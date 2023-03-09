/*
 * 
 */
package eva2_4_formato_apa;

/**
 *
 * @author gambo
 */
public class Libro extends Documento {
    private String editorial;
    private String paginas;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
        
}
