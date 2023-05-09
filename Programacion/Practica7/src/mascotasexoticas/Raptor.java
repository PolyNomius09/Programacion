package mascotasexoticas;

/**
 * Raptor.java
 * Clase que modela a un raptor.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
 */
public class Raptor extends Dinosaurio{

    public Raptor(String n, int e, String d) {
        super(n, e, d, "Raptor");
    }

    @Override
    public String hablar() {
        return "¡GRRRRRRRRRRRRRRRRRRRRRR!";
    }
    
}
