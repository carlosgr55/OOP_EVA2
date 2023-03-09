/*
 * 
 */
package eva2_6_colisiones_constructor;

/**
 *
 * @author gambo
 */
public class EVA2_6_COLISIONES_CONSTRUCTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ANIMAL");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        
        System.out.println("\nMAMIFERO");
        Mamiferos mamifero = new Mamiferos();
        mamifero.pelo();
        
    }
    
}
