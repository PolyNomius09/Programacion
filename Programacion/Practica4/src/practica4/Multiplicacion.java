/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 * Multiplicacion.java
 * Practica 4
 * @author Rafael Lopez Olvera
 * date 2023-03-26
 */
public class Multiplicacion {
    public static void ejecutar(int[][] matriz_A, int[][] matriz_B) {
        int n = matriz_A.length;
        int[][] resultado = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += matriz_A[i][k] * matriz_B[k][j];
                }
            }
        }

        System.out.println("Resultado de la multiplicacion:");
        for (int x = 0; x < n; x++) {
            System.out.print("|");
            for (int y = 0; y < n; y++) {
                System.out.print(resultado[x][y]);
                if (y != n - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
}