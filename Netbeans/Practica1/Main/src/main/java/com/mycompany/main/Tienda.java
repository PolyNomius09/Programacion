/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

* Coloco referencias de como funciona la libreria Scanner porque tiene desde 3er semestre de preparatoria que no programo
* en Java, y no recordaba para que funcionaban unas cosas, perdon :'c

//referencias: sc.nextLine http://puntocomnoesunlenguaje.blogspot.com/2012/08/java-scanner.html
//referencias: https://www.delftstack.com/es/howto/java/java-next-and-nextline/
//referencias: https://www.geeksforgeeks.org/string-tostring-method-in-java/
//referencias: https://ifgeekthen.nttdata.com/es/que-es-y-como-usar-la-clase-scanner-en-java
//referencias: Use como referencias, codigos de c/c++ de clases pasadas, se deja el repositorio.
//Repositorio: https://github.com/PolyNomius09/ProyectosDeClase.git

 */
package com.mycompany.main;

import java.util.Scanner;

/**
 * Main.java
 * Practica 1
 * @author Rafael Lopez Olvera
 * date 2023-02-26
 */

class Tienda {
    private Telefono[] inventario;
    private String nombre;
    private int cantidadTelefonos;
  
    public Tienda(String nombre) {
      this.inventario = new Telefono[100];
      this.nombre = nombre;
      this.cantidadTelefonos = 0;
    }
  
    public void agregarTelefono() {
      if (cantidadTelefonos == 100) {
        System.out.println("El inventario está lleno, no se puede agregar más teléfonos.");
        return;
      }
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese los datos del teléfono:");
      System.out.print("Memoria RAM (GB): ");
      int memoriaRam = sc.nextInt();
      
      sc.nextLine(); // Limpiar el buffer del Scanner
      System.out.print("Marca de procesador: ");
      String marcaProcesador = sc.nextLine();
      
      System.out.print("Almacenamiento (GB): ");
      int almacenamiento = sc.nextInt();
      
      System.out.print("Capacidad de batería (mAh): ");
      int capacidadBateria = sc.nextInt();
      
      System.out.print("Tamaño de pantalla (pulgadas): ");
      double tamanoPantalla = sc.nextDouble();
      
      sc.nextLine(); // Limpiar el buffer del Scanner
      System.out.print("Marca: ");
      String marca = sc.nextLine();
      System.out.print("Modelo: ");
      String modelo = sc.nextLine();
      System.out.print("Precio: ");
      double precio = sc.nextDouble();
      Telefono telefono = new Telefono(memoriaRam, marcaProcesador, almacenamiento, capacidadBateria, tamanoPantalla,
          marca, modelo, precio);
      inventario[cantidadTelefonos] = telefono;
      cantidadTelefonos++;
      System.out.println("Teléfono agregado con éxito.");
    }
  
    public void listarTelefonos() {
      System.out.println("Inventario de " + nombre + ":");
    for (int i = 0; i < cantidadTelefonos; i++) {
      System.out.println((i + 1) + ". " + inventario[i].getMarca() + " " + inventario[i].getModelo());
    }

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el número del teléfono para ver las opciones de acción (0 para salir): ");
    int opcion = sc.nextInt();

    while (opcion != 0) {
      if (opcion >= 1 && opcion <= cantidadTelefonos) {
        Telefono telefono = inventario[opcion - 1];

        System.out.println("Opciones de " + telefono.getMarca() + " " + telefono.getModelo() + ":");
        System.out.println("1. Hacer llamada");
        System.out.println("2. Enviar mensaje");
        System.out.println("3. Instalar aplicación");
        System.out.println("4. Abrir aplicación");
        System.out.println("5. Vender teléfono");

        System.out.println("Ingrese el número de la opción deseada (0 para salir): ");
        int accion = sc.nextInt();

        switch (accion) {
          case 1 -> telefono.hacerLlamada();
          case 2 -> telefono.enviarMensaje();
          case 3 -> telefono.instalarAplicacion();
          case 4 -> telefono.abrirAplicacion();
          case 5 -> venderTelefono(opcion);
          case 0 -> {
              }
          default -> System.out.println("Opción no válida.");
        }
      } else {
        System.out.println("No se puede realizar la acción. El índice no es válido.");
      }

      System.out.println("Ingrese el número del teléfono para ver las opciones de acción (0 para salir): ");
      opcion = sc.nextInt();
    }
  }
  
    public void venderTelefono(int opcion) {
      if (cantidadTelefonos == 0) {
        System.out.println("No hay teléfonos en el inventario.");
        return;
      }
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el número del teléfono que desea vender:");
      int numeroTelefono = sc.nextInt();
      if (numeroTelefono < 1 || numeroTelefono > cantidadTelefonos) {
        System.out.println("El número de teléfono ingresado no es válido.");
        return;
      }
      Telefono telefonoVendido = inventario[numeroTelefono - 1];
      for (int i = numeroTelefono - 1; i < cantidadTelefonos - 1; i++) {
        inventario[i] = inventario[i + 1];
      }
      inventario[cantidadTelefonos - 1] = null;
      cantidadTelefonos--;
      System.out.println("Teléfono vendido con éxito: " + telefonoVendido);
    }
  public void hacerLlamada() {
    if (cantidadTelefonos >= 1 && cantidadTelefonos <= cantidadTelefonos) {
      Telefono telefono = inventario[cantidadTelefonos - 1];
      telefono.hacerLlamada();
    } else {
      System.out.println("No se puede hacer la llamada. El índice no es válido.");
    }
  }

  public void enviarMensaje() {
    if (cantidadTelefonos >= 1 && cantidadTelefonos <= cantidadTelefonos) {
      Telefono telefono = inventario[cantidadTelefonos - 1];
      telefono.enviarMensaje();
    } else {
      System.out.println("No se puede enviar el mensaje. El índice no es válido.");
    }
  }

  public void instalarAplicacion() {
    if (cantidadTelefonos >= 1 && cantidadTelefonos <= cantidadTelefonos) {
      Telefono telefono = inventario[cantidadTelefonos - 1];
      telefono.instalarAplicacion();
    } else {
      System.out.println("No se puede instalar la aplicación. El índice no es válido.");
    }
  }

  public void abrirAplicacion() {
    if (cantidadTelefonos >= 1 && cantidadTelefonos <= cantidadTelefonos) {
      Telefono telefono = inventario[cantidadTelefonos - 1];
      telefono.abrirAplicacion();
    } else {
      System.out.println("No se puede abrir la aplicación. El índice no es válido.");
    }
  }
}
