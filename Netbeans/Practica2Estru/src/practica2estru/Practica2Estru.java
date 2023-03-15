/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2estru;

import java.util.Random;
import java.util.Scanner;
/**
 * Main.java
 * Practica 2
 * @author Rafael Lopez Olvera
 * date 2023-03-12
 */

public class Practica2Estru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menu de programas:");
            System.out.println("1. Lista Doblemente Enlazada Circular");
            System.out.println("2. Pila");
            System.out.println("3. Colas");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> ListaDobleCircular.ejecutar();
                case 2 -> Pila.ejecutar();
                case 3 -> Cola.ejecutar();
                case 4 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida");
            }

            System.out.println();
        } while (opcion != 4);
    }
}
