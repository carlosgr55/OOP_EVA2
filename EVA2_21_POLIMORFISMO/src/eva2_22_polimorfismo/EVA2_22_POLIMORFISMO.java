/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_polimorfismo;

/**
 *
 * @author gambo
 */
public class EVA2_22_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estu = new Estudiante("Arca Rosalía", "Gyal del Rey", 20, "22550334");
        estu.imprimirDatos();
        Docentes profe = new Docentes("Ethel", "Cain", 22, "Tiempo completo");
        profe.imprimirDatos();
        //Con el polimorfismo se puede tratar a los objetos de la subclase 
        //como objetos de la super clase
        //no se puede al revés7
        //Se asigna un objeto del tipo estudiante a uno de tipo persona
        Persona perso = estu;
        //Se generaliza, se deja de tomar en cuenta las cosas especiales
        Persona perso2 = profe;
        Persona perso3 = new Persona();
        //No se puede asignar un objeto de persona a estudiante porque persona 
        //No tiene número de control
        //Cuando es lo contrario, los atributos y métodos especiales solo se
        //Ocultan
        //Estudiante estu2 = perso3;
        
        
    }
    
}
