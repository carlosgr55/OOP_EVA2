package eva2_9_super_2;

public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante est = new Estudiante("Carlos","Gamboa",19,"22550334");
        est.imprimirDatos();
        
        Docentes docente = new Docentes("Rosalía","Motomami",25,"M25503");
        docente.imprimirDatos();
        System.out.println("Plaza "+ docente.getPlaza());
        
        Proveedores prov = new Proveedores("ARR099","Arca","Ghersi",26);
        prov.imprimirDatos();
        System.out.println("RFC "+ prov.getRfc());
    }
    
}
