/*
 * 
 */
package eva2_22_polimorfismo;

//Clase derivada que se extiende a la clase base
//Subclase extends superclase
//Hijo extends padre
public class Estudiante extends Persona {

    private String noControl;

    public Estudiante() {
        super(); //Constructor de la superclase
        this.noControl = "----";
    }

    public Estudiante(String nombre, String apellido, int edad, String noControl){
        super(nombre,apellido,edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //Override reemplaza el metodo con la misma forma en la superclase
    //En este caso, reemplaza a imprimirDatos() de Persona
    @Override
    public void imprimirDatos(){
        super.imprimirDatos(); //Viene de persona
        System.out.println("Número de control: "+ noControl );
    }
    
}
