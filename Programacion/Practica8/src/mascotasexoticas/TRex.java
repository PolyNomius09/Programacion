package mascotasexoticas;

/**
 * TRex.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public class TRex extends Dinosaurio{

    public TRex(String n, int e, String d) {
        super(n, e, d, "TRex");
    }

    /**
     * Funcion para que el TRex hable.
     */
    @Override
    public String hablar() {
        return "¡ROOOOOOOOOOOOOOOOAR!";
    }
    
}
