package MisClases;

public class TV {
     private int volumen;
    private int canal;
    private boolean estado;
    
    public int getVolumen(){
        return volumen;
    }
    
    public int getCanal(){
        return canal;
    }
    
    public boolean getEstado(){
        return estado;
    }
    public void setVolumen(int Vol){
        volumen = Vol;
    }
    public void setCanal(int Canal){
        this.canal = Canal;
    }
    public void setEstado(boolean Estado){
        estado = Estado;
    }
    public void imprimirDatos(){
        System.out.println("Volumen "+volumen);
        System.out.println("Canal "+canal );
        System.out.println("Power "+estado);
    }
    
}
