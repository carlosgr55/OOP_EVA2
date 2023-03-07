/*
 * 
 */
package MisClases;

/**
 *
 * @author gambo
 */
public class Vehiculo {

    private String marca = "";
    private String carID = "";
    private int año = 2000;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCarID(String CarID) {
        this.carID = CarID;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getCarID(){
        return carID;
    }
    public int getAño(){
        return año;
    }
    
    public void imprimirDatos(){
        System.out.println("ID "+carID);
        System.out.println("Marca "+marca);
        System.out.println("Año "+año);
    }
}
