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

public class Programa5 {
    public static void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = input.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
            System.out.printf("Termino %d: %.3f\n", i, 1.0 / i);
        }

        System.out.printf("Suma: %.3f\n", suma);
    }
}
