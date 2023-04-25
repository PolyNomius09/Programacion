/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 * ArbolDeBusqueda.java
 * Practica 3 Programa 1
 * @author Rafael Lopez Olvera
 * date 2023-04-17
 * EDD
 */
public class ArbolDeBusqueda {
    
    private Nodo inicial;
    
    //Constructor del arbol.
    public ArbolDeBusqueda(){
        this.inicial = null;
    }
    
    //Funcion que añade un nodo
    public void InsertarElNodo(int valores){
        if(this.inicial == null){
            this.inicial = new Nodo(valores);
        }else{
            this.inicial.InsertarNodo(valores);
        }
    }
    
    //Funcion que imprime al arbol usando recursion.
    private void PrefijoArbol(Nodo begin){
        if(begin == null){
            return;
        }else{
            System.out.print(begin.getValor() + "->");
            this.PrefijoArbol(begin.getNodoIzquierdo());
            this.PrefijoArbol(begin.getNodoDerecho());
        }
    }
    
    //Usa la funcion de recursion
    public Nodo Busqueda(int valores){
        return this.BuscarNodo(valores, this.inicial);
    }
    
    //Funcion recursiva para buscar un Nodo
    public Nodo BuscarNodo(int valores, Nodo buscar){
        if(buscar == null) return null;
        if(buscar.getValor() == valores){
            return buscar;
        }else if(valores < buscar.getValor()){
            return this.BuscarNodo(valores, buscar.getNodoIzquierdo());
        }else{
            return this.BuscarNodo(valores, buscar.getNodoDerecho());
        }
    }
    
    //Funcion para imprimir valores usando prefijos.
    public void Prefijo(){
        this.PrefijoArbol(this.inicial);
    }
    
        //Funcion para obtener el valor max.

    public int Maximo(){
        return BuscarMax(this.inicial);
    }
    
    //Funcion recursiva para hallar el valor Maximo.

    public int BuscarMax(Nodo buscar){
        if(buscar.getNodoDerecho() == null){
            return buscar.getValor();
        }else{
            return this.BuscarMax(buscar.getNodoDerecho());
        }
    }
    
    //Funcion para obtener el valor min.

    public int Minimo(){
        return BuscarMin(this.inicial);
    }
    
    //Funcion recursiva para hallar el valor Minimo.

    public int BuscarMin(Nodo buscar){
        if(buscar.getNodoIzquierdo() == null){
            return buscar.getValor();
        }else{
            return this.BuscarMin(buscar.getNodoIzquierdo());
        }
    }

}
