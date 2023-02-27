/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 * Main.java
 * Practica 1
 * @author Rafael Lopez Olvera
 * date 2023-02-26
 */

public class Main {
  public static void main(String[] args) {
    Tienda tienda = new Tienda("La Donita"); //era con ñ pero no la reconoce, es "La Doñita"
    Scanner sc = new Scanner(System.in);
    int opcion;
    do {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Agregar teléfono");
      System.out.println("2. Listar teléfonos");
      System.out.println("3. Vender teléfono");
      System.out.println("4. Salir");
      opcion = sc.nextInt();
      switch (opcion) {
        case 1 -> tienda.agregarTelefono();
        case 2 -> tienda.listarTelefonos();
        case 3 -> tienda.venderTelefono(opcion);
        case 4 -> System.out.println("Adiós.");
        default -> System.out.println("Opción no válida.");
      }
    } while (opcion != 4);
  }
}