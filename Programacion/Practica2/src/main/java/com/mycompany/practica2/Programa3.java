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
public class Programa3 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una temperatura en grados Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double centigrados = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + centigrados + " grados Centigrados.");
    }
}

