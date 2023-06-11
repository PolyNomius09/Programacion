/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascota;

/**
 *
 * @author rafyt
 */
public abstract class mascota {
    
    protected String nombre;
    protected int edad;
    protected String duenio;
    protected String tipo;

    public mascota(String n, int e, String d, String t) {
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
