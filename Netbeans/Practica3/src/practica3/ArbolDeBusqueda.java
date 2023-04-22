/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author rafyt
 */
public class ArbolDeBusqueda {
    Nodo raiz;
    public ArbolDeBusqueda(){
        raiz=null;
    }
    //Metodos para Insertar un Nodo
    public void agregarNodo(int d, String nom){
        Nodo nuevo = new Nodo(d, nom);
        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo auxiliar=raiz;
            Nodo papu;
            while(true){
                papu=auxiliar;
                if(d<auxiliar.dato){
                    auxiliar=auxiliar.Izquierdo;
                    if(auxiliar==null){
                        papu.Izquierdo=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.Derecho;
                    if(auxiliar==null){
                        papu.Derecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
}
