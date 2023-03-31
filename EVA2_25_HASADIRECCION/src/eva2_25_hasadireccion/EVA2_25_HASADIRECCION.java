/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_hasadireccion;

/**
 *
 * @author gambo
 */
public class EVA2_25_HASADIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Lana");
        persona.setApellido("Del Rey");
        persona.setEdad(37);
        //Para asignar una direccion se debe crear el objeto
        Direccion direccion = new Direccion();
        direccion.setCalle("Ocean Boulevard");
        direccion.setNumero(9);
        direccion.setCiudad("Los Angeles");
        direccion.setEstado("California");
        direccion.setColonia("Mariners Apartment Complex");
        direccion.setCp("31137");
        persona.setDireccion(direccion);
        persona.imprimirDatos();
    }

}

class Direccion {

    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public Direccion() {
        this.calle = "---";
        this.numero = 0;
        this.colonia = "---";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
    }

    public void imprimirDatos() {
        System.out.println("DIRECCIÓN");
        System.out.println(calle + " #" + numero + ", " + colonia + "\nC.P" + cp + ", " + ciudad + ", " + estado);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion; //La persona tiene(HAS-A)una direccion
    
    public void imprimirDatos(){
        System.out.println("PERSONA");
        System.out.println(nombre+" "+apellido+" \n"+edad+" años");
        if(direccion == null)
            System.out.println("Sin dirección");
        
        else
            direccion.imprimirDatos();
        
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.direccion = null; //NULL porque no tiene una direccion
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
class Sucursal{
    private String nombre;
    private Direccion direccion;
}