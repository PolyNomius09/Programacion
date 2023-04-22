/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author rafyt
 */

// Clase Tablet (hereda de Computadora)
public class Tablet extends Computadora {
    private String modelo;
    
    // Constructor
    public Tablet(int memoria, String procesador, int almacenamiento, String GPU, String modelo) {
        super(memoria, procesador, almacenamiento, GPU);
        this.modelo = modelo;
    }

    // Métodos adicionales
    public void cargar() {
        System.out.println("La tablet se está cargando.");
    }
    
    public void reiniciar() {
        System.out.println("La tablet se está reiniciando.");
    }
    
    public void desbloquear() {
        System.out.println("La tablet se está desbloqueando.");
    }

    // Getter y Setter para el atributo modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void mostrarDatos() {
        System.out.println("Memoria: " + getMemoria());
        System.out.println("Procesador: " + getProcesador());
        System.out.println("Almacenamiento: " + getAlmacenamiento());
        System.out.println("GPU: " + getGPU());
        System.out.println("Modelo: " + modelo);
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