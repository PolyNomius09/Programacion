/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author Rafa
 *
 */
import java.util.Scanner;

class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private String telefono;

    public Persona(String nombre, int edad, double estatura, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getTelefono() {
        return telefono;
    }
}

public class Programa1 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        Persona[] personas = new Persona[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa el nombre de la persona " + (i+1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad de " + nombre + ": ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingresa la estatura de " + nombre + " (en metros): ");
            double estatura = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingresa el número telefónico de " + nombre + ": ");
            String telefono = scanner.nextLine();

            personas[i] = new Persona(nombre, edad, estatura, telefono);
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            Persona persona = personas[i];
            System.out.printf("Persona %d:\n", (i+1));
            System.out.printf("¡Hola!, mi nombre es %s, tengo %d años, nací en %d, mido %.2f metros y mi número de contacto es %s. ¡Saludos!\n",
                    persona.getNombre(),
                    persona.getEdad(),
                    2023 - persona.getEdad(),
                    persona.getEstatura(),
                    persona.getTelefono());
            System.out.println();
        }
    }
}
