package eva2_17_interfaces;

public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //No se pueden instanciar las interfaces
        //MostrarDatos obj = new MostrarDatos();
        Persona persona = new Persona("Ethel Cain", 25);
        persona.imprimirDatos();
        Computadora compu = new Computadora("RYZEN",16, 300000, "Computadora ");
        compu.imprimirDatos();
    }

}
