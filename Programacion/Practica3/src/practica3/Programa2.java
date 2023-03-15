/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 * Main.java
 * Practica 3
 * @author Rafael Lopez Olvera
 * date 2023-03-12
 */
import java.util.Scanner;

public class Programa2 {
    public static void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        double a = input.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = input.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = input.nextDouble();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.printf("La ecuacion tiene dos raices: %.2f y %.2f\n", raiz1, raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("La ecuacion tiene una raiz: %.2f\n", raiz);
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}
