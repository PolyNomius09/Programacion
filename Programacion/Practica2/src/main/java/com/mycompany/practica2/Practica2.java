/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

import java.util.Scanner;
/**
 * Main.java
 * Practica 1
 * @author Rafael Lopez Olvera
 * date 2023-02-26
 */
public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE PROGRAMAS ---");
            System.out.println("1. Verificar si un número es par o impar");
            System.out.println("2. Convertir de grados Centigrados a grados Fahrenheit");
            System.out.println("3. Convertir de grados Fahrenheit a grados Centigrados");
            System.out.println("4. Convertir de metros a pulgadas");
            System.out.println("5. Realizar operaciones con dos números");
            System.out.println("6. Imprimir los dígitos de un número de 6 dígitos");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Programa1.ejecutar();
                    break;
                case 2:
                    Programa2.ejecutar();
                    break;
                case 3:
                    Programa3.ejecutar();
                    break;
                case 4:
                    Programa4.ejecutar();
                    break;
                case 5:
                    Programa5.ejecutar();
                    break;
                case 6:
                    Programa6.ejecutar();
                    break;
                case 7:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 7);
        sc.close();
    }
}