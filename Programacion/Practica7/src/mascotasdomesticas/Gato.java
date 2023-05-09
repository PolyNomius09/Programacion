package mascotasdomesticas;

/**
 * Gato.java
 * Clase que modela a un gato.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
 */
public class Gato extends Domestica{

    public Gato(String n, int e, String d) {
        super(n, e, d, "Gato");
    }

    @Override
    public String hablar() {
        return "Miau!";
    }
    
}
