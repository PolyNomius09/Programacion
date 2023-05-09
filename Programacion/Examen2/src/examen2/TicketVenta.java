/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rafyt
 */
public class TicketVenta {
    private ArrayList<Producto> productosVendidos;
    private double totalVenta;
    private double iva;
    private double totalFinal;
    private Date fechaVenta;
    private String nombreTienda;
    private String nombreCajero;

    public TicketVenta(ArrayList<Producto> productosVendidos, double totalVenta, double iva, double totalFinal,
                       String nombreTienda, String nombreCajero) {
        this.productosVendidos = productosVendidos;
        this.totalVenta = totalVenta;
        this.iva = iva;
        this.totalFinal = totalFinal;
        this.fechaVenta = new Date();
        this.nombreTienda = nombreTienda;
        this.nombreCajero = nombreCajero;
    }

    public void imprimirTicket() {
        SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
        String nombreArchivo = "ticket_" + sdfFecha.format(fechaVenta) + "_" + sdfHora.format(fechaVenta) + ".txt";

        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            PrintWriter pw = new PrintWriter(archivo);

            pw.println("********** " + nombreTienda + " **********");
            pw.println("Fecha: " + sdfFecha.format(fechaVenta) + " Hora: " + sdfHora.format(fechaVenta));
            pw.println("Cajero: " + nombreCajero);
            pw.println("");
            pw.println("Producto        Cantidad      Precio      Total");
            pw.println("-------------------------------------------------");

            for (Producto producto : productosVendidos) {
                pw.printf("%-15s %-13d %-11.2f %-9.2f\n", producto.getNombre(), producto.getCantidadVendida(),
                        producto.getPrecioUnitario(), producto.getTotalVendido());
            }

            pw.println("-------------------------------------------------");
            pw.printf("%35s: %.2f\n", "Total Venta", totalVenta);
            pw.printf("%35s: %.2f\n", "IVA (16%)", iva);
            pw.printf("%35s: %.2f\n", "Total Final", totalFinal);

            archivo.close();
        } catch (IOException e) {
            System.out.println("Error al crear el archivo del ticket de venta: " + e.getMessage());
        }
    }
    public void guardarTicketEnArchivo() {
        String nombreArchivo = "ticket_" + fechaHora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss")) + ".txt";

        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            archivo.write("Fecha y hora: " + fechaHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
            archivo.write("Nombre del producto: " + nombreProducto + "\n");
            archivo.write("Cantidad: " + cantidad + "\n");
            archivo.write("Precio unitario: $" + precioUnitario + "\n");
            archivo.write("Total de la venta: $" + totalVenta + "\n");
            archivo.close();
            System.out.println("Ticket de venta generado exitosamente en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al generar el ticket de venta.");
            e.printStackTrace();
        }
    }
}