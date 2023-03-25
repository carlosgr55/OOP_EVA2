
package SuperClases;


public abstract class Producto {
    private String nombre;
    protected double precio;
    private String unidad;
    
    public abstract double precioVenta(int cant);

    public Producto(){
        nombre = "---";
        precio = 0.0;
        unidad = "---";
    }

    public Producto(String nombre, double precio, String unidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
