/*
 * 
 */
package eva2_5_tipos_herencia;

/**
 *
 * @author gambo
 */
public class EVA2_5_TIPOS_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}

class SuperClase extends OtraSuperClase {

}

class OtraSuperClase { //NO se puede heredar de dos o mas superclases

}
//extends solo funciona para una unica clase

class BaseClase extends SuperClase {

}
