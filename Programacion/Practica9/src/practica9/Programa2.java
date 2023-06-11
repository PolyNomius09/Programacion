/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa2.java
 * Practica 9
 * @author Rafael Lopez Olvera
 * date 2023-05-28
 * PROGRAMACION
 */
public class Programa2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el número A: ");
            double numA = scanner.nextDouble();
            System.out.print("Ingrese el número B: ");
            double numB = scanner.nextDouble();
            double resultado = dividir(numA, numB);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
        }
    }

    public static double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return dividendo / divisor;
    }
}