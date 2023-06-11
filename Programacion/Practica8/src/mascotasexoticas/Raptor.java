package mascotasexoticas;

/**
 * Raptor.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
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
