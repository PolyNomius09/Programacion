/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;
import java.util.Scanner;

/**
 * MultiplicacionMatricesTradicional.java
 * Practica 6
 * @author Rafael Lopez Olvera
 * date 2023-05-28
 * EDD
 */
public class MultiplicacionMatricesTradicional {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Multiplicacion de Matrices - Algoritmo Tradicional");
        
        System.out.print("Ingrese el tamaño de las matrices (n): ");
        int n = scanner.nextInt();
        
        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];
        
        System.out.println("Ingrese los elementos de la Matriz A:");
        readMatrixElements(scanner, matrixA);
        
        System.out.println("Ingrese los elementos de la Matriz B:");
        readMatrixElements(scanner, matrixB);
        
        System.out.println("Matriz A:");
        printMatrix(matrixA);
        
        System.out.println("Matriz B:");
        printMatrix(matrixB);
        
        int[][] result = multiplyMatrices(matrixA, matrixB);
        
        System.out.println("Resultado de la multiplicacion:");
        printMatrix(result);
        
        scanner.close();
    }
    
    /**
     * Realiza la multiplicación de dos matrices utilizando el algoritmo tradicional.
     * @param matrixA Matriz A.
     * @param matrixB Matriz B.
     * @return Matriz resultante de la multiplicación.
     */
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        return result;
    }
    
    /**
     * Lee los elementos de una matriz desde la entrada estándar.
     * @param scanner Objeto Scanner para leer la entrada.
     * @param matrix Matriz a llenar.
     */
    public static void readMatrixElements(Scanner scanner, int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    /**
     * Imprime una matriz en la consola.
     * @param matrix Matriz a imprimir.
     */
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}