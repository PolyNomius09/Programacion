import java.util.Scanner;

/**
 * Principal.java
 * Practica 1
 * @author Rafael Lopez Olvera
 * date 2023-02-22
 */

public class Principal {

    /**
     * Metodo principal en el que se ingresa el valor de n para calcular el enesimo termino de la sucesion de Fibonacci.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Programa para calcular el n valor de la sucesion de Fibonacci ");
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n debe ser un numero entero positivo >:c");
            return;
        }
        double resultado = fibonacci(n);
        System.out.println("El " + n + " termino de la sucesion de Fibonacci es " + resultado);
    }

    /**
     * Funcion con la formula de binet ABAJOOOOO
     * @param n es el valor que calculara, este es ingresado por el usuario
     * @return resultado de la operacion
     */

    public static double fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        double rafa = (1 + sqrt5) / 2;
        double lopez = (1 - sqrt5) / 2;
        double resultado = (Math.pow(rafa, n) - Math.pow(lopez, n)) / sqrt5;
        return resultado;
    }
}