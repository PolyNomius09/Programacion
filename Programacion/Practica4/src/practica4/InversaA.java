/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 * InversaA.java
 * Practica 4
 * @author Rafael Lopez Olvera
 * date 2023-03-26
 */
public class InversaA {
    public static void ejecutar(int[][] matrizA) {
        if (matrizA.length != 3 || matrizA[0].length != 3) {
            System.out.println("Error: la matriz A debe ser de 3x3 para calcular su inversa");
            return;
        }

        int det = calcularDeterminante(matrizA);
        if (det == 0) {
            System.out.println("Error: la matriz A no tiene inversa porque su determinante es cero");
            return;
        }

        int[][] adjunta = calcularAdjunta(matrizA);
        int[][] inversa = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inversa[i][j] = adjunta[i][j] / det;
            }
        }

        System.out.println("Inversa de la matriz A:");
        imprimirMatriz(inversa);
    }

    private static int calcularDeterminante(int[][] matriz) {
        int det = 0;
        for (int i = 0; i < 3; i++) {
            det += matriz[0][i] * (matriz[1][(i+1)%3]*matriz[2][(i+2)%3] - matriz[1][(i+2)%3]*matriz[2][(i+1)%3]);
        }
        return det;
    }

    private static int[][] calcularAdjunta(int[][] matriz) {
        int[][] adjunta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int signo = ((i+j) % 2 == 0) ? 1 : -1;
                adjunta[i][j] = signo * calcularMenor(matriz, i, j);
            }
        }
        return adjunta;
    }

    private static int calcularMenor(int[][] matriz, int fila, int columna) {
        int[][] submatriz = new int[2][2];
        int filaSubmatriz = 0;
        for (int i = 0; i < 3; i++) {
            if (i == fila) continue;
            int columnaSubmatriz = 0;
            for (int j = 0; j < 3; j++) {
                if (j == columna) continue;
                submatriz[filaSubmatriz][columnaSubmatriz] = matriz[i][j];
                columnaSubmatriz++;
            }
            filaSubmatriz++;
        }
        return submatriz[0][0]*submatriz[1][1] - submatriz[0][1]*submatriz[1][0];
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}
