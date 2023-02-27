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

/**
 * Main.java
 * Practica 1
 * @author Rafael Lopez Olvera
 * date 2023-02-26
 */

class Telefono {
    private final int memoriaRam;
    private final String marcaProcesador;
    private final int almacenamiento;
    private final int capacidadBateria;
    private final double tamanoPantalla;
    private final String marca;
    private final String modelo;
    private final double precio;
  
    public Telefono(int memoriaRam, String marcaProcesador, int almacenamiento, int capacidadBateria,
        double tamanoPantalla, String marca, String modelo, double precio) {
      this.memoriaRam = memoriaRam;
      this.marcaProcesador = marcaProcesador;
      this.almacenamiento = almacenamiento;
      this.capacidadBateria = capacidadBateria;
      this.tamanoPantalla = tamanoPantalla;
      this.marca = marca;
      this.modelo = modelo;
      this.precio = precio;
    }
  
    public int getMemoriaRam() {
      return memoriaRam;
    }
  
    public String getMarcaProcesador() {
      return marcaProcesador;
    }
  
    public int getAlmacenamiento() {
      return almacenamiento;
    }
  
    public int getCapacidadBateria() {
      return capacidadBateria;
    }
  
    public double getTamanoPantalla() {
      return tamanoPantalla;
    }
  
    public String getMarca() {
      return marca;
    }
  
    public String getModelo() {
      return modelo;
    }
  
    public double getPrecio() {
      return precio;
    }
  
    public void hacerLlamada() {
    System.out.println("Haciendo llamada desde "  + modelo + "...");
  }

  public void enviarMensaje() {
    System.out.println("Enviando mensaje desde " + modelo + "...");
  }

  public void instalarAplicacion() {
    System.out.println("Instalando aplicación en " + modelo + "...");
  }

  public void abrirAplicacion() {
    System.out.println("Abriendo aplicación en " + modelo + "...");
  }

  @Override
  public String toString() {
    return marca + " " + modelo + " - $" + precio;
  }
}