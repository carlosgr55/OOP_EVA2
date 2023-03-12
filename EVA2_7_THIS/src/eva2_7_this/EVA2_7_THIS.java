package eva2_7_this;

public class EVA2_7_THIS {

    public static void main(String[] args) {
        // TODO code application logic here
        //this no puede ser referenciado en un metodo estatico
    
    }
    public void imprimir(){
       //aqui tambien es visible this
    }
}
//This es una referencias a una instancia de la clase
//todos los objetos tienen this
//pueden usar this es cualquier clase
//solo existe internamente dentro del objeto
class Persona{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la variable (parametro) declarado en le metodo
    }
       
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void imprimirDatos(){
        System.out.println("Nombre es "+this.nombre);
    }
  
}
