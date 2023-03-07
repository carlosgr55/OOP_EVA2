package MisClases;

public class Persona {

    private String ID = "";
    private String nombre = "";
    private int edad = 0;
    
    public void setID(String ID){
        this.ID = ID;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getID(){
        return ID;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    public void imprimirDatos(){
        System.out.println("ID "+ID);
        System.out.println("Nombre "+nombre);
        System.out.println("Edad "+edad);
    }
}
