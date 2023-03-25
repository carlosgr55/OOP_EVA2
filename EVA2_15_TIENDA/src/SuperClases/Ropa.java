
package SuperClases;

/**
 *
 * @author gambo
 */
public abstract class Ropa extends Producto {
    private String marca;
    private String color;

    public Ropa() {
        super();
        this.marca = "---";
        this.color = "----";
    }

    public Ropa(String marca, String color, String nombre, double precio, String unidad) {
        super(nombre, precio, unidad);
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
