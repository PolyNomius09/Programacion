/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main.java
 * Practica 9
 * @author Rafael Lopez Olvera
 * date 2023-05-28
 * PROGRAMACION
 */
public class Practica9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-------- MENÚ --------");
            System.out.println("1. Calcular raíz cuadrada");
            System.out.println("2. Realizar división");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        Programa1.main(args);
                        break;
                    case 2:
                        Programa2.main(args);
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine(); // Limpia el buffer del scanner para evitar un bucle infinito
                opcion = 0;
            }
            System.out.println();
        } while (opcion != 3);
    }
}