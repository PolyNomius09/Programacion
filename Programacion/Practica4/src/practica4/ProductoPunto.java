/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 * ProductoPunto.java
 * Practica 4
 * @author Rafael Lopez Olvera
 * date 2023-03-26
 */
public class ProductoPunto {
    public static void ejecutar(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[] primeraColumnaB = new int[n];
        for (int i = 0; i < n; i++) {
            primeraColumnaB[i] = matrizB[i][0];
        }
        int productoPunto = 0;
        for (int i = 0; i < n; i++) {
            productoPunto += matrizA[0][i] * primeraColumnaB[i];
        }
        System.out.println("\nResultado del producto punto: " + productoPunto);
    }
}