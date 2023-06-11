/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

/**
 * Producto.java
 * Examen 2
 * @author Rafael Lopez Olvera
 * date 2023-05-08
 * Programacion
 */

/**
 * Clase que representa un producto en la tienda.
 */
public class Producto{
    private String nombre;
    private String marca;
    private double precioUnitario;
    private int cantidadExistencia;

    // Constructor
    public Producto(String nombre, String marca, double precioUnitario, int cantidadExistencia) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.cantidadExistencia = cantidadExistencia;
    }

    // Métodos para acceder y actualizar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
    
    public boolean vender(int cantidadPiezas) {
    if (cantidadPiezas > 0 && cantidadPiezas <= precioUnitario) {
        precioUnitario -= cantidadPiezas;
        return true;
    }
    return false;
    }
}