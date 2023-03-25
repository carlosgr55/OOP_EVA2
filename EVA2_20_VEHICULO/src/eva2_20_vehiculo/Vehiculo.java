package eva2_20_vehiculo;

public class Vehiculo {
    protected int velocidad;
    private String marca;
    private int llantas;
    private String color;

    public Vehiculo(int velocidad, String marca, int llantas, String color) {
        this.velocidad = velocidad;
        this.marca = marca;
        this.llantas = llantas;
        this.color = color;
    }
    public Vehiculo(){
        this.velocidad = 0;
        this.marca = "---";
        this.llantas = 0;
        this.color = "---";
        
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
