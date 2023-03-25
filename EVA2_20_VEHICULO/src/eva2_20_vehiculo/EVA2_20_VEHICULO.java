/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author gambo
 */
public class EVA2_20_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil("Nissan", "22K05Y", 50, "Versa", 4, "Azul");
        auto.aumentarVelocidad(40);
        auto.aumentarVelocidad(-80);
        auto.aumentarVelocidad(-40);
        auto.aumentarVelocidad(-80);
        auto.aumentarVelocidad(80);
        auto.detener();
        auto.aumentarVelocidad(90);
        auto.aumentarVelocidad(-100);
    }
    
}
