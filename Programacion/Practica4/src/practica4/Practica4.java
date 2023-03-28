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
 * date 2023-03-23
 */
public class Practica4 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int matriz_A[][], matriz_B[][], tamaño, opcion;
        int suma[][], resta[][], prod_punt[], multiplicacion[][],transpuesta_A[][], transpuesta_B[][], inversa_A[][], inversa_B[][];

        System.out.println("Calculadora de matrices cuadradas (orden nxn), inserte el tamaño de la matriz A y B (valor de n)");
        tamaño = entrada.nextInt();
        matriz_A = new int [tamaño][tamaño];
        matriz_B = new int [tamaño][tamaño];

        suma = new int [tamaño][tamaño];
        resta = new int [tamaño][tamaño];
        prod_punt = new int [tamaño];
        multiplicacion = new int [tamaño][tamaño];
        transpuesta_A = new int [tamaño][tamaño];
        transpuesta_B = new int [tamaño][tamaño];
        inversa_A = new int [3][3];
        inversa_B = new int [3][3];

        System.out.println("\ninserte los valores de la matriz A");
        for (int x=0; x<matriz_A.length; x++)
        {

            for (int y=0; y<matriz_A[x].length; y++)
            {
                System.out.println("\nrenglon: "+(x+1));
                System.out.println("columna: "+(y+1));
                System.out.println("digite un valor para la entrada");
                matriz_A[x][y]=entrada.nextInt();
            }
        }

        System.out.println("\ninserte los valores de la matriz B");
        for (int x=0; x<matriz_B.length; x++)
        {
            
            for (int y=0; y<matriz_B[x].length; y++)
            {
                System.out.println("\nrenglon: "+(x+1));
                System.out.println("columna: "+(y+1));
                System.out.println("digite un valor para la entrada");
                matriz_B[x][y]=entrada.nextInt();
            }
        }

        do {
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
            System.out.println("10. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

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
                case 10 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida");
            }

            System.out.println();
        } while (opcion != 10);
    }
}