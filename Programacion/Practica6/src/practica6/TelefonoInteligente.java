/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author rafyt
 */

// Clase TelefonoInteligente (hereda de Computadora)
public class TelefonoInteligente extends Computadora {
    private String marca;
    
    // Constructor
    public TelefonoInteligente(int memoria, String procesador, int almacenamiento, String GPU, String marca) {
        super(memoria, procesador, almacenamiento, GPU);
        this.marca = marca;
    }

    // Métodos adicionales
    public void desbloquear() {
        System.out.println("El teléfono inteligente está desbloqueado.");
    }
    
    public void llamar() {
        System.out.println("El teléfono inteligente está llamando");
    }
    
    public void tomarFoto() {
        System.out.println("El teléfono inteligente está tomando foto.");
    }

    // Getter y Setter para el atributo marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void mostrarDatos() {
        System.out.println("Memoria: " + getMemoria());
        System.out.println("Procesador: " + getProcesador());
        System.out.println("Almacenamiento: " + getAlmacenamiento());
        System.out.println("GPU: " + getGPU());
        System.out.println("Marca: " + marca);
    }
    

    // Implementación de los Getters y Setters abstractos de la clase Computadora
    
    @Override
    public int getMemoria() {
    return super.memoria;
    }

    @Override
    public void setMemoria(int memoria) {
    super.memoria = memoria;
    }

    @Override
    public String getProcesador() {
    return super.procesador;
    }

    @Override
    public void setProcesador(String procesador) {
    super.procesador = procesador;
    }

    @Override
    public int getAlmacenamiento() {
    return super.almacenamiento;
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
    super.almacenamiento = almacenamiento;
    }

    @Override
    public String getGPU() {
    return super.GPU;
    }

    @Override
    public void setGPU(String GPU) {
    super.GPU = GPU;
    }
}