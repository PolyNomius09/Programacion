/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

/**
 * Vigilante.java
 * Examen
 * @author Rafael Lopez Olvera
 * date 2023-03-15
 */
public class Vigilante {
    private String nombre;
    private String turno;

    public Vigilante(String nombre, String turno) {
        this.nombre = nombre;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTurno() {
        return turno;
    }
}