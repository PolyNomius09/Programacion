/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 * Suma.java
 * Practica 4
 * @author Rafael Lopez Olvera
 * date 2023-03-26
 */
public class Suma {
    public static void ejecutar(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] suma = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("\nResultado de la suma:");
        imprimirMatriz(suma);
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("|");
        }
    }
}
