package mascotasexoticas;

/**
 * TRex.java
 * Clase que modela a un TRex.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
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
