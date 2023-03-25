/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author gambo
 */
public class Automovil extends Vehiculo implements ControlVelocidad, MostrarDatos {

    private String modelo;
    private String placas;

    public Automovil(String modelo, String placas, int velocidad, String marca, int llantas, String color) {
        super(velocidad, marca, llantas, color);
        this.modelo = modelo;
        this.placas = placas;
    }

    public Automovil() {
        super();
        this.modelo = "---";
        this.placas = "---";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    @Override
    public void detener() {
        velocidad = 0;
        System.out.println("Auto se detuvo");
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
        System.out.println("AUTOMOVIL");
        System.out.println("Velocidad " + velocidad);
        System.out.println("No. de llantas " + getLlantas());
        System.out.println("Color " + getColor());
        System.out.println("Marca " + getMarca());
        System.out.println("Modelo " + getModelo());
        System.out.println("Placas " + getPlacas());
    }

}
