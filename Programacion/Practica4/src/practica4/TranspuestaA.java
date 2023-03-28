/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author Rafa
 */
public class TranspuestaA {
    public static void ejecutar(int[][] matriz_A) {
        int[][] transpuesta_A = new int[matriz_A.length][matriz_A[0].length];

        for (int i = 0; i < matriz_A.length; i++) {
            for (int j = 0; j < matriz_A[0].length; j++) {
                transpuesta_A[j][i] = matriz_A[i][j];
            }
        }

        System.out.println("\nTranspuesta de la Matriz A:");
        for (int i = 0; i < transpuesta_A.length; i++) {
            System.out.print("|");
            for (int j = 0; j < transpuesta_A[0].length; j++) {
                System.out.print(transpuesta_A[i][j] + "\t");
            }
            System.out.println("|");
        }
    }
}