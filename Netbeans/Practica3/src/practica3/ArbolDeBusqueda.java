/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author rafyt
 */
class Node {
  int value;
  Node left, right;
  int count; // número de veces que se ha insertado el valor en el árbol

  public Node(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
    this.count = 1;
  }
}

class BinarySearchTree {
  Node root;

  public BinarySearchTree() {
    this.root = null;
  }

  public void insert(int value) {
    this.root = insert(this.root, value);
  }

  private Node insert(Node node, int value) {
    if (node == null) {
      return new Node(value);
    }

    if (value == node.value) {
      node.count++;
    } else if (value < node.value) {
      node.left = insert(node.left, value);
    } else {
      node.right = insert(node.right, value);
    }

    return node;
  }

  public boolean search(int value) {
    return search(this.root, value);
  }

  private boolean search(Node node, int value) {
    if (node == null) {
      return false;
    }

    if (value == node.value) {
      return true;
    } else if (value < node.value) {
      return search(node.left, value);
    } else {
      return search(node.right, value);
    }
  }

  public int getMinValue() {
    if (this.root == null) {
      throw new IllegalStateException("Árbol vacío");
    }

    Node current = this.root;
    while (current.left != null) {
      current = current.left;
    }

    return current.value;
  }

  public int getMaxValue() {
    if (this.root == null) {
      throw new IllegalStateException("Árbol vacío");
    }

    Node current = this.root;
    while (current.right != null) {
      current = current.right;
    }

    return current.value;
  }
}

public class ArbolDeBusqueda {
    public static void main(String[] args) {
  BinarySearchTree tree = new BinarySearchTree();
  Random rand = new Random();

  // Generar 1000000 números pseudoaleatorios y insertarlos en el árbol
  for (int i = 0; i < 1000000; i++) {
    int value = rand.nextInt(2000000) + 1;
    tree.insert(value);
  }

  // Realizar 50 búsquedas de números aleatorios y medir el tiempo
  long startTime, endTime, totalTime = 0;
  for (int i = 0; i < 50; i++) {
    int value = rand.nextInt(2000000) + 1;
    startTime = System.currentTimeMillis();
    boolean found = tree.search(value);
    endTime = System.currentTimeMillis();
    if (found) {
      System.out.println("Valor " + value + " encontrado en " + (endTime - startTime) + "ms");
    } else {
      System.out.println("Valor " + value + " no encontrado en " + (endTime - startTime) + "ms");
    }
    totalTime += (endTime - startTime);
  }

  System.out.println("Tiempo total de búsqueda: " + totalTime + "ms");

  // Obtener el valor mínimo y máximo del árbol
  int minValue = tree.getMinValue();
  int maxValue = tree.getMaxValue();
  System.out.println("Valor mínimo: " + minValue);
  System.out.println("Valor máximo: " + maxValue);
}
}
