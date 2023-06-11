/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 * CountingSort.java
 * Practica 5
 * @author Rafael Lopez Olvera
 * date 2023-05-16
 * EDD
 */

//Algoritmo de Ordenamiento CountingSort
public class CountingSort {
    
    public static void countingSort(int[] arr) {
        int n = arr.length;
        
        // Encontrar el valor máximo en el arreglo
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Crear un arreglo de conteo con tamaño max+1 e inicializar todos los elementos en 0
        int[] count = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }
        
        // Contar la frecuencia de cada elemento en el arreglo original
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        
        // Calcular las posiciones finales de cada elemento en el arreglo ordenado
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        
        // Crear un arreglo auxiliar para almacenar los elementos ordenados
        int[] sortedArr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            sortedArr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        
        // Copiar los elementos ordenados al arreglo original
        for (int i = 0; i < n; i++) {
            arr[i] = sortedArr[i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        
        System.out.println("Arreglo original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        countingSort(arr);
        
        System.out.println("\nArreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}