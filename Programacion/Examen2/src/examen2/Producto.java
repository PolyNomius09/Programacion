/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 * Clase que representa un producto en la tienda.
 */
public class Producto {
    
    private String nombre;
    private String marca;
    private double precioUnitario;
    private int cantidadEnExistencia;
    
    public Producto(String nombre, String marca, double precioUnitario, int cantidadEnExistencia) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.cantidadEnExistencia = cantidadEnExistencia;
    }
    
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
    
    public int getCantidadEnExistencia() {
        return cantidadEnExistencia;
    }
    
    public void setCantidadEnExistencia(int cantidadEnExistencia) {
        this.cantidadEnExistencia = cantidadEnExistencia;
    }
    
    public void agregarExistencia(int cantidad) {
        cantidadEnExistencia += cantidad;
    }
    
    public void reducirExistencia(int cantidad) {
        cantidadEnExistencia -= cantidad;
    }
    
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidadEnExistencia=" + cantidadEnExistencia +
                '}';
    }
}