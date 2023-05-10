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
        this.inventario = inventario; // Inicializamos el atributo inventario en el constructor
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
    Scanner scanner = new Scanner(System.in);
    System.out.println("Seleccione el producto que desea vender:");

    mostrarInventario();

    int productoSeleccionado = scanner.nextInt();
    if (productoSeleccionado <= 0 || productoSeleccionado > this.productos.size()) {
        System.out.println("Producto no válido");
        return;
    }

    Producto producto = this.productos.get(productoSeleccionado - 1);
    System.out.println("Ha seleccionado el producto: " + producto.getNombre());
    System.out.println("Cantidad disponible: " + producto.getCantidadExistencia());

    System.out.println("¿Cuántas piezas desea vender?");
    int cantidad = scanner.nextInt();

    if (cantidad > producto.getCantidadExistencia()) {
        System.out.println("Cantidad insuficiente de productos");
        return;
    }

    producto.vender(cantidad);
    TicketVenta ticket = new TicketVenta(this.productos,this.nombreTienda, this.nombreCajero,cantidades);
    ticket.agregarProducto(producto, cantidad);
    ticket.guardarTicket();
    }

    public double calcularTotal(ArrayList<Producto> carrito) {
        double total = 0.0;
        for (Producto producto : carrito) {
            total += producto.getPrecioUnitario();
        }
        return total;
    }

    public void mostrarInventario() {
    System.out.println("PRODUCTOS EN INVENTARIO");
    System.out.printf("%-3s%-20s%-15s%-15s\n", "No.", "Producto", "Cantidad", "Precio");
    System.out.println("---------------------------------------------------------");
    ArrayList<Producto> productos = this.productos;
    for (int i = 0; i < productos.size(); i++) {
        Producto producto = productos.get(i);
        int noProducto = i + 1;
        double precioUnitario = producto.getPrecioUnitario();
        int cantidadExistente = producto.getCantidadExistencia();
        double total = precioUnitario * cantidadExistente;
        System.out.printf("%-3d%-20s%-15.2f%-15d\n", noProducto, producto.getNombre(), precioUnitario, cantidadExistente);
        }
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