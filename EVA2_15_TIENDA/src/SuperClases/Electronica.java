
package SuperClases;


public abstract class Electronica extends Producto {
    private String fabricante;
    private String modelo;
    private int garantia; //en días
    
    public Electronica(){
        super();
        fabricante = "---";
        modelo = "---";
        garantia = -1;       
    }


    public Electronica(String fabricante, String modelo, int garantia, String nombre, double precio, String unidad) {
        super(nombre, precio, unidad);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
}
