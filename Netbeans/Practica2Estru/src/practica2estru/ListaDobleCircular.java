/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2estru;

import java.util.Random;
import java.util.Scanner;

/**
 * Main.java
 * Practica 2
 * @author Rafael Lopez Olvera
 * date 2023-03-12
 */
public class ListaDobleCircular {
    private Nodo inicio;

    public ListaDobleCircular() {
        inicio = null;
    }

    public void insertar(int valor, int posicion) {
        Nodo nuevo = new Nodo(valor);

        if (inicio == null) {
            inicio = nuevo;
            nuevo.anterior = nuevo;
            nuevo.siguiente = nuevo;
        } else if (posicion <= 1) {
            nuevo.siguiente = inicio;
            nuevo.anterior = inicio.anterior;
            inicio.anterior.siguiente = nuevo;
            inicio.anterior = nuevo;
            inicio = nuevo;
        } else {
            Nodo actual = inicio;
            for (int i = 1; i < posicion && actual != inicio.anterior; i++) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual;
            nuevo.anterior = actual.anterior;
            actual.anterior.siguiente = nuevo;
            actual.anterior = nuevo;
        }
    }

    public int buscar(int valorBuscado) {
        if (inicio == null) {
            return -1;
        }
        Nodo actual = inicio.anterior;
        int posicion = 1;
        while (actual.valor > valorBuscado && actual != inicio) {
            actual = actual.anterior;
            posicion++;
        }
        return posicion;
    }

    public void listar(int sentido) {
        if (inicio == null) {
            System.out.println("Lista vacía");
            return;
        }

        if (sentido == 1) {
            Nodo actual = inicio;
            do {
                System.out.print(actual.valor + " ");
                actual = actual.siguiente;
            } while (actual != inicio);
        } else {
            Nodo actual = inicio.anterior;
            do {
                System.out.print(actual.valor + " ");
                actual = actual.anterior;
            } while (actual != inicio.anterior);
        }
        System.out.println();
    }

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese la cantidad de números a generar: ");
        int n = sc.nextInt();

        ListaDobleCircular lista = new ListaDobleCircular();

        for (int i = 0; i < n; i++) {
            int valor = rand.nextInt(1000);
            lista.insertar(valor, lista.buscar(valor));
        }

        System.out.print("Lista en orden ascendente: ");
        lista.listar(1);

        System.out.print("Lista en orden descendente: ");
        lista.listar(2);

        sc.close();
    }

    private class Nodo {
        int valor;
        Nodo anterior;
        Nodo siguiente;

        public Nodo(int valor) {
            this.valor = valor;
            anterior = null;
            siguiente = null;
        }
    }
}