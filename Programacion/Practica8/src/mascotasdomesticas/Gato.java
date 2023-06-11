package mascotasdomesticas;

/**
 * Gato.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
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
