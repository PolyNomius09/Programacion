package mascotasexoticas;

import java.util.Random;
import mascotas.Mascota;

/**
 * Exotica.java
 * Clase que modela a una mascota exotica.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
 */
public abstract class Exotica extends Mascota{
    
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
