/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;
import java.util.*;
import java.util.Scanner;
/**
 * Grafo.java (Grafo usado para la implementación utilizando matriz de adyacencia)
 * Practica 4 Programa 1
 * @author Rafael Lopez Olvera
 * date 2023-04-26
 * EDD
 */

/*La clase Grafo es la clase principal que representa el grafo y contiene los métodos para
insertar aristas y realizar los recorridos en profundidad y en anchura.*/

public class Grafo {
    //MatrizAdyaciente tiene N filas y columnas, donde N es el número de vértices en el grafo
    private int[][] MatrixAdyaciente;
    private List<Vertice> vertices;

    //constructor del grafo
    public Grafo(int numVertices) {
        MatrixAdyaciente = new int[numVertices][numVertices];
        vertices = new ArrayList<>();
    }

    //AgregarVertice agrega un vértice al grafo. Incrementa el número de vértices en el grafo.
    public void AgregarVertice(Vertice Vertice) {
        vertices.add(Vertice);
    }

    //AgregarArista agrega una arista al grafo.
    public void AgregarArista(Vertice source, Vertice dest) {
        int srcIndex = vertices.indexOf(source);
        int destIndex = vertices.indexOf(dest);
        MatrixAdyaciente[srcIndex][destIndex] = 1;
        MatrixAdyaciente[destIndex][srcIndex] = 1;
    }

    //dfs realiza el recorrido en profundidad del grafo a partir de un vértice de inicio dado
    public void dfs(Vertice start) {
        Set<Vertice> visited = new HashSet<>();
        Stack<Vertice> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            Vertice current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                System.out.print(current.getLabel() + " ");

                int currentIndex = vertices.indexOf(current);
                for (int i = MatrixAdyaciente[currentIndex].length - 1; i >= 0; i--) {
                    if (MatrixAdyaciente[currentIndex][i] == 1) {
                        Vertice neighbor = vertices.get(i);
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    //bfs realiza el recorrido en anchura del grafo a partir de un vértice de inicio dado.
    public void bfs(Vertice start) {
        Set<Vertice> visited = new HashSet<>();
        Queue<Vertice> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertice current = queue.poll();
            if (!visited.contains(current)) {
                visited.add(current);
                System.out.print(current.getLabel() + " ");

                int currentIndex = vertices.indexOf(current);
                for (int i = 0; i < MatrixAdyaciente[currentIndex].length; i++) {
                    if (MatrixAdyaciente[currentIndex][i] == 1) {
                        Vertice neighbor = vertices.get(i);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
}