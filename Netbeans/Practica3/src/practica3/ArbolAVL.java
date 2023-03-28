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


public class ArbolAVL extends BinarySearchTree {
    
    public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;
    private Node parent;

    public Node(int value) {
        this.value = value;
        this.height = 1;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getHeight() {
        return height;
    }

    public Node getParent() {
        return parent;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public boolean hasLeftChild() {
        return left != null;
    }

    public boolean hasRightChild() {
        return right != null;
    }

    public boolean isLeftChild() {
        return parent != null && parent.left == this;
    }
    
    private Node root;

    public Node() {
        Node nodo = new Node(10);
        nodo.setValue(20);
        root = null;
    }

    // Inserción
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        } else {
            node.incrementCount();
        }

        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);

        int balance = getBalance(node);

        if (balance > 1 && value < node.getLeft().getValue()) {
            return rotateRight(node);
        }

        if (balance < -1 && value > node.getRight().getValue()) {
            return rotateLeft(node);
        }

        if (balance > 1 && value > node.getLeft().getValue()) {
            node.setLeft(rotateLeft(node.getLeft()));
            return rotateRight(node);
        }

        if (balance < -1 && value < node.getRight().getValue()) {
            node.setRight(rotateRight(node.getRight()));
            return rotateLeft(node);
        }

        return node;
    }

    // Eliminación
    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (value < node.getValue()) {
            node.setLeft(delete(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(delete(node.getRight(), value));
        } else {
            if (node.getCount() > 1) {
                node.decrementCount();
            } else {
                if (node.getLeft() == null || node.getRight() == null) {
                    Node temp = null;
                    if (temp == node.getLeft()) {
                        temp = node.getRight();
                    } else {
                        temp = node.getLeft();
                    }

                    if (temp == null) {
                        temp = node;
                        node = null;
                    } else {
                        node = temp;
                    }
                } else {
                    Node temp = minValueNode(node.getRight());
                    node.setValue(temp.getValue());
                    node.setCount(temp.getCount());
                    temp.setCount(1);
                    node.setRight(delete(node.getRight(), temp.getValue()));
                }
            }
        }

        if (node == null) {
            return null;
        }

        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);

        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.getLeft()) >= 0) {
            return rotateRight(node);
        }

        if (balance > 1 && getBalance(node.getLeft()) < 0) {
            node.setLeft(rotateLeft(node.getLeft()));
            return rotateRight(node);
        }

        if (balance < -1 && getBalance(node.getRight()) <= 0) {
            return rotateLeft(node);
        }

        if (balance < -1 && getBalance(node.getRight()) > 0) {
            node.setRight(rotateRight(node.getRight()));
            return rotateLeft(node);
        }
