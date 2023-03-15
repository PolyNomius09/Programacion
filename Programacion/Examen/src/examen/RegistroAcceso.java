/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

/**
 * RegistroAcceso.java
 * Examen
 * @author Rafael Lopez Olvera
 * date 2023-03-15
 */
public class RegistroAcceso {
    private ArrayList<Empleado> listaEmpleados;
    private Vigilante vigilante;
    private Date fecha;
    private ArrayList<Empleado> listaAsistencia;

    public RegistroAcceso(ArrayList<Empleado> listaEmpleados, Vigilante vigilante, Date fecha) {
        this.listaEmpleados = listaEmpleados;
        this.vigilante = vigilante;
        this.fecha = fecha;
        this.listaAsistencia = new ArrayList<>();
    }

    public void registrarAsistencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de empleado:");
        int numEmpleado = scanner.nextInt();
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNumEmpleado() == numEmpleado) {
                listaAsistencia.add(empleado);
                System.out.println("Asistencia registrada para " + empleado.getNombre());
                return;
            }
        }
        System.out.println("No se encontró un empleado con ese número.");
    }

    public void mostrarAsistencia() {
        System.out.println("Asistencia del día " + fecha);
        for (Empleado empleado : listaAsistencia) {
            System.out.println(empleado.getNombre() + " - " + empleado.getDepartamento());
        }
    }
}
