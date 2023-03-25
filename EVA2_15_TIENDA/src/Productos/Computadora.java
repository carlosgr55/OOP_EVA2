package Productos;

import SuperClases.*;

/**
 *
 * @author gambo
 */
public final class Computadora extends Electronica {

    private double tama�o;
    private int memoria;
    private String procesador;
    private String dd;

    public Computadora() {
        super();
        tama�o = 0;
        memoria = 0;
        procesador = ".----";
        dd = "----";

    }

    public Computadora(double tama�o, int memoria, String procesador, String dd, String fabricante, String modelo, int garantia, String nombre, double precio, String unidad) {
        super(fabricante, modelo, garantia, nombre, precio, unidad);
        this.tama�o = tama�o;
        this.memoria = memoria;
        this.procesador = procesador;
        this.dd = dd;
    }

    public double getTama�o() {
        return tama�o;
    }

    public void setTama�o(double tama�o) {
        this.tama�o = tama�o;
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

