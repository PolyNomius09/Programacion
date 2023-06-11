/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenerarTicket;

import mascotasdomesticas.*;
import mascotasexoticas.*;
import mascota.mascota;
import BD.BaseDeDatos;
import inventario.Inventario;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * GenerarTicket.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public class GenerarTicket {
    private Inventario inventario;
    private BaseDeDatos baseDeDatos;

    public GenerarTicket() {
        this.inventario = inventario;
        this.baseDeDatos = baseDeDatos;
    }

    public void generarTicketVenta(Ventas venta) {
        String nombreArchivo = obtenerNombreArchivo();
        String rutaArchivo = "ticketsGEN/" + nombreArchivo;

        try {
            File carpetaTickets = new File("ticketsGEN");
            if (!carpetaTickets.exists()) {
                carpetaTickets.mkdir();
            }

            FileWriter archivo = new FileWriter(rutaArchivo);
            archivo.write(obtenerContenidoTicket(venta));
            archivo.close();

            System.out.println("Se ha generado el ticket de venta exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el ticket de venta: " + e.getMessage());
        }
    }

    private String obtenerNombreArchivo() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return "Ticket_" + fechaHoraActual.format(formatoFechaHora) + ".txt";
    }

    private String obtenerContenidoTicket(Ventas venta) {
        // Aquí puedes construir el contenido del ticket utilizando los datos de la venta y otros detalles necesarios
        // Puedes personalizar el formato del ticket según tus necesidades
        StringBuilder contenido = new StringBuilder();
        contenido.append("Ticket de Venta\n");
        contenido.append("================\n");
        contenido.append("Fecha: ").append(venta.getFecha()).append("\n");
        contenido.append("Hora: ").append(venta.getHora()).append("\n");
        contenido.append("Artículo: ").append(venta.getArticulo()).append("\n");
        contenido.append("Cantidad: ").append(venta.getCantidad()).append("\n");
        contenido.append("Total: ").append(venta.getTotal()).append("\n");
        return contenido.toString();
    }
}