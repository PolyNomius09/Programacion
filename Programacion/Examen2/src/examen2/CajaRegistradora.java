/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;
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
    private BaseDatos baseDatos;

    public CajaRegistradora() {
        baseDatos = new BaseDatos();
        cargarBaseDatos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la caja registradora");
        System.out.println("Ingrese el nombre de la tienda:");
        nombreTienda = scanner.nextLine();
        System.out.println("Ingrese el nombre del cajero:");
        nombreCajero = scanner.nextLine();
    }

    public void cargarBaseDatos() {
        baseDatos.cargar();
        nombreTienda = baseDatos.getNombreTienda();
        nombreCajero = baseDatos.getNombreCajero();
        productos = baseDatos.getProductos();
    }

    public void guardarBaseDatos() {
        baseDatos.setNombreTienda(nombreTienda);
        baseDatos.setNombreCajero(nombreCajero);
        baseDatos.setProductos(productos);
        baseDatos.guardar();
    }

    public void agregarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        String nombreProducto = scanner.nextLine();
        System.out.println("Ingrese la marca del producto:");
        String marcaProducto = scanner.nextLine();
        System.out.println("Ingrese el precio unitario del producto:");
        double precioProducto = scanner.nextDouble();
        System.out.println("Ingrese la cantidad en existencia del producto:");
        int cantidadProducto = scanner.nextInt();
        Producto producto = new Producto(nombreProducto, marcaProducto, precioProducto, cantidadProducto);
        productos.add(producto);
        guardarBaseDatos();
        System.out.println("Producto agregado con éxito.");
    }

    public void actualizarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a actualizar:");
        String nombreProducto = scanner.nextLine();
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            System.out.println("Ingrese el nuevo precio unitario del producto:");
            double precioProducto = scanner.nextDouble();
            System.out.println("Ingrese la nueva cantidad en existencia del producto:");
            int cantidadProducto = scanner.nextInt();
            producto.setPrecio(precioProducto);
            producto.setCantidad(cantidadProducto);
            guardarBaseDatos();
            System.out.println("Producto actualizado con éxito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String nombreProducto = scanner.nextLine();
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            productos.remove(producto);
            guardarBaseDatos();
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void verListaProductos() {
        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public void iniciarNuevaVenta() {
    List<Producto> productosAVender = new ArrayList<Producto>();
    boolean seguirAgregandoProductos = true;
    while (seguirAgregandoProductos) {
        System.out.println("Seleccione un producto para agregar a la venta:");
        verListaDeProductos();
        int opcionProducto = scanner.nextInt();
        if (opcionProducto < 1 || opcionProducto > productosEnExistencia.size()) {
            System.out.println("Opción inválida. Intente nuevamente.");
            continue;
        }
        Producto productoSeleccionado = productosEnExistencia.get(opcionProducto - 1);
        if (productoSeleccionado.getCantidadEnExistencia() <= 0) {
            System.out.println("El producto seleccionado no se encuentra en existencia.");
            continue;
        }
        System.out.println("Ingrese la cantidad a vender:");
        int cantidadAVender = scanner.nextInt();
        if (cantidadAVender < 1 || cantidadAVender > productoSeleccionado.getCantidadEnExistencia()) {
            System.out.println("Cantidad inválida. Intente nuevamente.");
            continue;
        }
        productoSeleccionado.setCantidadEnExistencia(productoSeleccionado.getCantidadEnExistencia() - cantidadAVender);
        Producto productoAVender = new Producto(productoSeleccionado.getNombre(), productoSeleccionado.getMarca(), 
                                                 productoSeleccionado.getPrecioUnitario(), cantidadAVender);
        productosAVender.add(productoAVender);
        System.out.println("¿Desea agregar otro producto? (S/N)");
        String opcionSeguirAgregando = scanner.next();
        seguirAgregandoProductos = opcionSeguirAgregando.equalsIgnoreCase("S");
    }
    TicketVenta ticketVenta = new TicketVenta(nombreTienda, nombreCajero, productosAVender);
    ticketVenta.imprimirTicket();
    ticketVenta.guardarTicketEnArchivo();
    }
}