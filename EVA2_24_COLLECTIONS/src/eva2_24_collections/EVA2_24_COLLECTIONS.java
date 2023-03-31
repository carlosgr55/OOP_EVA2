package eva2_24_collections;

import java.util.ArrayList;

/**
 *
 * @author gambo
 */
public class EVA2_24_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Collections -> contenedores
        ArrayList arreglo = new ArrayList(); //Se guardan objetos en general
        arreglo.add(new Persona());
        arreglo.add(new Perro());
        arreglo.add(new Automovil());
        
        ArrayList<Integer> arreglo2 = new ArrayList<Integer>(); //Se guardan enteros <Integer>
        arreglo2.add(23);
        arreglo2.add(2000);
        arreglo2.add(340);
        System.out.println(arreglo2);
        System.out.println(arreglo);
    }

}

class Persona {

}

class Automovil {

}

class Perro {

}
