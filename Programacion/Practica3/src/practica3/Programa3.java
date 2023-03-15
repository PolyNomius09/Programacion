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

public class Programa3 {
    public static void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero n para la sucesion de Fibonacci: ");
        int n = input.nextInt();

        System.out.print("Sucesion de Fibonacci con ciclo for: ");
        CicloFor(n);
        System.out.println();

        System.out.print("Sucesion de Fibonacci con ciclo while: ");
        CicloWhile(n);
        System.out.println();
    }

    public static void CicloFor(int n) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void CicloWhile(int n) {
        int a = 0;
        int b = 1;
        int c;
        int i = 1;

        while (i <= n) {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
