/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author gambo
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil carro = new Automovil("Nissan", 2010, "Versa", 60);
        Bicicleta bici = new Bicicleta("Veloz", "Grandes", "Harley", 10);

        Object obj = carro;
        cambiarVelocidad(carro, 50);
        cambiarVelocidad(bici, 30);
    }

    public static void cambiarVelocidad(Datos vehi, int vel) {
        vehi.acelerar(vel);
        vehi.tablero();
    }

}

interface Datos {

    void acelerar(int cambio);

    void tablero();
}

class Vehiculo {

    protected String marca;
    protected double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public Vehiculo() {
        marca = "---";
        velocidad = 0.0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //La velocidad se modifica con acelerar
    public double getVelocidad() {
        return velocidad;
    }

}

class Automovil extends Vehiculo implements Datos {

    private String modelo;
    private int año;

    public Automovil(String modelo, int año, String marca, double velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public Automovil() {
        super();
        this.modelo = "---";
        this.año = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void acelerar(int cambio) {
        double cambioVel = velocidad += cambio;
        if (cambioVel >= 0) {
            velocidad += cambio;
            tablero();
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del auto " + velocidad);
    }

}

class Bicicleta extends Vehiculo implements Datos {

    private String tipo;
    private String rodada;

    public Bicicleta(String tipo, String rodada, String marca, double velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public Bicicleta() {
        super();
        this.tipo = "---";
        this.rodada = "---";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        double cambioVel = velocidad += cambio;
        if (cambioVel >= 0) {
            velocidad += cambio;
            tablero();
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bici " + velocidad);
    }

}
