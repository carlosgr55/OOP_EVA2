
package eva2_16_protected;

/**
 *
 * @author gambo
 */
public class EVA2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperClase obj = new SuperClase();
        obj.dato = 5;
    }
    
}

class SuperClase{
    protected int dato;

    
}


class SubClase extends SuperClase{
    public void imprimir(){
        System.out.println("El valor es "+ dato);
    }
}