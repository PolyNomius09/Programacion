/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import java.io.*;
import CajaRegistradora.CajaRegistradora;

/**
 *
 * @author rafyt
 */
public class BaseDatos {
    private String nombreArchivo;

    public BaseDatos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void guardarDatos(CajaRegistradora cajaRegistradora) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            escritor.writeObject(cajaRegistradora);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en la base de datos");
            e.printStackTrace();
        }
    }

    public CajaRegistradora cargarDatos() {
        CajaRegistradora cajaRegistradora = null;
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(nombreArchivo));
            cajaRegistradora = (CajaRegistradora) lector.readObject();
            lector.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos desde la base de datos");
            e.printStackTrace();
        }
        return cajaRegistradora;
    }
}