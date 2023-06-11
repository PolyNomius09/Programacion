package mascotasexoticas;

/**
 * Tigre.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
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
