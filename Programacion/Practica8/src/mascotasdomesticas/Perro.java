package mascotasdomesticas;

/**
 * Perro.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public class Perro extends Domestica{

        public Perro(String n, int e, String d) {
        super(n, e, d, "Perro");
    }

    @Override
    public String hablar() {
        return "Guau!";
    }

       
}
