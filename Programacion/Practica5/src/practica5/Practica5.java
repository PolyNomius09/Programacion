/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;

/**
 *
 * @author Rafa
 */
import java.util.Scanner;

public class Practica5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menu de programas:");
            System.out.println("1. Datos de 3 personas");
            System.out.println("2. Crear Lista de Alumnos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> Programa1.ejecutar();
                case 2 -> Programa2.ejecutar();
                case 3 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida");
            }

            System.out.println();
        } while (opcion != 3);
    }
}