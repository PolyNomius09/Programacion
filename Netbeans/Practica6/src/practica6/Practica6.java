/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;
import java.util.Scanner;

/**
 * Main.java
 * Practica 6
 * @author Rafael Lopez Olvera
 * date 2023-05-28
 * EDD
 */
public class Practica6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Multiplicacion de Matrices con metodo Tradicional");
            System.out.println("2. Multiplicacion de Matrices con metodo Recursivo");
            System.out.println("3. Multiplicacion de Matrices con metodo de Strassen");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    MultiplicacionMatricesTradicional.main();
                    break;
                case 2:
                    MultiplicacionMatricesRecursiva.main();
                    break;
                case 3:
                    MultiplicacionMatricesStrassen.main();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Introduce una opcion valida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}