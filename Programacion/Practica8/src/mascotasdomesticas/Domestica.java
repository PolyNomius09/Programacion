package mascotasdomesticas;

import java.util.Random;
import mascota.mascota;

/**
 * Domestica.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public abstract class Domestica extends mascota{
    
    protected int factorTernura;
    
    public Domestica(String n, int e, String d, String t) {
        super(n, e, d, t);
        Random rn = new Random();
        this.factorTernura = rn.nextInt(10) + 1;
    }
    
    public int getFactorTernura(){
        return this.factorTernura;
    }
    
    public void setFactorTernura(int f){
        this.factorTernura = f;
    }
    
    @Override
    public String toString(){
        return "La mascota es domestica\nEl nombre: " + this.nombre + "\nLa edad: " + this.edad + "\nEl duenio: " + this.duenio + "\nEl tipo: " 
                + this.tipo + "\nLa ternura: " + this.factorTernura;
    }
}
