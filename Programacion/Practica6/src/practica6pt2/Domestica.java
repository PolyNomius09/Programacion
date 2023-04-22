/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6pt2;

/**
 *
 * @author rafyt
 */

//Clase Hija Domestica
class Domestica extends Mascota {
    protected int factorTernura;

    public Domestica(String n, int e, String d, String t) {
        super(n, e, d, t);
    }

    public int getFactorTernura() {
        return factorTernura;
    }

    public void setFactorTernura(int f) {
        factorTernura = f;
    }

    public String toString() {
        return super.toString() + ", Factor de Ternura: " + factorTernura;
    }
}

//clase hija Gato
class Gato extends Domestica {
    public Gato(String n, int e, String d) {
        super(n, e, d, "Gato");
    }

    public String hablar() {
        return "Miau!";
    }
}

//Clase hija Perro
class Perro extends Domestica {
    public Perro(String n, int e, String d) {
        super(n, e, d, "Perro");
    }

    public String hablar() {
        return "Guau!";
    }
}