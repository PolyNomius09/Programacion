/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author rafyt
 */

// Clase Computadora (clase abstracta)
public abstract class Computadora {
    int memoria;
    String procesador;
    int almacenamiento;
    String GPU;

    // Constructor
    public Computadora(int memoria, String procesador, int almacenamiento, String GPU) {
        this.memoria = memoria;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.GPU = GPU;
    }

    // Getters y Setters abstractos
    public abstract int getMemoria();
    public abstract void setMemoria(int memoria);

    public abstract String getProcesador();
    public abstract void setProcesador(String procesador);

    public abstract int getAlmacenamiento();
    public abstract void setAlmacenamiento(int almacenamiento);

    public abstract String getGPU();
    public abstract void setGPU(String GPU);
    
    
}