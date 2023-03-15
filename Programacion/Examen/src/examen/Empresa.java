/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import examen.RegistroAcceso;

/**
 * Empresa.java
 * Examen
 * @author Rafael Lopez Olvera
 * date 2023-03-15
 */
public class Empresa {
    private ArrayList<Empleado> listaEmpleados;
    private Vigilante vigilante;
    private Date fecha;

    public Empresa() {
        this.listaEmpleados = new ArrayList<>();
        this.vigilante = null;
        this.fecha = new Date();
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("Empleado agregado correctamente.");
    }

    public void registrarVigilante(Vigilante vigilante) {
        this.vigilante = vigilante;
        if (vigilante == null) {
            System.out.println("No se ha registrado un vigilante.");
            return;
        }
        System.out.println("Vigilante registrado correctamente.");
    }

    public void registrarAsistencia() {
        RegistroAcceso registroAcceso = new RegistroAcceso(listaEmpleados, vigilante, fecha);
        Scanner scanner = new Scanner(System.in);
        registroAcceso.registrarAsistencia();
        
        }
    
    public void mostrarAsistencia(){
        RegistroAcceso registroAcceso = new RegistroAcceso(listaEmpleados, vigilante, fecha);
        Scanner scanner = new Scanner(System.in);
        registroAcceso.mostrarAsistencia();
    }

public static void main(String[] args) {
    Empresa empresa = new Empresa();
    Empleado empleado1 = new Empleado("Juan", 1, "Sistemas");
    Empleado empleado2 = new Empleado("Maria", 2, "Recursos Humanos");
    empresa.agregarEmpleado(empleado1);
    empresa.agregarEmpleado(empleado2);
    Vigilante vigilante = new Vigilante("Pedro", "Matutino");
    empresa.registrarVigilante(vigilante);
    empresa.registrarAsistencia();
    empresa.mostrarAsistencia();
    }
}
