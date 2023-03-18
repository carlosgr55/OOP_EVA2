package eva2_13_figuras_abstractas;

/**
 *
 * @author gambo
 */
public class Circulo extends Figura{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        radio = 0;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPeri() {
        return Math.PI * (radio * 2);
    }

    @Override
    public String toString() {
        String cade = "DATOS CIRCULO" + "\n"
                + "Area: " + calcularArea() + "\n"
                + "Perimetro: " + calcularPeri();
        return cade;
    }
}
