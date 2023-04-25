/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Random;
import practica3.ArbolDeBusqueda.*;
/**
 * Main.java
 * Practica 3 Programa 1
 * @author Rafael Lopez Olvera
 * date 2023-04-17
 * EDD
 */
public class Practica3 {
    public static void main(String args[]){
        
        ArbolDeBusqueda tree = new ArbolDeBusqueda();
        Random rand = new Random();
        Nodo FINN;
        
        for(int i = 0; i < 1000000; ++i){
            int opc = rand.nextInt(1, 2000001);
            tree.InsertarElNodo(opc);
        }
        
        for(int i = 0; i < 50; ++i){
            
            long begin = System.nanoTime();
            
            int opc = rand.nextInt(1, 2000001);
            
            FINN = tree.Busqueda(opc);
            
            long end = System.nanoTime();
            
            if(FINN == null){
                System.out.println("Resultado: Inexistente -- Tiempo: " + (end - begin));
            }else{
                System.out.println("Resultado: " + FINN + " -- Tiempo: " + (end - begin));
            }
        }
        
        System.out.println("Valor minimo: " + tree.Minimo());
        System.out.println("Valor maximo: " + tree.Maximo());
    }
}
