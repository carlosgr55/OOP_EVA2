package Productos;

import SuperClases.*;

/**
 *
 * @author gambo
 */
public final class Computadora extends Electronica {

    private double tamaño;
    private int memoria;
    private String procesador;
    private String dd;

    public Computadora() {
        super();
        tamaño = 0;
        memoria = 0;
        procesador = ".----";
        dd = "----";

    }

    public Computadora(double tamaño, int memoria, String procesador, String dd, String fabricante, String modelo, int garantia, String nombre, double precio, String unidad) {
        super(fabricante, modelo, garantia, nombre, precio, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.dd = dd;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    @Override
    public double precioVenta(int cant) {
        //10 unidades -->  El precio es del 80%
        if (cant < 10) {
            return precio * cant;
        } else {
            return (precio * 0.8) * cant;
        }
    }

}

//Computadora es una clase final por lo que ya no se puede heredar de ella
//class Laptop extends Computadora{

