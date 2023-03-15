/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

/**
 * Empleado.java
 * Examen
 * @author Rafael Lopez Olvera
 * date 2023-03-15
 */
public class Empleado {
    private String nombre;
    private int numEmpleado;
    private String departamento;

    public Empleado(String nombre, int numEmpleado, String departamento) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }
}