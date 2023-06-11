package mascotasexoticas;

/**
 * Brontosaurio.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
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
