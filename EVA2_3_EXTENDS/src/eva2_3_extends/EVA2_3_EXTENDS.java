/*
 * 
 */
package eva2_3_extends;

/**
 *
 * @author gambo
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Estudiante is a persona
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Sophie");
        estudiante1.setApellido("Xeon");
        estudiante1.setEdad(23);
        estudiante1.setNoControl("22550334");
        
        System.out.println("Imprimir datos estudiante");
        System.out.println("Nombre " + estudiante1.getNombre());
        System.out.println("Apellido " + estudiante1.getApellido());
        System.out.println("Edad " + estudiante1.getEdad());
        System.out.println("NoControl " + estudiante1.getNoControl());

        //Proveedores is a persona
        Proveedores prov = new Proveedores();
        prov.setNombre("coca");
        prov.setApellido("cola");
        prov.setEdad(100);
        prov.setRfc("coc100");

        
        System.out.println("\nImprimir datos proveedor");
        System.out.println("Nombre " + prov.getNombre());
        System.out.println("Apellido " + prov.getApellido());
        System.out.println("Edad " + prov.getEdad());
        System.out.println("RFC " + prov.getRfc());

    }

}
