/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;
import java.util.Scanner;

/**
 * MultiplicacionMatricesRecursiva.java
 * Practica 6
 * @author Rafael Lopez Olvera
 * date 2023-05-28
 * EDD
 */
public class MultiplicacionMatricesRecursiva {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Multiplicacion de Matrices - Algoritmo Recursivo");
        
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
     * Realiza la multiplicación de dos matrices de manera recursiva.
     * @param matrixA Matriz A.
     * @param matrixB Matriz B.
     * @return Matriz resultante de la multiplicación.
     */
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] result = new int[n][n];
        
        // Caso base: Si las matrices son de tamaño 1x1, realiza la multiplicación directamente
        if (n == 1) {
            result[0][0] = matrixA[0][0] * matrixB[0][0];
        } else {
            // Divide las matrices en submatrices de tamaño 1x1
            int[][] a11 = divideMatrix(matrixA, 0, 0);
            int[][] a12 = divideMatrix(matrixA, 0, 1);
            int[][] a21 = divideMatrix(matrixA, 1, 0);
            int[][] a22 = divideMatrix(matrixA, 1, 1);
            int[][] b11 = divideMatrix(matrixB, 0, 0);
            int[][] b12 = divideMatrix(matrixB, 0, 1);
            int[][] b21 = divideMatrix(matrixB, 1, 0);
            int[][] b22 = divideMatrix(matrixB, 1, 1);
            
            // Calcula las siete multiplicaciones recursivas utilizando las submatrices
            int[][] p1 = multiplyMatrices(a11, subtractMatrices(b12, b22));
            int[][] p2 = multiplyMatrices(addMatrices(a11, a12), b22);
            int[][] p3 = multiplyMatrices(addMatrices(a21, a22), b11);
            int[][] p4 = multiplyMatrices(a22, subtractMatrices(b21, b11));
            int[][] p5 = multiplyMatrices(addMatrices(a11, a22), addMatrices(b11, b22));
            int[][] p6 = multiplyMatrices(subtractMatrices(a12, a22), addMatrices(b21, b22));
            int[][] p7 = multiplyMatrices(subtractMatrices(a11, a21), addMatrices(b11, b12));
            
            // Combina las submatrices para obtener la matriz resultante
            int[][] c11 = addMatrices(subtractMatrices(addMatrices(p5, p4), p2), p6);
            int[][] c12 = addMatrices(p1, p2);
            int[][] c21 = addMatrices(p3, p4);
            int[][] c22 = subtractMatrices(subtractMatrices(addMatrices(p5, p1), p3), p7);
            
            result = joinMatrices(c11, c12, c21, c22);
        }
        
        return result;
    }
    
    /**
     * Divide una matriz en una submatriz de tamaño 1x1.
     * @param matrix Matriz original.
     * @param startRow Índice de la fila de inicio.
     * @param startCol Índice de la columna de inicio.
     * @return Submatriz de tamaño 1x1.
     */
    public static int[][] divideMatrix(int[][] matrix, int startRow, int startCol) {
        int[][] result = new int[1][1];
        result[0][0] = matrix[startRow][startCol];
        return result;
    }
    
    /**
     * Resta dos matrices.
     * @param matrixA Matriz A.
     * @param matrixB Matriz B.
     * @return Resultado de la resta de las matrices.
     */
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
        return result;
    }
    
    /**
     * Suma dos matrices.
     * @param matrixA Matriz A.
     * @param matrixB Matriz B.
     * @return Resultado de la suma de las matrices.
     */
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        return result;
    }
    
    /**
     * Combina las submatrices en una matriz resultante.
     * @param matrix11 Submatriz 11.
     * @param matrix12 Submatriz 12.
     * @param matrix21 Submatriz 21.
     * @param matrix22 Submatriz 22.
     * @return Matriz resultante.
     */
    public static int[][] joinMatrices(int[][] matrix11, int[][] matrix12, int[][] matrix21, int[][] matrix22) {
        int n = matrix11.length;
        int[][] result = new int[n * 2][n * 2];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix11[i][j];
                result[i][j + n] = matrix12[i][j];
                result[i + n][j] = matrix21[i][j];
                result[i + n][j + n] = matrix22[i][j];
            }
        }
        
        return result;
    }
    
    /**
     * Lee los elementos de una matriz desde la entrada estándar.
     * @param scanner Objeto Scanner para leer la entrada.
     * @param matrix Matriz en la que se almacenarán los elementos.
     */
    public static void readMatrixElements(Scanner scanner, int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
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