/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;
import java.util.*;

/**
 * Main.java
 * Practica 7
 * @author Rafael Lopez Olvera
 * date 2023-06-6
 * EDD
 */
public class Practica7 {
    private static final int INFINITO = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // Crear el grafo
        Grafo grafo = new Grafo();
        grafo.agregarArista('s', 't', 10);
        grafo.agregarArista('s', 'y', 5);
        grafo.agregarArista('t', 'x', 1);
        grafo.agregarArista('t', 'y', 2);
        grafo.agregarArista('x', 'z', 2);
        grafo.agregarArista('y', 't', 3);
        grafo.agregarArista('y', 'x', 9);
        grafo.agregarArista('y', 'z', 7);
        grafo.agregarArista('z', 's', 6);
        grafo.agregarArista('z', 'x', 4);

        // Pedir al usuario el punto de partida y destino
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el punto de partida: ");
        char nodoInicio = scanner.next().charAt(0);
        System.out.print("Ingrese el punto de destino: ");
        char nodoFin = scanner.next().charAt(0);

        // Encontrar el camino más corto
        Map<Character, Integer> distanciasMinimas = dijkstra(grafo, nodoInicio);

        // Mostrar el resultado
        if (distanciasMinimas.containsKey(nodoFin)) {
            int distanciaMinima = distanciasMinimas.get(nodoFin);
            System.out.println("El camino más corto desde " + nodoInicio + " hasta " + nodoFin + " es: " + distanciaMinima);
        } else {
            System.out.println("No hay un camino válido desde " + nodoInicio + " hasta " + nodoFin);
        }
    }

    private static Map<Character, Integer> dijkstra(Grafo grafo, char nodoInicio) {
        // Inicializar las estructuras de datos
        Map<Character, Integer> distancias = new HashMap<>();
        PriorityQueue<Nodo> colaPrioridad = new PriorityQueue<>();
        Set<Character> visitados = new HashSet<>();

        for (char nodo : grafo.getNodos()) {
            if (nodo == nodoInicio) {
                distancias.put(nodo, 0);
                colaPrioridad.add(new Nodo(nodo, 0));
            } else {
                distancias.put(nodo, INFINITO);
                colaPrioridad.add(new Nodo(nodo, INFINITO));
            }
        }

        // Aplicar el algoritmo de Dijkstra
        while (!colaPrioridad.isEmpty()) {
            Nodo nodoActual = colaPrioridad.poll();
            char actual = nodoActual.getNodo();

            if (visitados.contains(actual)) {
                continue;
            }

            visitados.add(actual);

            for (char vecino : grafo.getVecinos(actual)) {
                int peso = grafo.getPeso(actual, vecino);
                int distanciaAtravesandoActual = distancias.get(actual) + peso;

                if (distanciaAtravesandoActual < distancias.get(vecino)) {
                    distancias.put(vecino, distanciaAtravesandoActual);
                    colaPrioridad.add(new Nodo(vecino, distanciaAtravesandoActual));
                }
            }
        }

        return distancias;
    }

    static class Grafo {
        private Map<Character, Map<Character, Integer>> grafo;

        public Grafo() {
            grafo = new HashMap<>();
        }

        public void agregarArista(char inicio, char fin, int peso) {
            grafo.computeIfAbsent(inicio, k -> new HashMap<>()).put(fin, peso);
        }

        public Set<Character> getNodos() {
            return grafo.keySet();
        }

        public Set<Character> getVecinos(char nodo) {
            return grafo.getOrDefault(nodo, Collections.emptyMap()).keySet();
        }

        public int getPeso(char inicio, char fin) {
            return grafo.getOrDefault(inicio, Collections.emptyMap()).getOrDefault(fin, INFINITO);
        }
    }

    static class Nodo implements Comparable<Nodo> {
        private char nodo;
        private int distancia;

        public Nodo(char nodo, int distancia) {
            this.nodo = nodo;
            this.distancia = distancia;
        }

        public char getNodo() {
            return nodo;
        }

        public int getDistancia() {
            return distancia;
        }

        @Override
        public int compareTo(Nodo otro) {
            return Integer.compare(distancia, otro.distancia);
        }
    }
}