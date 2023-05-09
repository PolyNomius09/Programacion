package mascotas;

/**
 * Mascota.java
 * Clase que modela una mascota.
 * @author Gael Emiliano Casillas Avina (casillas.avina.gael.emiliano@gmail.com)
 * @since 05/04/2023
 */
public abstract class Mascota {
    
    protected String nombre;
    protected int edad;
    protected String duenio;
    protected String tipo;

    public Mascota(String n, int e, String d, String t) {
        this.nombre = n;
        this.edad = e;
        this.duenio = d;
        this.tipo = t;
    }
    
    public String getDuenio() {
        return duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setDuenio(String duenio){
        this.duenio = duenio;
    }

    public abstract String hablar();

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Dueño: " + duenio + ", Tipo: " + tipo;
    }
}