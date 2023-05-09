package mascotasexoticas;

/**
 * Dinosaurio.java
 * Clase que modela a un dinosaurio.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
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
