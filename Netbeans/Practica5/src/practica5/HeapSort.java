/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 * HeapSort.java
 * Practica 5
 * @author Rafael Lopez Olvera
 * date 2023-05-16
 * EDD
 */

//Algoritmo de Ordenamiento HeapSort
public class HeapSort {
    
    public static void heapSort(int[] arr) {
        int n = arr.length;
        
        // Construir el heap máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        
        // Extraer elementos uno por uno del heap y colocarlos al final del arreglo ordenado
        for (int i = n - 1; i >= 0; i--) {
            // Mover el elemento raíz actual al final del arreglo
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // Llamar a heapify en el subárbol reducido
            heapify(arr, i, 0);
        }
    }
    
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Inicializar el índice del elemento más grande como la raíz
        int left = 2 * i + 1; // Índice del hijo izquierdo
        int right = 2 * i + 2; // Índice del hijo derecho
        
        // Si el hijo izquierdo es más grande que la raíz
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        // Si el hijo derecho es más grande que la raíz
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        // Si el mayor no es la raíz
        if (largest != i) {
            // Intercambiar el elemento más grande con la raíz
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            // Recursivamente hacer heapify en el subárbol afectado
            heapify(arr, n, largest);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Arreglo original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        heapSort(arr);
        
        System.out.println("\nArreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}