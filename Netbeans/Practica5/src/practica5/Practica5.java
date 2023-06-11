/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Main.java
 * Practica 5
 * @author Rafael Lopez Olvera
 * date 2023-05-16
 * EDD
 */
public class Practica5 {
    
    public static void main(String[] args) {
        // Definir los tamaños de los conjuntos de datos
        int[] sizes = {1000, 5000, 10000, 50000};
        
        // Ejecutar los algoritmos de ordenamiento para cada tamaño de conjunto de datos
        for (int size : sizes) {
            System.out.println("Tamaño del conjunto de datos: " + size);
            System.out.println("--------------------------");
            
            // Generar el conjunto de datos para cada caso
            int[] bestCase = generateBestCase(size);
            int[] worstCase = generateWorstCase(size);
            int[] averageCase = generateAverageCase(size);
            
            // Copiar los conjuntos de datos para cada algoritmo
            int[] bubbleSortArr = Arrays.copyOf(bestCase, bestCase.length);
            int[] selectionSortArr = Arrays.copyOf(bestCase, bestCase.length);
            int[] insertionSortArr = Arrays.copyOf(bestCase, bestCase.length);
            int[] mergeSortArr = Arrays.copyOf(bestCase, bestCase.length);
            int[] quickSortArr = Arrays.copyOf(bestCase, bestCase.length);
            int[] countingSortArr = Arrays.copyOf(bestCase, bestCase.length);
            
            // Medir los tiempos de ejecución para cada algoritmo en cada caso
            long startTime, endTime, elapsedTime;
            
            System.out.println("Mejor caso:");
            
            startTime = System.nanoTime();
            bubbleSort(bubbleSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Bubble Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            selectionSort(selectionSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Selection Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            insertionSort(insertionSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Insertion Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            mergeSort(mergeSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Merge Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            quickSort(quickSortArr, 0, quickSortArr.length - 1);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Quick Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            countingSort(countingSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Counting Sort: " + elapsedTime + " nanosegundos");
            
            System.out.println();
            
            System.out.println("Peor caso:");
            
            startTime = System.nanoTime();
            bubbleSort(bubbleSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Bubble Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            selectionSort(selectionSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Selection Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            insertionSort(insertionSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Insertion Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            mergeSort(mergeSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Merge Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            quickSort(quickSortArr, 0, quickSortArr.length - 1);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Quick Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            countingSort(countingSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Counting Sort: " + elapsedTime + " nanosegundos");
            
            System.out.println();
            
            System.out.println("Caso promedio:");
            
            startTime = System.nanoTime();
            bubbleSort(bubbleSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Bubble Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            selectionSort(selectionSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Selection Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            insertionSort(insertionSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Insertion Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            mergeSort(mergeSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Merge Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            quickSort(quickSortArr, 0, quickSortArr.length - 1);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Quick Sort: " + elapsedTime + " nanosegundos");
            
            startTime = System.nanoTime();
            countingSort(countingSortArr);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Counting Sort: " + elapsedTime + " nanosegundos");
            
            System.out.println("\n--------------------------\n");
        }
    }
    
    public static int[] generateBestCase(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    
    public static int[] generateWorstCase(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }
    
    public static int[] generateAverageCase(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size) + 1;
        }
        return arr;
    }
    
    public static void bubbleSort(int[] arr) {
        // Implementación del algoritmo de Bubble Sort
    }
    
    public static void selectionSort(int[] arr) {
        // Implementación del algoritmo de Selection Sort
    }
    
    public static void insertionSort(int[] arr) {
        // Implementación del algoritmo de Insertion Sort
    }
    
    public static void mergeSort(int[] arr) {
        // Implementación del algoritmo de Merge Sort
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        // Implementación del algoritmo de Quick Sort
    }
    
    public static void countingSort(int[] arr) {
        // Implementación del algoritmo de Counting Sort
    }
}