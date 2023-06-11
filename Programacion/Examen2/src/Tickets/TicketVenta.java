/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;
import CajaRegistradora.CajaRegistradora;
import Productos.Producto;
import BD.BaseDatos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * TicketVenta.java
 * Examen 2
 * @author Rafael Lopez Olvera
 * date 2023-05-08
 * Programacion
 */
public class TicketVenta{
    private ArrayList<Producto> productos;
    private String nombreTienda;
    private String nombreCajero;
    private ArrayList<Integer> cantidades;

    public TicketVenta(ArrayList<Producto> productos, String nombreTienda, String nombreCajero, ArrayList cantidades) {
        this.productos = productos;
        this.nombreTienda = nombreTienda;
        this.nombreCajero = nombreCajero;
        this.cantidades = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto, int cantidad) {
    productos.add(producto);
    cantidades.add(cantidad);
    }

    public void imprimirTicket() {
        String numeroTicket = null;
        // Ruta donde se guardarán los tickets
        String rutaArchivo = "TicketsCreados/ticket-" + numeroTicket + ".txt";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String fechaHora = dateFormat.format(date);
        double total = 0;
        double iva = 0.16;
        double totalFinal = 0;
        System.out.println("------------------------------------------");
        System.out.println(nombreTienda);
        System.out.println("------------------------------------------");
        System.out.println("Fecha y hora: " + fechaHora);
        System.out.println("Cajero: " + nombreCajero);
        System.out.println("------------------------------------------");
        System.out.printf("%-20s%-10s%-10s%-10s\n", "Producto", "Cantidad", "Precio", "Total");
        System.out.println("------------------------------------------");
        for (Producto producto : productos) {
            int cantidad = producto.getCantidadExistencia();
            double precio = producto.getPrecioUnitario();
            double subtotal = cantidad * precio;
            total += subtotal;
            System.out.printf("%-20s%-10d%-10.2f%-10.2f\n", producto.getNombre(), cantidad, precio, subtotal);
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-20s%-10s%-10.2f\n", "Total", "", total);
        iva *= total;
        System.out.printf("%-20s%-10s%-10.2f\n", "IVA (16%)", "", iva);
        totalFinal = total + iva;
        System.out.printf("%-20s%-10s%-10.2f\n", "Total a pagar", "", totalFinal);
        System.out.println("------------------------------------------");
    }

    public void guardarTicket(int cantidadPiezas) throws IOException {
//        String numeroTicket = null;
        // Ruta donde se guardarán los tickets
        String rutaArchivo = "";
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        String fechaHora = dateFormat.format(date);
        String nombreArchivo = "TicketsCreados/ticket_" + fechaHora + ".txt";
        File arch = new File("TicketsCreados\\ticket" + fechaHora + ".txt");
        boolean fileCreated = arch.createNewFile();
        if(fileCreated){
            System.out.println("Se creó");
        }else{
            System.out.println("Se creón't");
        }
        FileWriter archivo = new FileWriter(arch);
        PrintWriter escritor = new PrintWriter(arch);
        escritor.println("------------------------------------------");
        escritor.println(nombreTienda);
        escritor.println("------------------------------------------");
        escritor.println("Fecha y hora: " + fechaHora);
        escritor.println("Cajero: " + nombreCajero);
        escritor.println("------------------------------------------");
        escritor.printf("%-20s%-10s%-10s%-10s\n", "Producto", "Cantidad", "Precio", "Total");
        escritor.println("------------------------------------------");
        double total = 0.0;
        for (Producto producto : productos) {
            System.out.println(producto.getNombre()+" "+ producto.getPrecioUnitario() +" "+ producto.getCantidadExistencia());
            double cantidad = cantidadPiezas;
            double precio = producto.getCantidadExistencia();
            double subtotal = cantidad * precio;
            escritor.printf("%-20s%-10d%-10.2f%-10.2f\n", producto.getNombre(), (int)cantidad, precio, subtotal);
            total += subtotal;
        }
        escritor.println("------------------------------------------");
        escritor.printf("%-20s%-10s%-10.2f\n", "Total", "", total);
        double iva = total * 0.16;
        double totalFinal = total + iva;
        escritor.printf("%-20s%-10s%-10.2f\n", "IVA", "", iva);
        escritor.printf("%-20s%-10s%-10.2f\n", "Total final", "", totalFinal);
        escritor.close();
        archivo.close();
        System.out.println("Ticket de venta guardado en archivo: " + archivo);
    }
}