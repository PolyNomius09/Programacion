package mascotasexoticas;

/**
 * Dinosaurio.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public abstract class Dinosaurio extends Exotica{
    
   public Dinosaurio(String n, int e, String d, String t) {
        super(n, e, d, t);
    }
    
    @Override
    public String toString(){
        return "Tienes un dinosaurio\nLa mascota es exotica\nEl nombre: " + this.nombre + "\nLa edad: " + this.edad + "\nEl duenio: " + this.duenio + "\nEl tipo: " 
                + this.tipo + "\nLa peligrosidad: " + this.factorPeligro;
    }
    
}
