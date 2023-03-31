/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_polimorfismo_figura;

import java.util.Scanner;

/**
 *
 * @author gambo
 */
public class EVA2_22_POLIMORFISMO_FIGURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Circulo[] circulos = new Circulo[10];
        //Un arreglo en java va desde 0 hasta n-1
        //n es la cantidad de elementos del arreglo
        circulos[0] = new Circulo(5);
        circulos[0].calcularArea();
        
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circulo(5+i);
            circulos[i].imprimirDatos();            
        }
         */
        Figuras[] figuras; //Se declara arreglo, pero no se crea
        //Se crea scanner para capturar la cantidad de figuras
        Scanner input = new Scanner(System.in);
        System.out.println("¿cuantas figuras?");

        //Nos permite capturar
        int cant = input.nextInt();
        System.out.println("Cantidad " + cant);
        figuras = new Figuras[cant];//Se crea arreglo con la cantidad que ingresó el usuario

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Ingresa el tipo de figura");
            System.out.println("1. Circulo \n2. Triangulo");
            int tipo = input.nextInt();
            if (tipo == 1) { //Si la captura es 1 la figura es un circulo
                Circulo circu = new Circulo();
                System.out.println("Introduce el radio");
                circu.setRadio(input.nextDouble());
                figuras[i] = circu;
            } else { //Es un triangulo
                Triangulo tri = new Triangulo();
                System.out.println("Introduce la altura");
                tri.setAltura(input.nextDouble());
                System.out.println("Introduce la base");
                tri.setBase(input.nextDouble());
                figuras[i] = tri;
            }
        }
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo){
                Circulo circu = (Circulo)figuras[i];//Casting convierte a su clase
                circu.imprimirDatos();
            }
            else{
                    Triangulo tri = (Triangulo)figuras[i];//Casting
                    tri.imprimirDatos();
                    }
            

        }
    }

}
