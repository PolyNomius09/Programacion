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

public class Programa6 {
    public static void ejecutar() {
        int[] mValues = { 10, 500, 1000 };

        for (int m : mValues) {
            double sum = 0.0;
            for (int n = 0; n < m; n++) {
                sum += Math.pow(-1, n) / (2.0 * n + 1.0);
            }
            double piOver4 = Math.PI / 4.0;
            System.out.printf("m = %d, suma = %.10f, error = %.10f\n", m, sum, Math.abs(piOver4 - sum));
        }
    }
}
