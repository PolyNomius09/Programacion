/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 * Main.java
 * Practica 3
 * @author Rafael Lopez Olvera
 * date 2023-03-12
 */
public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menu de programas:");
            System.out.println("1. Calculadora de Áreas y Perímetros");
            System.out.println("2. Cálculo de raíces reales de una función cuadrática");
            System.out.println("3. Sucesión de Fibonacci hasta el término n");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Serie armónica hasta el término n");
            System.out.println("6. Suma de los m primeros términos de la serie de Leibniz");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> Programa1.ejecutar();
                case 2 -> Programa2.ejecutar();
                case 3 -> Programa3.ejecutar();
                case 4 -> Programa4.ejecutar();
                case 5 -> Programa5.ejecutar();
                case 6 -> Programa6.ejecutar();
                case 7 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida");
            }

            System.out.println();
        } while (opcion != 7);
    }
}