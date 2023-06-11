package practica8;

import java.util.Scanner;
import BD.BaseDeDatos;
import GenerarTicket.GenerarTicket;
import GenerarTicket.Ventas;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Main.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public class Main {

    private static Ventas Ventas;
    public static void main(String args[]){
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        BaseDeDatos datosCargados = baseDeDatos.cargarDatos();
        GenerarTicket generador = new GenerarTicket();      
        Scanner in = new Scanner(System.in);
        int opc = -1;
        // Crear instancia de la clase Venta
        LocalDate fechaVenta = LocalDate.now();
        LocalTime horaVenta = LocalTime.now();
        String articulo = "Producto 1";
        int cantidad = 2;
        double total = 100.0;
        Ventas venta = new Ventas();

        // Generar y guardar el ticket de compra
        generador.generarTicketVenta(venta);
       
        while(opc != 10){
            System.out.println("Bienvenido a Mascotas el Driver");
            System.out.println("1.- Reabastecer tienda");
            System.out.println("2.- Vender Gato");
            System.out.println("3.- Vender Perro");
            System.out.println("4.- Vender Brontosaurio");
            System.out.println("5.- Vender Raptor");
            System.out.println("6.- Vender Trex");
            System.out.println("7.- Vender Tigre");
            System.out.println("8.- Vender Vibora");
            System.out.println("9.- Ver historial de ventas");
            System.out.println("10.- Salir");
            System.out.println("Eleccion:");
            opc = in.nextInt();
            in.nextLine();
            
            switch(opc){
                case 1:
                    venta.abastecer();
                    break;
                case 2:
                    venta.venderGato();
                    break;
                case 3:
                    venta.venderPerro();
                    break;
                case 4:
                    venta.venderBrontosaurio();
                    break;
                case 5:
                    venta.venderRaptor();
                    break;
                case 6:
                    venta.venderTRex();
                    break;
                case 7:
                    venta.venderTigre();
                    break;
                case 8:
                    venta.venderViboras();
                    break;
                case 9:
                    venta.imprimirVentas();
                    break;
                case 10:
                    System.out.println("Adios");
                    break;  
                default:
                    System.out.println("Opcion invalida");
            }
        }
    if (datosCargados != null) {
            baseDeDatos = datosCargados;
        }
        baseDeDatos.guardarDatos();
    }
}
