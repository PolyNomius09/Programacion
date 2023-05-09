/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rafyt
 */
public class BaseDatos {
    private ArrayList<Producto> productos;
    private ArrayList<TicketVenta> ventas;
    
    public BaseDatos() {
        this.productos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public Producto buscarProducto(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }
    
    public void registrarVenta(CajaRegistradora caja) {
        TicketVenta ticket = caja.finalizarVenta();
        ventas.add(ticket);
        imprimirTicket(ticket);
    }
    
    private void imprimirTicket(TicketVenta ticket) {
        Date fecha = ticket.getFecha();
        String nombreArchivo = "ticket_" + fecha.toString() + ".txt";
        
        // Código para escribir el ticket en el archivo de texto plano
        // ...
    }
}