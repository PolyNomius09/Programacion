/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author Rafa
 */
public class TranspuestaB {
    public static void ejecutar(int[][] matriz_B) {
        int[][] transpuesta_B = new int[matriz_B.length][matriz_B[0].length];

        for (int i = 0; i < matriz_B.length; i++) {
            for (int j = 0; j < matriz_B[0].length; j++) {
                transpuesta_B[j][i] = matriz_B[i][j];
            }
        }

        System.out.println("\nTranspuesta de la Matriz B:");
        for (int i = 0; i < transpuesta_B.length; i++) {
            System.out.print("|");
            for (int j = 0; j < transpuesta_B[0].length; j++) {
                System.out.print(transpuesta_B[i][j] + "\t");
            }
            System.out.println("|");
        }
    }
}