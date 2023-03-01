/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.util.Scanner;
/**
 *
 * @author rafyt
 */
public class Programa2 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados Centigrados: ");
        double centigrados = sc.nextDouble();
        double fahrenheit = (centigrados * 9 / 5) + 32;
        System.out.println(centigrados + " grados Centigrados son equivalentes a " + fahrenheit + " grados Fahrenheit");
    }
}