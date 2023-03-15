/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.util.Scanner;
/**
 * Main.java
 * Practica 1
 * @author Rafael Lopez Olvera
 * date 2023-02-26
 */
public class Programa4 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud en metros: ");
        double metros = sc.nextDouble();
        double pulgadas = metros * 39.37;
        System.out.println(metros + " metros son equivalentes a " + pulgadas + " pulgadas");
    }
}
