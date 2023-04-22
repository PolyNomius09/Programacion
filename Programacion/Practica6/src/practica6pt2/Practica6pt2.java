/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6pt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main.java
 * Practica 6 pt. 2
 * @author Rafael Lopez Olvera
 * date 2023-04-14
 */

//Clase Padre Mascota
class Mascota {
    protected String nombre;
    protected int edad;
    protected String duenio;
    protected String tipo;

    public Mascota(String n, int e, String d, String t) {
        nombre = n;
        edad = e;
        duenio = d;
        tipo = t;
    }

    public String getDuenio() {
        return duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public String hablar() {
        return "Hola, soy una mascota!";
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Dueño: " + duenio + ", Tipo: " + tipo;
    }
}

public class Practica6pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        int opcion = 0;
        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Adquirir una mascota");
            System.out.println("2. Ver mis mascotas");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Tipo de mascota: ");
                    System.out.println("1. Domestica");
                    System.out.println("2. Exotica");
                    System.out.print("Ingrese una opcion: ");
                    int tipoMascota = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre de la mascota: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese la edad de la mascota: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el duenio de la mascota: ");
                    String duenio = scanner.nextLine();

                    if (tipoMascota == 1) {
                        System.out.println("Tipo de domestica: ");
                        System.out.println("1. Perro");
                        System.out.println("2. Gato");
                        System.out.print("Ingrese una opcion: ");
                        int tipoDomestica = scanner.nextInt();
                        scanner.nextLine();

                        if (tipoDomestica == 1) {
                            mascotas.add(new Perro(nombre, edad, duenio));
                        } else if (tipoDomestica == 2) {
                            mascotas.add(new Gato(nombre, edad, duenio));
                        }
                    } else if (tipoMascota == 2) {
                        System.out.println("Tipo de exotica: ");
                        System.out.println("1. Vibora");
                        System.out.println("2. Tigre");
                        System.out.println("3. Dinosaurio");
                        System.out.print("Ingrese una opcion: ");
                        int tipoExotica = scanner.nextInt();
                        scanner.nextLine();

                        if (tipoExotica == 1) {
                            mascotas.add(new Vibora(nombre, edad, duenio));
                        } else if (tipoExotica == 2) {
                            mascotas.add(new Tigre(nombre, edad, duenio));
                        } else if (tipoExotica == 3) {
                            System.out.print("Ingrese el tipo de dinosaurio: ");
                            String tipo = scanner.nextLine();
                            mascotas.add(new Dinosaurio(nombre, edad, duenio, tipo));
                        }
                    }
                    break;
                case 2:
                    if (mascotas.size() == 0) {
                        System.out.println("Aun no has adquirido ninguna mascota :c");
                    } else {
                        System.out.println("Todas tus mascotas:");
                    for (Mascota mascota : mascotas) {
                        System.out.println(mascota.toString());
                            }
            }
    break;
                case 3:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opcion invalida!");
                    break;
            }

        } while (opcion != 3);
    }
}