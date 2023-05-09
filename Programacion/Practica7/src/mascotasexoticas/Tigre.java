package mascotasexoticas;

/**
 * Tigre.java
 * Clase que modela a un tigre.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
 */
public class Tigre extends Exotica{

    public Tigre(String n, int e, String d) {
        super(n, e, d, "Tigre");
    }

   @Override
    public String hablar() {
        return "Grrrrrr!";
    }
    
}
