package Productos;
import SuperClases.Ropa;
public class Playera extends Ropa {
    private String talla;
    private String tipo;
    
    @Override
    public double precioVenta(int cant){
        //10 unidades -->  El precio es del 80%
        if(cant < 10)
            return getPrecio() * cant;
        else 
            return (getPrecio() * 0.8)*cant;
    }
    

    public Playera() {
        super();
        this.talla = ".----";
        this.tipo = "---";
    }

    public Playera(String talla, String tipo, String marca, String color, String nombre, double precio, String unidad) {
        super(marca, color, nombre, precio, unidad);
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
