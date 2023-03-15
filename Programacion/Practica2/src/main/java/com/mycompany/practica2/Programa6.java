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
public class Programa6 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero de 6 dígitos: ");
        int num = sc.nextInt();
        int digito1 = num / 100000;
        int digito2 = (num / 10000) % 10;
        int digito3 = (num / 1000) % 10;
        int digito4 = (num / 100) % 10;
        int digito5 = (num / 10) % 10;
        int digito6 = num % 10;
        System.out.println("Digito 1: " + digito1);
        System.out.println("Digito 2: " + digito2);
        System.out.println("Digito 3: " + digito3);
        System.out.println("Digito 4: " + digito4);
        System.out.println("Digito 5: " + digito5);
        System.out.println("Digito 6: " + digito6);
    }
}