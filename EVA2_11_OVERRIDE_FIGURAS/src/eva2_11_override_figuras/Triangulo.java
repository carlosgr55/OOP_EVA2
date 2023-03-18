/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_override_figuras;

/**
 *
 * @author gambo
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;        
    }

    public Triangulo() {
        base = 0;
        altura = 0;
    }
   
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPeri(){
        return calcularHipo() + base + altura;
    }
    
    public double calcularHipo(){
        return Math.sqrt((base*base)+(altura*altura));
    }
    
    @Override
    public String toString(){
        String cade = "DATOS TRIANGULO"+ "\n"+
                       "Area: "+calcularArea()+"\n"+
                       "Perimetro: "+calcularPeri();
        return cade;                
    }
    
}
