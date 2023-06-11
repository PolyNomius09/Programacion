/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa1.java
 * Practica 9
 * @author Rafael Lopez Olvera
 * date 2023-05-28
 * PROGRAMACION
 */
public class Programa1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();
            if (numero < 0) {
                throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
            }
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}