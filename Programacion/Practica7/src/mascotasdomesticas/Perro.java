package mascotasdomesticas;

/**
 * Gato.java
 * Clase que modela a un gato.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 04/19/2023
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
