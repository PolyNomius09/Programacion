/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

/**
 * Main.java
 * Examen
 * @author Rafael Lopez Olvera
 * date 2023-03-15
 */
public class Examen {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Registro de asistencia");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Registrar Vigilante");
            System.out.println("3. Registrar Asistencia");
            System.out.println("4. Ver Asistencia");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = scanner.next();
                    System.out.print("Ingrese el número de empleado: ");
                    int numEmpleado = scanner.nextInt();
                    System.out.print("Ingrese el area al que pertenece: (Sistemas, Recursos Humanos, Recursos Financieros, Mantenimiento).: ");
                    String departamento = scanner.next();
                    Empleado empleado = new Empleado(nombreEmpleado, numEmpleado, departamento);
                    empresa.agregarEmpleado(empleado);
                    //System.out.println("Empleado agregado correctamente.");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del vigilante: ");
                    String nombreVigilante = scanner.next();
                    System.out.print("Ingrese el turno (Matutino, Vespertino, Nocturno): ");
                    String turno = scanner.next();
                    Vigilante vigilante = new Vigilante(nombreVigilante, turno);
                    empresa.registrarVigilante(vigilante);
                    //System.out.println("Vigilante registrado correctamente.");
                    System.out.println();
                    break;
                case 3:
                    empresa.registrarAsistencia();
                    System.out.println();
                    break;
                case 4:
                    empresa.mostrarAsistencia();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}