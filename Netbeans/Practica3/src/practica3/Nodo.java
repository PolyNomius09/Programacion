/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 * Nodo.java
 * Practica 3 Programa 1
 * @author Rafael Lopez Olvera
 * date 2023-04-17
 * EDD
 */
public class Nodo {
    
    private int valores;
    private int conteo;
    private Nodo NodoIzquierdo;
    private Nodo NodoDerecho;
    
    //Constructor del nodo (ArbolDeBusqueda).

    public Nodo(int valores){
        this.valores = valores;
        this.conteo = 1;
        this.NodoIzquierdo = null;
        this.NodoDerecho = null;
    }

    //Functon dar valor al Nodo
    public void setValor(int valores) {
        this.valores = valores;
    }
    
    //Constructor para obtener los valores del Nodo
    public int getValor() {
        return valores;
    }

    //Constructor´para obtener el Nodo Derecho
    public Nodo getNodoDerecho() {
        return NodoDerecho;
    }
    
    //Constructor´para obtener el Nodo Izquierdo
    public Nodo getNodoIzquierdo() {
        return NodoIzquierdo;
    }
    
    //Funcion que inserta n Nodo (ArbolDeBusqueda)
    public void InsertarNodo(int valores){
        if(valores == this.valores){
            this.conteo++;
            return;
        }
        if(valores < this.valores){
            if(this.NodoIzquierdo == null){
                this.NodoIzquierdo = new Nodo(valores);
            }else{
                this.NodoIzquierdo.InsertarNodo(valores);
            }
        }else{
            if(this.NodoDerecho == null){
                this.NodoDerecho = new Nodo(valores);
            }else{
                this.NodoDerecho.InsertarNodo(valores);
            }
        }   
    }
}
