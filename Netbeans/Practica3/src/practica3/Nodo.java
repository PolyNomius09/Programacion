/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author rafyt
 */
public class Nodo {
        int dato;
        String Nombre;
        Nodo Izquierdo, Derecho;
        public Nodo(int d, String nom){
            this.dato=d;
            this.Nombre=nom;
            this.Izquierdo=null;
            this.Derecho=null;
        }
        public String toString (){
        return Nombre + " Su Dato es " + dato;
    }
}
