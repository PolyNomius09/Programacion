/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 * MergeSort.java
 * Practica 5
 * @author Rafael Lopez Olvera
 * date 2023-05-16
 * EDD
 */

//Algoritmo de Ordenamiento MergeSort
public class MergeSort {
    
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        
        if (n < 2) {
            return;
        }
        
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        
        // Dividir el arreglo en dos partes
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        
        mergeSort(left); // Ordenar recursivamente la parte izquierda
        mergeSort(right); // Ordenar recursivamente la parte derecha
        
        merge(left, right, arr); // Combinar las dos partes ordenadas
    }
    
    public static void merge(int[] left, int[] right, int[] arr) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        
        // Comparar y combinar los elementos de las dos partes en orden
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // Copiar los elementos restantes de la parte izquierda
        while (i < nL) {
            arr[k++] = left[i++];
        }
        
        // Copiar los elementos restantes de la parte derecha
        while (j < nR) {
            arr[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Arreglo original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        mergeSort(arr);
        
        System.out.println("\nArreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}