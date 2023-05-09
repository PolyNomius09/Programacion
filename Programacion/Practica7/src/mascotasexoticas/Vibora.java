package mascotasexoticas;

/**
 * Vibora.java
 * Clase que modela a una vibora.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
 */
public class Vibora extends Exotica{

    public Vibora(String n, int e, String d) {
        super(n, e, d, "Vibora");
    }

    @Override
    public String hablar() {
        return "Ssssss!";
    }
    
}
