package mascotasexoticas;

/**
 * Vibora.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
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
