/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CajaRegistradora;
import Productos.Producto;
import Tickets.TicketVenta;
import BD.BaseDatos;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * Clase que representa la caja registradora y coordina todas las operaciones de la misma.
 */
public class CajaRegistradora {
    private String nombreTienda;
    private String nombreCajero;
    private ArrayList<Producto> productos;
    private ArrayList<Producto> inventario;

    // Constructor
    public CajaRegistradora() {
        productos = new ArrayList<Producto>();
    }

    // Métodos para registrar el nombre de la tienda y del cajero
    public void registrarNombreTienda(String nombre) {
        this.nombreTienda = nombre;
    }

    public void registrarNombreCajero(String nombre) {
        this.nombreCajero = nombre;
    }

    // Métodos para agregar, actualizar y eliminar productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarProducto(int indice, Producto producto) {
        productos.set(indice, producto);
    }

    public void eliminarProducto(int indice) {
        productos.remove(indice);
    }

    // Método para iniciar una nueva venta
    public void nuevaVenta() throws IOException {
        TicketVenta ticket = new TicketVenta(productos, nombreTienda, nombreCajero);
        ticket.imprimirTicket();
        ticket.guardarTicket();
    }
    
    public CajaRegistradora(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    public double calcularTotal(ArrayList<Producto> carrito) {
        double total = 0.0;
        for (Producto producto : carrito) {
            total += producto.getPrecioUnitario();
        }
        return total;
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Producto producto : inventario) {
            System.out.printf("%-20s%-10s%-10.2f\n", producto.getNombre(), "", producto.getPrecioUnitario());
        }
    }
    
    // Método para salir del programa
    public void salir() {
        System.exit(0);
    }
}