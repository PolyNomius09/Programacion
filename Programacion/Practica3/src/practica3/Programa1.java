/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 * Main.java
 * Practica 3
 * @author Rafael Lopez Olvera
 * date 2023-03-12
 */
import java.util.Scanner;

public class Programa1 {
    public static void ejecutar() {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("Calculadora de Areas y Perimetros");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectangulo");
            System.out.println("4. Triangulo equilatero");
            System.out.println("5. Trapecio");
            System.out.println("6. Paralelogramo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = input.nextInt();
            limpiarPantalla();

            switch (opcion) {
                case 1:
                    calcularCirculo();
                    break;
                case 2:
                    calcularCuadrado();
                    break;
                case 3:
                    calcularRectangulo();
                    break;
                case 4:
                    calcularTrianguloEquilatero();
                    break;
                case 5:
                    calcularTrapecio();
                    break;
                case 6:
                    calcularParalelogramo();
                    break;
                case 7:
                    System.out.println("Gracias por usar la Calculadora de Areas y Perimetros. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

            if (opcion != 7) {
                System.out.print("Presione ENTER para continuar...");
                input.nextLine();
                input.nextLine();
                limpiarPantalla();
            }
        }
    }

    public static void calcularCirculo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        double radio = input.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.printf("El area del circulo es: %.2f\n", area);
        System.out.printf("El perimetro del circulo es: %.2f\n", perimetro);
    }

    public static void calcularCuadrado() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        double lado = input.nextDouble();

        double area = Math.pow(lado, 2);
        double perimetro = 4 * lado;

        System.out.printf("El area del cuadrado es: %.2f\n", area);
        System.out.printf("El perimetro del cuadrado es: %.2f\n", perimetro);
    }

    public static void calcularRectangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        double base = input.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = input.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.printf("El area del rectangulo es: %.2f\n", area);
        System.out.printf("El perimetro del rectangulo es: %.2f\n", perimetro);
    }

    public static void calcularTrianguloEquilatero() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del triangulo equilatero:");
        double lado = input.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    double perimetro = 3 * lado;

    System.out.printf("El area del triangulo equilatero es: %.2f\n", area);
    System.out.printf("El perimetro del triangulo equilatero es: %.2f\n", perimetro);
}

public static void calcularTrapecio() {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese la base mayor del trapecio: ");
    double baseMayor = input.nextDouble();

    System.out.print("Ingrese la base menor del trapecio: ");
    double baseMenor = input.nextDouble();

    System.out.print("Ingrese la altura del trapecio: ");
    double altura = input.nextDouble();

    double area = ((baseMayor + baseMenor) / 2) * altura;
    double perimetro = baseMayor + baseMenor + (2 * Math.sqrt(Math.pow((baseMayor - baseMenor) / 2, 2) + Math.pow(altura, 2)));

    System.out.printf("El area del trapecio es: %.2f\n", area);
    System.out.printf("El perimetro del trapecio es: %.2f\n", perimetro);
}

public static void calcularParalelogramo() {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese la base del paralelogramo: ");
    double base = input.nextDouble();

    System.out.print("Ingrese la altura del paralelogramo: ");
    double altura = input.nextDouble();

    double area = base * altura;
    double perimetro = 2 * (base + altura);

    System.out.printf("El area del paralelogramo es: %.2f\n", area);
    System.out.printf("El perimetro del paralelogramo es: %.2f\n", perimetro);
}

public static void limpiarPantalla() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }
}