// Búsqueda
    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (value == node.getValue()) {
            return true;
        } else if (value < node.getValue()) {
            return search(node.getLeft(), value);
        } else {
            return search(node.getRight(), value);
        }
    }

    // Mínimo
    public int getMinValue() {
        return minValueNode(root).getValue();
    }

    private Node minValueNode(Node node) {
        Node current = node;

        while (current.getLeft() != null) {
            current = current.getLeft();
        }

        return current;
    }

    // Máximo
    public int getMaxValue() {
        return maxValueNode(root).getValue();
    }

    private Node maxValueNode(Node node) {
        Node current = node;

        while (current.getRight() != null) {
            current = current.getRight();
        }

        return current;
    }

    // Antecesor
    public int getPredecessor(int value) {
        Node node = searchNode(root, value);

        if (node == null) {
            return -1;
        }

        if (node.getLeft() != null) {
            return maxValueNode(node.getLeft()).getValue();
        } else {
            Node parent = node.getParent();

            while (parent != null && node == parent.getLeft()) {
                node = parent;
                parent = parent.getParent();
            }

            if (parent == null) {
                return -1;
            } else {
                return parent.getValue();
            }
        }
    }

    // Sucesor
    public int getSuccessor(int value) {
        Node node = searchNode(root, value);

        if (node == null) {
            return -1;
        }

        if (node.getRight() != null) {
            return minValueNode(node.getRight()).getValue();
        } else {
            Node parent = node.getParent();

            while (parent != null && node == parent.getRight()) {
                node = parent;
                parent = parent.getParent();
            }

            if (parent == null) {
                return -1;
            } else {
                return parent.getValue();
            }
        }
    }

    private Node searchNode(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (value == node.getValue()) {
            return node;
        } else if (value < node.getValue()) {
            return searchNode(node.getLeft(), value);
        } else {
            return searchNode(node.getRight(), value);
        }
    }

    // Rotaciones
    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }

        return node.getHeight();
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }

        return getHeight(node.getLeft()) - getHeight(node.getRight());
    }

    private Node rotateRight(Node node) {
        Node left = node.getLeft();
        Node rightOfLeft = left.getRight();

        left.setRight(node);
        node.setLeft(rightOfLeft);

        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);
        left.setHeight(Math.max(getHeight(left.getLeft()), getHeight(left.getRight())) + 1);

        return left;
    }

    private Node rotateLeft(Node node) {
        Node right = node.getRight();
        Node leftOfRight = right.getLeft();

        right.setLeft(node);
        node.setRight(leftOfRight);

        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);
        right.setHeight(Math.max(getHeight(right.getLeft()), getHeight(right.getRight())) + 1);

        return right;
    }

    private Node balance(Node node) {
        if (node == null) {
            return null;
        }

        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.getLeft()) >= 0) {
            return rotateRight(node);
        }

        if (balance > 1 && getBalance(node.getLeft()) < 0) {
            node.setLeft(rotateLeft(node.getLeft()));
            return rotateRight(node);
        }

        if (balance < -1 && getBalance(node.getRight()) <= 0) {
            return rotateLeft(node);
        }

        if (balance < -1 && getBalance(node.getRight()) > 0) {
            node.setRight(rotateRight(node.getRight()));
            return rotateLeft(node);
        }

        return node;
    }

    // Inserción
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        } else {
            node.incrementCount();
            return node;
        }

        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);

        return balance(node);
    }

    // Eliminación
    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (value < node.getValue()) {
            node.setLeft(delete(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(delete(node.getRight(), value));
        } else {
            if (node.getCount() > 1) {
                node.decrementCount();
                return node;
            }

            if (node.getLeft() == null || node.getRight() == null) {
                Node temp = null;

                if (temp == node.getLeft()) {
                    temp = node.getRight();
                } else {
                    temp = node.getLeft();
                }

                if (temp == null) {
                    temp = node;
                    node = null;
                } else {
                    node = temp;
                }
            } else {
                Node temp = minValueNode(node.getRight());
                node.setValue(temp.getValue());
                node.setCount(temp.getCount());
                temp.setCount(1);
                node.setRight(delete(node.getRight(), temp.getValue()));
            }
        }

        if (node == null) {
            return null;
        }

        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);

        return balance(node);
        }
    }
}

public class ArbolAVL {
    public static void main(String[] args) {
        ArbolAVL tree = new ArbolAVL();

        Random random = new Random();

        // Generar 1,000,000 números pseudoaleatorios entre 1 y 2// Insertar números en el árbol AVL
        for (int i = 0; i < 1000000; i++) {
            int value = random.nextInt(2000000) + 1;
            tree.insert(value);
        }

        // Realizar 50 búsquedas
        for (int i = 0; i < 50; i++) {
            int value = random.nextInt(2000000) + 1;
            long startTime = System.currentTimeMillis();
            Node result = tree.search(value);
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("Búsqueda " + (i + 1) + ": " + value + " (tiempo: " + elapsedTime + " ms)");
        }

        // Obtener mínimo y máximo
        System.out.println("Mínimo: " + tree.minValue());
        System.out.println("Máximo: " + tree.maxValue());

        // Obtener antecesor y sucesor de un número proporcionado por el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para obtener su antecesor y sucesor: ");
        int value = scanner.nextInt();
        Node predecessor = tree.predecessor(value);
        Node successor = tree.successor(value);
        if (predecessor != null) {
            System.out.println("Antecesor: " + predecessor.getValue());
        } else {
            System.out.println("No se encontró antecesor");
        }
        if (successor != null) {
            System.out.println("Sucesor: " + successor.getValue());
        } else {
            System.out.println("No se encontró sucesor");
        }
    }
}