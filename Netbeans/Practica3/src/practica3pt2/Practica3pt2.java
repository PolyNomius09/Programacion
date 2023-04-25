/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3pt2;
import practica3pt2.ArbolDeBusquedaAVL;
import practica3pt2.Nodo2;
import java.util.Random;

/**
 * Main.java
 * Practica 3 Programa 2
 * @author Rafael Lopez Olvera
 * date 2023-04-17
 * EDD
 */
public class Practica3pt2 {
    /**
     * Function for executing main class.
     * @param args Arguments for running main.
     */
    public static void main(String args[]){
        ArbolDeBusquedaAVL tree = new ArbolDeBusquedaAVL();
        Random rand = new Random();
        Nodo2 auxN;
        
        for(int i = 0; i < 15; ++i){
            int aux = rand.nextInt(1, 2000001);
            tree.InsertarElNodo(aux);
        }
        
        tree.Prefijo();
    }
}
