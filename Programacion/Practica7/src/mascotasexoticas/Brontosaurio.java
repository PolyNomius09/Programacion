package mascotasexoticas;

/**
 * Brontosaurio.java
 * Clase que modela a un brontosaurio.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
 */
public class Brontosaurio extends Dinosaurio{

    public Brontosaurio(String n, int e, String d) {
        super(n, e, d, "Brontosaurio");
    }

    @Override
    public String hablar() {
        return "¡BRRRRRRRRRRRRRRRRRRRR!";
    }
    
}
