/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2estru;

import java.util.Scanner;

/**
 * Main.java
 * Practica 2
 * @author Rafael Lopez Olvera
 * date 2023-03-12
 */
class Nodo {
    int data;
    int priority;
    Nodo next;

    public Nodo(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

class PriorityQueue {
    Nodo head;

    public PriorityQueue() {
        this.head = null;
    }

    public void enqueue(int data, int priority) {
        Nodo newNodo = new Nodo(data, priority);

        if (head == null) {
            head = newNodo;
        } else if (priority < head.priority) {
            newNodo.next = head;
            head = newNodo;
        } else {
            Nodo current = head;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNodo.next = current.next;
            current.next = newNodo;
        }
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo removedNodo = head;
        head = head.next;
        System.out.println("Elemento retirado: " + removedNodo.data);
        printQueue();
    }

    public void printQueue() {
        if (head == null) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo current = head;
        while (current != null) {
            System.out.print(current.data + "(" + current.priority + ")" + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Cola {
    public static void ejecutar() {
        PriorityQueue priorityQueue = new PriorityQueue();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese elementos en el formato valor-prioridad (Ejemplo: 10-2).");
        System.out.println("El programa dejará de solicitar valores hasta que no se ingrese nada.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] inputArray = input.split("-");
            int data = Integer.parseInt(inputArray[0]);
            int priority = Integer.parseInt(inputArray[1]);
            priorityQueue.enqueue(data, priority);
        }

        System.out.println("Contenido de la cola de prioridad:");
        priorityQueue.printQueue();

        while (true) {
            System.out.println("Presione enter para retirar el siguiente elemento de la cola.");
            scanner.nextLine();
            priorityQueue.dequeue();
            if (priorityQueue.head == null) {
                break;
            }
        }

        scanner.close();
    }
}
