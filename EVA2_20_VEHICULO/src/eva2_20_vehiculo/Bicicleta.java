/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author gambo
 */
public class Bicicleta extends Vehiculo implements ControlVelocidad, MostrarDatos {

    private String tipo;
    private String tama�o;

    public Bicicleta(String tipo, String tama�o, int velocidad, String marca, int llantas, String color) {
        super(velocidad, marca, llantas, color);
        this.tipo = tipo;
        this.tama�o = tama�o;
    }

    public Bicicleta() {
        super();
        this.tipo = "---";
        this.tama�o = "---";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTama�o() {
        return tama�o;
    }

    public void setTama�o(String tama�o) {
        this.tama�o = tama�o;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void detener() {
        velocidad = 0;
    }

    @Override
    public void aumentarVelocidad(int aceleracion) {
        if ((aceleracion <= 0) && (velocidad == 0) || (velocidad + aceleracion <= 0)) {
            System.out.println("El auto ya se detuvo, no se puede desacelerar");
            velocidad = 0;
        } else {
            velocidad += aceleracion;
            System.out.println("La velocidad ahora es " + velocidad + "km/h");
        }
    }

    @Override
    public void imprimirDatos() {
        System.out.println("BICICLETA");
        System.out.println("Velocidad " + velocidad);
        System.out.println("No. de llantas " + getLlantas());
        System.out.println("Color " + getColor());
        System.out.println("Marca " + getMarca());
        System.out.println("Tipo " + getTipo());
        System.out.println("Tama�o " + getTama�o());
    }

}
