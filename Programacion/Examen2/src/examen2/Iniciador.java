/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;
import java.io.IOException;
import java.util.Scanner;
import CajaRegistradora.CajaRegistradora;
import BD.BaseDatos;
import Productos.Producto;
import java.util.ArrayList;

/**
 *
 * @author rafyt
 */
public class Iniciador {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    CajaRegistradora cajaRegistradora = new CajaRegistradora();

    // Solicitar nombres de tienda y cajero
    System.out.print("Ingrese el nombre de la tienda: ");
    String nombreTienda = scanner.nextLine();
    cajaRegistradora.registrarNombreTienda(nombreTienda);

    System.out.print("Ingrese el nombre del cajero: ");
    String nombreCajero = scanner.nextLine();
    cajaRegistradora.registrarNombreCajero(nombreCajero);

    // Menú principal
    while (true) {
        System.out.println("---------- MENÚ PRINCIPAL ----------");
        System.out.println("1. Agregar producto");
        System.out.println("2. Actualizar producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar inventario");
        System.out.println("5. Nueva venta");
        System.out.println("6. Salir");

        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                // Agregar producto
                System.out.println("AGREGAR PRODUCTO");
                System.out.print("Ingrese el nombre del producto: ");
                String nombreProducto = scanner.nextLine();
    
                System.out.print("Ingrese la marca del producto: ");
                String marcaProducto = scanner.nextLine();
    
                System.out.print("Ingrese la cantidad existente del producto: ");
                double cantidadExistencia = scanner.nextInt();
    
                System.out.print("Ingrese el precio unitario del producto: ");
                int precioUnitario = (int) scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                 // Crear el producto y agregarlo al inventario de la caja registradora
                Producto producto = new Producto(nombreProducto, marcaProducto, cantidadExistencia, precioUnitario);
                cajaRegistradora.agregarProducto(producto);
                System.out.println("Producto agregado correctamente.");
                break;

            case 2:
                // Actualizar producto
                System.out.println("ACTUALIZAR PRODUCTO");
                System.out.print("Ingrese el número de producto que desea actualizar: ");
                int indiceProducto = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                System.out.print("Ingrese el nuevo nombre del producto: ");
                nombreProducto = scanner.nextLine();

                System.out.print("Ingrese la nueva marca del producto: ");
                marcaProducto = scanner.nextLine();

                System.out.print("Ingrese el nuevo precio unitario del producto: ");
                precioUnitario = (int) scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                System.out.print("Ingrese la nueva cantidad de existencia del producto: ");
                cantidadExistencia = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                producto = new Producto(nombreProducto, marcaProducto, cantidadExistencia, precioUnitario);
                cajaRegistradora.actualizarProducto(indiceProducto - 1, producto);
                System.out.println("Producto actualizado correctamente.");
                break;
                case 3:
                // Eliminar producto
                System.out.println("ELIMINAR PRODUCTO");
                System.out.print("Ingrese el número de producto que desea eliminar: ");
                indiceProducto = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                cajaRegistradora.eliminarProducto(indiceProducto - 1);
                System.out.println("Producto eliminado exitosamente.");
                break;
                case 4:
                // Mostrar inventario
                cajaRegistradora.mostrarInventario();
                break;
                case 5:
                // Nueva Venta
                cajaRegistradora.nuevaVenta();
                break;
                case 6:
                // Salir
                cajaRegistradora.salir();
                break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}