/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;
import java.io.IOException;
import java.util.Scanner;
import CajaRegistradora.CajaRegistradora;

/**
 *
 * @author rafyt
 */
public class Iniciador {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CajaRegistradora cajaRegistradora = new CajaRegistradora();

        while (true) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();

                    Producto producto = new Producto(nombre, marca, precioUnitario, cantidadExistencia);
                    cajaRegistradora.agregarProducto(producto);
                    break;
                case 2:
                    cajaRegistradora.nuevaVenta();
                    break;
                case 3:
                    cajaRegistradora.mostrarInventario();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}