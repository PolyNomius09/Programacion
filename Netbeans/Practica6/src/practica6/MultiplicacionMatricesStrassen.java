package practica6;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * MultiplicacionMatricesStrassen.java
 * Practica 6
 * @author Rafael Lopez Olvera
 * date 2023-05-28
 * EDD
 */
public class MultiplicacionMatricesStrassen {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario los números de la matriz A
        System.out.println("Ingrese los elementos de la matriz A:");
        int[][] matrixA = readMatrixElements(scanner);
        
        // Solicitar al usuario los números de la matriz B
        System.out.println("Ingrese los elementos de la matriz B:");
        int[][] matrixB = readMatrixElements(scanner);
        
        // Realizar la multiplicación de matrices
        int[][] result = multiplyMatrices(matrixA, matrixB);
        
        // Imprimir la matriz resultante
        System.out.println("Matriz resultante:");
        printMatrix(result);
    }
    
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result;
        
        if (matrixA.length == 1 && matrixB.length == 1) {
            // Caso base: Si las matrices son de tamaño 1x1, realiza la multiplicación directamente
            result = new int[1][1];
            result[0][0] = matrixA[0][0] * matrixB[0][0];
        } else {
            // Divide las matrices en submatrices de tamaño 1x1
            int n = matrixA.length;
            int halfSize = n / 2;
            
            int[][] a11 = divideMatrix(matrixA, 0, 0, halfSize);
            int[][] a12 = divideMatrix(matrixA, 0, halfSize, halfSize);
            int[][] a21 = divideMatrix(matrixA, halfSize, 0, halfSize);
            int[][] a22 = divideMatrix(matrixA, halfSize, halfSize, halfSize);
            
            int[][] b11 = divideMatrix(matrixB, 0, 0, halfSize);
            int[][] b12 = divideMatrix(matrixB, 0, halfSize, halfSize);
            int[][] b21 = divideMatrix(matrixB, halfSize, 0, halfSize);
            int[][] b22 = divideMatrix(matrixB, halfSize, halfSize, halfSize);
            
            // Calcula las siete multiplicaciones recursivas utilizando las submatrices
            int[][] p1 = multiplyMatrices(
                addMatrices(a11, a22),
                addMatrices(b11, b22)
            );
            
            int[][] p2 = multiplyMatrices(
                addMatrices(a21, a22),
                b11
            );
            
            int[][] p3 = multiplyMatrices(
                a11,
                subtractMatrices(b12, b22)
            );
            
            int[][] p4 = multiplyMatrices(
                a22,
                subtractMatrices(b21, b11)
            );
            
            int[][] p5 = multiplyMatrices(
                addMatrices(a11, a12),
                b22
            );
            
            int[][] p6 = multiplyMatrices(
                subtractMatrices(a21, a11),
                addMatrices(b11, b12)
            );
            
            int[][] p7 = multiplyMatrices(
                subtractMatrices(a12, a22),
                addMatrices(b21, b22)
            );
            
            // Combina las submatrices para obtener la matriz resultante
            int[][] c11 = addMatrices(
                subtractMatrices(addMatrices(p5, p4), p2),
                p6
            );
            
            int[][] c12 = addMatrices(p1, p2);
            
            int[][] c21 = addMatrices(p3, p4);
            
            int[][] c22 = subtractMatrices(
                subtractMatrices(addMatrices(p5, p1), p3),
                p7
            );
            
            // Une las submatrices en una matriz resultante
            result = joinMatrices(c11, c12, c21, c22);
        }
        
        return result;
    }
    
    public static int[][] divideMatrix(int[][] matrix, int startRow, int startCol, int size) {
        int[][] result = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix[startRow + i][startCol + j];
            }
        }
        
        return result;
    }
    
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int size = matrixA.length;
        int[][] result = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
        return result;
    }
    
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int size = matrixA.length;
        int[][] result = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        return result;
    }
    
    public static int[][] joinMatrices(int[][] matrix11, int[][] matrix12, int[][] matrix21, int[][] matrix22) {
        int size = matrix11.length;
        int[][] result = new int[size * 2][size * 2];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix11[i][j];
                result[i][j + size] = matrix12[i][j];
                result[i + size][j] = matrix21[i][j];
                result[i + size][j + size] = matrix22[i][j];
            }
        }
        
        return result;
    }
    
    public static int[][] readMatrixElements(Scanner scanner) {
        System.out.print("Ingrese el número de filas y columnas de la matriz: ");
        int size = scanner.nextInt();
        
        int[][] matrix = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        return matrix;
    }
    
    public static void printMatrix(int[][] matrix) {
        int size = matrix.length;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}