package eva2_22_polimorfismo;

public class Proveedores extends Persona{
    private String rfc;
    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Proveedores(String rfc, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }

    public Proveedores(String rfc) {
        super();
        this.rfc = "-----";
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos(); //Viene de persona
        System.out.println("RFC: "+ rfc );
    }
    
}
