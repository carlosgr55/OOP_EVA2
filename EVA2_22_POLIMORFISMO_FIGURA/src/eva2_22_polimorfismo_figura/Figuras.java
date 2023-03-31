/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eva2_22_polimorfismo_figura;

/**
 *
 * @author gambo
 */
public interface Figuras {
    
    //No sepueden instanciar
    //Son como un contrato, se obliga a implementar
    //solo metodos y constantes abstractos
    double calcularArea();
    double calcularPeri();
}
