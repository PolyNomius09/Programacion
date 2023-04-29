/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica4pt2;
import java.util.*;
import java.util.Scanner;
/**
 * Main.java
 * Practica 4 Programa 2 (implementación utilizando lista de adyacencia)
 * @author Rafael Lopez Olvera
 * date 2023-04-26
 * EDD
 */
public class Practica4pt2 {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        Vertice A = new Vertice("A");
        Vertice B = new Vertice("B");
        Vertice C = new Vertice("C");
        Vertice D = new Vertice("D");
        Vertice H = new Vertice("H");
        Vertice R = new Vertice("R");
        Vertice T = new Vertice("T");

        grafo.AgregarVertice(A);
        grafo.AgregarVertice(B);
        grafo.AgregarVertice(C);
        grafo.AgregarVertice(D);
        grafo.AgregarVertice(H);
        grafo.AgregarVertice(R);
        grafo.AgregarVertice(T);

        grafo.AgregarArista(A, B);
        grafo.AgregarArista(A, H);
        grafo.AgregarArista(A, D);
        grafo.AgregarArista(B, H);
        grafo.AgregarArista(H, T);
        grafo.AgregarArista(H, C);
        grafo.AgregarArista(C, R);
        grafo.AgregarArista(T, R);

        System.out.println("Lista de adyacencia");
        System.out.println("DFS iniciando en A:");
        grafo.dfs(A);
        System.out.println("\nBFS iniciando en A:");
        grafo.bfs(A);
    }
}

//La clase Vertice representa un vértice o nodo del grafo.
class Vertice {
    //label almacena una etiqueta para el vértice.
    private String label;

    public Vertice(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    //equals compara si el objeto obj es igual al objeto Vertice actual. 
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vertice other = (Vertice) obj;
        return Objects.equals(this.label, other.label);
    }

    @Override
    //hashCode genera un código hash único para cada objeto Vertice
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.label);
        return hash;
    }
}