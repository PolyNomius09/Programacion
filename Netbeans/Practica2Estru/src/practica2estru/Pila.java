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
    char data;
    Nodo next;

    Nodo(char data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Nodo top;

    Stack() {
        this.top = null;
    }

    boolean isEmpty() {
        return (top == null);
    }

    void push(char data) {
        Nodo newNodo = new Nodo(data);
        newNodo.next = top;
        top = newNodo;
    }

    char pop() {
        if (isEmpty()) {
            return ' ';
        } else {
            char data = top.data;
            top = top.next;
            return data;
        }
    }

    char peek() {
        if (isEmpty()) {
            return ' ';
        } else {
            return top.data;
        }
    }
}

public class Pila {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita la expresión matemática al usuario
        System.out.print("Ingrese la expresión matemática separada por espacios: ");
        String expression = scanner.nextLine();

        // Convierte la expresión en una matriz de caracteres
        char[] expressionArray = expression.toCharArray();
        int length = expressionArray.length;

        // Crea una pila vacía
        Stack stack = new Stack();

        // Verifica el balanceo de los paréntesis
        boolean balanced = true;
        for (int i = 0; i < length; i++) {
            if (expressionArray[i] == '(') {
                stack.push(expressionArray[i]);
            } else if (expressionArray[i] == ')') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        if (!balanced) {
            System.out.println("La expresión matemática no está balanceada");
            System.exit(0);
        }

        // Obtiene la expresión en notación postfija
        StringBuilder postfix = new StringBuilder();
        stack = new Stack();

        for (int i = 0; i < length; i++) {
            char c = expressionArray[i];
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        System.out.println("Expresión en notación postfija: " + postfix.toString());

        // Obtiene la expresión en notación prefija
        StringBuilder prefix = new StringBuilder();
        stack = new Stack();

        for (int i = length - 1; i >= 0; i--) {
            char c = expressionArray[i];
            if (Character.isLetterOrDigit(c)) {
                prefix.insert(0, c);
            } else if (c == ')') {
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.insert(0, stack.pop());
        }
        stack.pop();
    } else {
        while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
            prefix.insert(0, stack.pop());
        }
        stack.push(c);
    }
}

while (!stack.isEmpty()) {
    prefix.insert(0, stack.pop());
}

System.out.println("Expresión en notación prefija: " + prefix.toString());

// Evaluación de la expresión en notación postfija
stack = new Stack();

for (int i = 0; i < postfix.length(); i++) {
    char c = postfix.charAt(i);
    if (Character.isDigit(c)) {
        stack.push(c);
    } else {
        int operand2 = Character.getNumericValue(stack.pop());
        int operand1 = Character.getNumericValue(stack.pop());
        int result = evaluate(operand1, operand2, c);
        stack.push(Character.forDigit(result, 10));
    }
}

int finalResultPostfix = Character.getNumericValue(stack.pop());
System.out.println("El resultado de la expresión en notación postfija es: " + finalResultPostfix);

// Evaluación de la expresión en notación prefija
stack = new Stack();

for (int i = prefix.length() - 1; i >= 0; i--) {
    char c = prefix.charAt(i);
    if (Character.isDigit(c)) {
        stack.push(c);
    } else {
        int operand1 = Character.getNumericValue(stack.pop());
        int operand2 = Character.getNumericValue(stack.pop());
        int result = evaluate(operand1, operand2, c);
        stack.push(Character.forDigit(result, 10));
    }
}

int finalResultPrefix = Character.getNumericValue(stack.pop());
System.out.println("El resultado de la expresión en notación prefija es: " + finalResultPrefix);
}

static int precedence(char c) {
switch (c) {
case '+':
case '-':
return 1;
case '*':
    case '/':
        return 2;

    case '^':
        return 3;
}
return -1;
}

static int evaluate(int operand1, int operand2, char operator) {
    switch (operator) {
    case '+':
    return operand1 + operand2;
        case '-':
            return operand1 - operand2;

        case '*':
            return operand1 * operand2;

        case '/':
            return operand1 / operand2;

        case '^':
            return (int) Math.pow(operand1, operand2);
            }
        return 0;
    }
}