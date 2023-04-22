/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import java.util.Scanner;
/**
 * Main.java
 * Practica 4
 * @author Rafael Lopez Olvera
 * date 2023-03-26
 */
public class Practica4 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int n = 1, matriz_A[][]= new int[1][1], matriz_B[][]= new int[1][1], matriz_C[][]= new int[1][1], tamaño, opcion = -1;
        int res = 0;
        double cc[][] = new double[3][3];
        int suma[][], resta[][], prod_punt[], multiplicacion[][],transpuesta_A[][], transpuesta_B[][], inversa_A[][], inversa_B[][];

        do {
            System.out.println("Bienvenido a la calculadora de matrices");
            System.out.println("Menu de Operaciones:");
            System.out.println("1. Suma (matriz A y B)");
            System.out.println("2. Resta (matriz A y B)");
            System.out.println("3. Producto punto (Mutiplicacion del primer renglon de la matriz A con la primera columna de la matriz B)");
            System.out.println("4. Multiplicacion (matriz A y B)");
            System.out.println("5. Transpuesta de la Matriz A");
            System.out.println("6. Transpuesta de la Matriz B");
            System.out.println("7. Inversa de la matriz A (solo matrices 3*3)");
            System.out.println("8. Inversa de la matriz B (solo matrices 3*3)");
            System.out.println("9. Imprimir matrices A y B");
            System.out.println("10. Sistema 3 x 3");
            System.out.println("11. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            
            if(opcion != 9 && opcion != 10 && opcion != 11){
                System.out.println("Introduce la dimension de las matrices: ");
                n = entrada.nextInt();
                matriz_A = new int[n][n];
                matriz_B = new int[n][n];
                matriz_C = new int[n][n];
                
                leerArreglo(matriz_A, n);
                leerArreglo(matriz_B, n);
            }

            switch (opcion) {
                case 1 -> Suma.ejecutar(matriz_A, matriz_B);
                case 2 -> Resta.ejecutar(matriz_A, matriz_B);
                case 3 -> ProductoPunto.ejecutar(matriz_A, matriz_B);
                case 4 -> Multiplicacion.ejecutar(matriz_A, matriz_B);
                case 5 -> TranspuestaA.ejecutar(matriz_A);
                case 6 -> TranspuestaB.ejecutar(matriz_B);
                case 7 -> InversaA.ejecutar(matriz_A);
                case 8 -> InversaB.ejecutar(matriz_B);
                case 9 -> {
                    System.out.println("\nmatriz A:");
        for (int x=0; x < matriz_A.length; x++) 
                    {
                        System.out.print("|");
                        for (int y=0; y < matriz_A[x].length; y++) 
                        {
                            System.out.print (matriz_A[x][y]);
                            if (y != matriz_A[x].length-1) System.out.print("\t");
                        }
                        System.out.println("|");
                    }
        System.out.println("\nmatriz B:");
        for (int x=0; x < matriz_B.length; x++) 
                    {
                        System.out.print("|");
                        for (int y=0; y < matriz_B[x].length; y++) 
                        {
                            System.out.print (matriz_B[x][y]);
                            if (y != matriz_B[x].length-1) System.out.print("\t");
                        }
                        System.out.println("|");
                    }
                }
                case 10 -> {
                    matriz_A = new int[3][3];
                    matriz_B = new int[1][3];
                    leerArreglo(matriz_A, 3);
                    double rest[] = new double[3];
                    
                    for(int i = 0; i < 3; ++i){
                        matriz_B[0][i] = entrada.nextInt();
                    }
                    
                    int det = determinante(matriz_A);
                    
                    if(det == 0){
                        System.out.println("La matriz no tiene solucion.");
                    }else{
                        matriz_C = traspuesta(matriz_A);
                        matriz_C = adjunta(matriz_C);
                        double fact = 1.0 / (double) det;
                        for(int i = 0; i < 3; ++i){
                            for(int j = 0; j < 3; ++j){
                                cc[i][j] = (double)matriz_C[i][j] * fact;
                            }
                        }
                        rest[0] = matriz_B[0][0] * cc[0][0] + matriz_B[0][1] * cc[0][1] + matriz_B[0][2] * cc[0][2];
                        rest[1] = matriz_B[0][0] * cc[1][0] + matriz_B[0][1] * cc[1][1] + matriz_B[0][2] * cc[1][2];
                        rest[2] = matriz_B[0][0] * cc[2][0] + matriz_B[0][1] * cc[2][1] + matriz_B[0][2] * cc[2][2];
                        
                        for(int i = 0; i < 3; ++i){
                            System.out.println("X" + i + ": " + rest[i]);
                        }
                    }
                    
                    break;
                }
                case 11 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida");
            }

            System.out.println();
        } while (opcion != 11);
    }
    
    
    public static void leerArreglo(int r[][], int n){
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                System.out.println("Introducir el elemento " + i + " ," + j + ":");
                r[i][j] = in.nextInt();
            }
        }
    }
    
    /**
     * Funcion para obtener la adjunta dentro del Main.
     * @param m Matriz de entrada.
     * @return Matriz de salida
     */
    public static int[][] adjunta(int[][] m) {
        int[][] adj = new int[3][3];
        adj[0][0] = (+1) * ((m[1][1] * m[2][2]) - (m[2][1] * m[1][2]));
        adj[0][1] = (-1) * ((m[1][0] * m[2][2]) - (m[2][0] * m[1][2]));
        adj[0][2] = (+1) * ((m[1][0] * m[2][1]) - (m[2][0] * m[1][1]));
        adj[1][0] = (-1) * ((m[0][1] * m[2][2]) - (m[2][1] * m[0][2]));
        adj[1][1] = (+1) * ((m[0][0] * m[2][2]) - (m[2][0] * m[0][2]));
        adj[1][2] = (-1) * ((m[1][0] * m[2][1]) - (m[2][0] * m[0][1]));
        adj[2][0] = (+1) * ((m[0][1] * m[1][2]) - (m[1][1] * m[0][2]));
        adj[2][1] = (-1) * ((m[0][0] * m[1][2]) - (m[1][0] * m[0][2]));
        adj[2][2] = (+1) * ((m[0][0] * m[1][1]) - (m[1][0] * m[0][1]));

        return adj;
    }
    
    /**
     * Funcion para obtener el determinante dentro del Main.
     * 
     * @param m Matriz de entrada.
     * @return La determinante.
     */
    public static int determinante(int[][] m) {
        int det = 0;
        det = m[0][0] * m[1][1] * m[2][2] +
                m[1][0] * m[2][1] * m[0][2] +
                m[2][0] * m[0][1] * m[1][2] -
                m[2][0] * m[1][1] * m[0][2] -
                m[0][0] * m[2][1] * m[1][2] -
                m[1][0] * m[0][1] * m[2][2];
        return det;
    }
    
    /**
     * Funcion para obtener la traspuesta dentro del Main.
     * 
     * @param m Matriz de entrada.
     * @return La traspuesta.
     */
    public static int[][] traspuesta(int[][] m) {
        int[][] tras = new int[3][3];
        for (int i = 0; i < tras.length; i++) {
            for (int j = 0; j < tras[i].length; j++) {
                tras[j][i] = m[i][j];
            }
        }
        return tras;
    }
    
}