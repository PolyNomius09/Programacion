/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica4pt2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
/**
 * Grafo.java (Grafo usado para la implementación utilizando lista de adyacencia)
 * Practica 4 Programa 1
 * @author Rafael Lopez Olvera
 * date 2023-04-26
 * EDD
 */
public class Grafo {
    private Map<Vertice, List<Vertice>> ListaAdyaciente;

    public Grafo() {
        ListaAdyaciente = new HashMap<>();
    }

    //AgregarVertice agrega un vértice al grafo. Incrementa el número de vértices en el grafo.
    public void AgregarVertice(Vertice Vertice) {
        ListaAdyaciente.put(Vertice, new ArrayList<>());
    }

    //AgregarArista agrega una arista al grafo.
    public void AgregarArista(Vertice source, Vertice dest) {
        ListaAdyaciente.get(source).add(dest);
        ListaAdyaciente.get(dest).add(source);
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

                for (Vertice neighbor : ListaAdyaciente.get(current)) {
                    if (!visited.contains(neighbor)) {
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

                for (Vertice neighbor : ListaAdyaciente.get(current)) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
}
