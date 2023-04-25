/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3pt2;

/**
 * Nodo2.java
 * Practica 3 Programa 2
 * @author Rafael Lopez Olvera
 * date 2023-04-17
 * EDD
 */
public class Nodo2 {
    
    private int valor;
    private int bf;
    private int contador;
    private Nodo2 NodoIzquierdo;
    private Nodo2 NodoDerecho;
    
    //Constructor del nodo (ArbolDeBusquedaAVL)
    public Nodo2(int valor){
        this.valor = valor;
        this.bf = 0;
        this.contador = 1;
        this.NodoIzquierdo = null;
        this.NodoDerecho = null;
    }
    
    //Funcion que obtiene el valor del Nodo.
    public int getValor() {
        return valor;
    }
    
    //Funcion que otorga el valor del Nodo.
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //Funcion que obtiene el factor de equilibrio.
    public int getBf(){
        return bf;
    }
    
    //Funcion que otorga el factor de equilibrio.
    public void setBf(int bf){
        this.bf = bf;
    }
        
    //Funcion para obtener el valor de los Nodos Repetidos
    public int getContador(){
        return this.contador;
    }
    
    //Funcion que otorga el nuevo valor a los nodos repetidos.
    public void setContador(int contador){
        this.contador = contador;
    }
    
    //Fncion que obtiene el Nodo Izquierdo
    public Nodo2 getNodoIzquierdo() {
        return NodoIzquierdo;
    }
    
    //Funcion que otorga el Nodo Izquierdo
    public void setNodoIzquierdo(Nodo2 NodoIzquierdo){
        this.NodoIzquierdo = NodoIzquierdo;
    }

    //Funcion que otorga el Nodo Derecho
    public void setNodoDerecho(Nodo2 NodoDerecho){
        this.NodoDerecho = NodoDerecho;
    }
    
    //Funcion pra Obterner el Nodo Derecho
    public Nodo2 getNodoDerecho() {
        return NodoDerecho;
    }
}
