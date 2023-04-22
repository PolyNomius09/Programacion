/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author rafyt
 */

// Clase ComputadoraEscritorio (hereda de Computadora)
public class ComputadoraEscritorio extends Computadora {
    private String tipoTorre;

    // Constructor
    public ComputadoraEscritorio(int memoria, String procesador, int almacenamiento, String GPU, String tipoTorre) {
        super(memoria, procesador, almacenamiento, GPU);
        this.tipoTorre = tipoTorre;
    }

    // Métodos adicionales
    public void encender() {
        System.out.println("La computadora de escritorio se está encendiendo.");
    }
    
    public void reiniciar() {
        System.out.println("La computadora de escritorio se está reiniciando.");
    }
    
    public void apagar() {
        System.out.println("La computadora de escritorio se está apagando.");
    }

    // Getter y Setter para el atributo tipoTorre
    public String getTipoTorre() {
        return tipoTorre;
    }

    public void setTipoTorre(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }
    
    public void mostrarDatos() {
        System.out.println("Memoria: " + getMemoria());
        System.out.println("Procesador: " + getProcesador());
        System.out.println("Almacenamiento: " + getAlmacenamiento());
        System.out.println("GPU: " + getGPU());
        System.out.println("Torre: " + tipoTorre);
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