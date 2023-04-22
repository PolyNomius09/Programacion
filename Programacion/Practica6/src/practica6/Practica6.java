/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

/**
 * Main.java
 * Practica 6 pt. 1
 * @author Rafael Lopez Olvera
 * date 2023-04-14
 */

public class Practica6 {
public static void main(String[] args) {
// Creación de objetos
        ComputadoraPortatil portatil1 = new ComputadoraPortatil(8, "Intel Core i5", 512, "NVIDIA GeForce GTX 1650", "Asus");
        ComputadoraPortatil portatil2 = new ComputadoraPortatil(16, "Intel Core i7", 1024, "NVIDIA GeForce RTX 3060", "MSI");
        ComputadoraPortatil portatil3 = new ComputadoraPortatil(12, "AMD Ryzen 5", 256, "AMD Radeon Graphics", "Dell");

        ComputadoraEscritorio escritorio1 = new ComputadoraEscritorio(16, "Intel Core i7", 2048, "NVIDIA GeForce GTX 1660", "Asus");
        ComputadoraEscritorio escritorio2 = new ComputadoraEscritorio(32, "AMD Ryzen 7", 4096, "AMD Radeon RX 6800 XT", "HP");
        ComputadoraEscritorio escritorio3 = new ComputadoraEscritorio(8, "Intel Core i5", 1024, "NVIDIA GeForce GTX 1050 Ti", "Lenovo");

        TelefonoInteligente telefono1 = new TelefonoInteligente(4, "Qualcomm Snapdragon 865", 128, "Adreno 650", "Samsung");
        TelefonoInteligente telefono2 = new TelefonoInteligente(6, "Apple A15 Bionic", 256, "Apple GPU (5-core)", "Apple");
        TelefonoInteligente telefono3 = new TelefonoInteligente(8, "Qualcomm Snapdragon 888", 512, "Adreno 660", "Xiaomi");

        Tablet tablet1 = new Tablet(4, "Intel Atom x5-Z8500", 64, "Intel HD Graphics", "Samsung");
        Tablet tablet2 = new Tablet(8, "Qualcomm Snapdragon 865+", 256, "Adreno 650", "Lenovo");
        Tablet tablet3 = new Tablet(16, "Apple A14 Bionic", 512, "Apple GPU (4-core)", "Apple");

        // Prueba de métodos
        System.out.println("Datos del portatil1: ");
        portatil1.encender();
        portatil1.mostrarDatos();
        System.out.println("");
        portatil2.cargar();
        portatil2.mostrarDatos();
        System.out.println("");
        portatil3.apagar();
        portatil3.mostrarDatos();

        System.out.println("\nDatos del escritorio1: ");
        escritorio1.encender();
        escritorio1.mostrarDatos();
        System.out.println("");
        escritorio2.reiniciar();
        escritorio2.mostrarDatos();
        System.out.println("");
        escritorio3.apagar();
        escritorio3.mostrarDatos();

        System.out.println("\nDatos del telefono1: ");
        telefono1.desbloquear();
        telefono1.mostrarDatos();
        System.out.println("");
        telefono2.llamar();
        telefono2.mostrarDatos();
        System.out.println("");
        telefono3.tomarFoto();
        telefono3.mostrarDatos();

        System.out.println("\nDatos del tablet1: ");
        tablet1.cargar();
        tablet1.mostrarDatos();
        System.out.println("");
        tablet2.reiniciar();
        tablet2.mostrarDatos();
        System.out.println("");
        tablet3.desbloquear();
        tablet3.mostrarDatos();
    }
}
