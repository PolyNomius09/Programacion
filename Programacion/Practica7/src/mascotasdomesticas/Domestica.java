package mascotasdomesticas;

import java.util.Random;
import mascotas.Mascota;

/**
 * Domestica.java
 * Clase que modela la clase domestica.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
 */
public abstract class Domestica extends Mascota{
    
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
