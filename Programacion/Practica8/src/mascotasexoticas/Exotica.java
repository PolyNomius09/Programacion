package mascotasexoticas;

import java.util.Random;
import mascota.mascota;

/**
 * Exotica.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public abstract class Exotica extends mascota{
    
    protected int factorPeligro;
    
    public Exotica(String n, int e, String d, String t) {
        super(n, e, d, t);
        Random rn = new Random();
        this.factorPeligro = rn.nextInt(10) + 1;
    }
    
    public int getFactorPeligro(){
        return this.factorPeligro;
    }
    
    public void setFactorPeligro(int f){
        this.factorPeligro = f;
    }
    
    @Override
    public String toString(){
        return "La mascota es exotica\nEl nombre: " + this.nombre + "\nLa edad: " + this.edad + "\nEl duenio: " + this.duenio + "\nEl tipo: " 
                + this.tipo + "\nLa peligrosidad: " + this.factorPeligro;
    }
}
