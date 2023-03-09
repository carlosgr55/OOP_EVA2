/*
 * 
 */
package eva2_3_extends;

    //Clase derivada que se extiende a la clase base
    //Subclase extends superclase
    //Hijo extends padre
public class Estudiante extends Persona{
    private String noControl;

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante() {
        noControl = "";
    }
    

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
}
