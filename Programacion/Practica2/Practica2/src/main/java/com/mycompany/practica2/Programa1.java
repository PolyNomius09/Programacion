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
public class Programa1 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        if ((numero & 1) == 0) {
            System.out.println(numero + " es un número par");
        } else {
            System.out.println(numero + " es un número impar");
        }
    }
}