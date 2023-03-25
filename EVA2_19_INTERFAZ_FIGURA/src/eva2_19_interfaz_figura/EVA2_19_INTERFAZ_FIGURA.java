/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_interfaz_figura;

/**
 *
 * @author gambo
 */
public class EVA2_19_INTERFAZ_FIGURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //No se pueden instanciar interfaces
        /*
        Figuras obj = new Figuras();
        MostrarDatos obj2 = new MostrarDatos();
        */
        
        Circulo circulo = new Circulo(25);
        circulo.imprimirDatos();
        Triangulo triangulo = new Triangulo(20,20);
        triangulo.imprimirDatos();
        
    }
    
}
