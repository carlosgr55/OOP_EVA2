package eva2_10_override;

public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona pers = new Persona("Carlos",19);
        Persona pers2 = new Persona();
        
        System.out.println(pers);
        System.out.println(pers2);
        
        
    }

}

class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        nombre = "default";
        edad = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        //NO SE INVOCA AL METODO SOBREESCRITO DE LA SUPER CLASE
        //EL METODO SE REEMPLAZA TOTALMENTE
        String cade = "Datos " +
                      "\nNombre: "+nombre+"\n"+
                      "Edad: "+edad;
        return cade;
    }
}
