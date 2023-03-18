package eva2_8_super;

public class EVA2_8_SUPER {

    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("fulgencio",10);
        Mamifero mamifero = new Mamifero("cafe","jose alfonso",150);
        Canus can1 = new Canus();
        can1.getNombre();
    }

}

class Animal {
    private String nombre;
    private int peso;
    
    public Animal() {
        System.out.println("ESTÁ VIVE");
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("VIVE CONSTRUCTOR 2");
    }
    

    public void respirar() {
        System.out.println("just keep breathing and breathing and breathing");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}

class Mamifero extends Animal {
    private String colorPelo;
    public Mamifero() {
        //Super ----> solo ve cosas de la super clase
        //lo primero al crear un constructor sub hay que invocar la constructor de la super
        super(); //Es la invocacion del constructor default de la clase que java agrega en automatico
        System.out.println("mamifero !!!!");
    }


    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso); //invocacion al constructor de la superclase
        this.colorPelo = colorPelo;
        System.out.println("soy un mamifero del constructor 2");
    }
    
    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
}

class Canus extends Mamifero{
    
    public Canus() {
       super();
        System.out.println("soy un can woof woof");
    }
    
}
