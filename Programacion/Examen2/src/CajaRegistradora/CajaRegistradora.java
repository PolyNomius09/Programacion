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
    private ArrayList cantidades;

    // Constructor
    public CajaRegistradora() {
        this.nombreTienda = nombreTienda;
        this.nombreCajero = nombreCajero;
        this.inventario = new ArrayList<>(); // Inicializamos el atributo inventario en el constructor
        productos = new ArrayList<Producto>();
        cantidades = new ArrayList();
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
    TicketVenta ticket = new TicketVenta(productos, nombreTienda, nombreCajero, cantidades);

    System.out.println("NUEVA VENTA");
    mostrarInventario();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el número de producto que desea vender: ");
    int indiceProducto = scanner.nextInt();
    scanner.nextLine(); // Consumir el salto de línea

    System.out.print("Ingrese la cantidad de piezas que desea vender: ");
    int cantidadPiezas = scanner.nextInt();
    scanner.nextLine(); // Consumir el salto de línea

    Producto producto = inventario.get(indiceProducto - 1);
    if (producto.getCantidadExistencia() < cantidadPiezas) {
        System.out.println("No hay suficientes piezas en existencia");
        return;
    }

    producto.vender(cantidadPiezas);
    ticket.agregarProducto(producto, cantidadPiezas);
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
    System.out.println("-----------------------------------------------------------------");
    System.out.printf("%-5s%-20s%-10s%-10s\n", "No.", "Producto", "Cantidad", "Precio");
    System.out.println("-----------------------------------------------------------------");
    for (int i = 0; i < inventario.size(); i++) {
        Producto producto = inventario.get(i);
        System.out.printf("%-5d%-20s%-10d%-10.2f\n", i + 1, producto.getNombre(), producto.getCantidadExistencia(), producto.getPrecioUnitario());
        }
    System.out.println("-----------------------------------------------------------------");
    }
    
    // Método para salir del programa
    public void salir() {
        System.exit(0);
    }

    // Método para pedir el nombre de la tienda
    public void pedirNombreTienda() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la tienda: ");
        String nombre = sc.nextLine();
        registrarNombreTienda(nombre);
    }

    // Método para pedir el nombre del cajero
    public void pedirNombreCajero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cajero: ");
        String nombre = sc.nextLine();
        registrarNombreCajero(nombre);
    }
}