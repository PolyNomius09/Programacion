/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotasexoticas.*;
import mascotasdomesticas.*;
import mascota.mascota;

/**
 * BaseDeDatos.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public class BaseDeDatos implements Serializable {
    private List<Gato> miau;
    private List<Perro> guaus;
    private List<Brontosaurio> aaaah;
    private List<Raptor> grrr;
    private List<TRex> roar;
    private List<Tigre> miaugrande;
    private List<Vibora> shhhh;

    public BaseDeDatos() {
        miau = new ArrayList<>();
        guaus = new ArrayList<>();
        aaaah = new ArrayList<>();
        grrr = new ArrayList<>();
        roar = new ArrayList<>();
        miaugrande = new ArrayList<>();
        shhhh = new ArrayList<>();
    }

    public void guardarDatos() {
        try {
            FileOutputStream fileOut = new FileOutputStream("basededatos.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Se han guardado los datos en 'basededatos.ser'.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public BaseDeDatos cargarDatos() {
        try {
            FileInputStream fileIn = new FileInputStream("basededatos.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            BaseDeDatos datosCargados = (BaseDeDatos) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Se han cargado los datos desde 'basededatos.ser'.");
            return datosCargados;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo cargar los datos: " + e.getMessage());
            return null;
        }
    }

    public void agregarGato(Gato gato) {
        miau.add(gato);
    }

    public void agregarPerro(Perro perro) {
        guaus.add(perro);
    }

    public void agregarBrontosaurio(Brontosaurio bronto) {
        this.aaaah.add(bronto);
    }

    public void agregarRaptor(Raptor raptor) {
        grrr.add(raptor);
    }

    public void agregarTRex(TRex trex) {
        roar.add(trex);
    }

    public void agregarTigre(Tigre tigre) {
        miaugrande.add(tigre);
    }

    public void agregarVibora(Vibora vibora) {
        shhhh.add(vibora);
    }

    public Gato venderGato() {
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Gato aux;

        System.out.println("Gatos disponibles:");
        System.out.println("");
        if (!miau.isEmpty()) {
            for (int i = 0; i < miau.size(); ++i) {
                aux = miau.get(i);
                System.out.println("Gato número: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("");
            }
            System.out.print("Elige el gato que quieres comprar (ingresa el número): ");
            indice = in.nextInt();
            in.nextLine();
            if (indice > 0 && indice <= miau.size()) {
                return miau.remove(indice - 1);
            } else {
                System.out.println("Opción inválida.");
            }
        } else {
            System.out.println("No hay gatos disponibles.");
        }

        return null;
    }

    public Perro venderPerro() {
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Perro aux;

        System.out.println("Perros disponibles");
        System.out.println("");
        if (!guaus.isEmpty()) {
            for (int i = 0; i < guaus.size(); ++i) {
                aux = guaus.get(i);
                System.out.println("Perro numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de ternura: " + aux.getFactorTernura());
            }
            System.out.println("Elegir el numero de perro a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = guaus.get(indice);
            guaus.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }

    public Brontosaurio venderBrontosaurio() {
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Brontosaurio aux;

        System.out.println("Brontosaurio disponibles");
        System.out.println("");
        if (!aaaah.isEmpty()) {
            for (int i = 0; i < aaaah.size(); ++i) {
                aux = aaaah.get(i);
                System.out.println("Brontosaurio numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de brontosaurio a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = aaaah.get(indice);
            aaaah.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }

    public Raptor venderRaptor() {
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Raptor aux;

        System.out.println("Raptores disponibles");
        System.out.println("");
        if (!grrr.isEmpty()) {
            for (int i = 0; i < grrr.size(); ++i) {
                aux = grrr.get(i);
                System.out.println("Raptor numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de raptor a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = grrr.get(indice);
            grrr.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }

    public TRex venderTRex() {
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        TRex aux;

        System.out.println("TRex disponibles");
        System.out.println("");
        if (!roar.isEmpty()) {
            for (int i = 0; i < roar.size(); ++i) {
                aux = roar.get(i);
                System.out.println("TRex numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de TRex a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = roar.get(indice);
            roar.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }

    public Tigre venderTigre() {
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Tigre aux;

        System.out.println("Tigres disponibles");
        System.out.println("");
        if (!miaugrande.isEmpty()) {
            for (int i = 0; i < miaugrande.size(); ++i) {
                aux = miaugrande.get(i);
                System.out.println("Tigre numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de tigre a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = miaugrande.get(indice);
            miaugrande.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }

    public Vibora venderVibora() {
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Vibora aux;

        System.out.println("Vibora disponibles");
        System.out.println("");
        if (!shhhh.isEmpty()) {
            for (int i = 0; i < shhhh.size(); ++i) {
                aux = shhhh.get(i);
                System.out.println("Vibora numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de vibora a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = shhhh.get(indice);
            shhhh.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }
}