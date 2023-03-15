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

public class Programa4 {
    public static void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = input.nextInt();

        System.out.println("El factorial de " + n + " es " + calcularFactorial(n));
    }

    public static int calcularFactorial(int n) {
        int factorialFor = 1;
        int factorialWhile = 1;

        for (int i = 1; i <= n; i++) {
            factorialFor *= i;
        }

        int i = 1;
        while (i <= n) {
            factorialWhile *= i;
            i++;
        }

        System.out.println("Factorial con ciclo for: " + factorialFor);
        System.out.println("Factorial con ciclo while: " + factorialWhile);

        return factorialFor;
    }
}