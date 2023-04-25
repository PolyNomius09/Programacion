/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3pt2;

/**
 * ArbolDeBusquedaAVL.java
 * Practica 3 Programa 2
 * @author Rafael Lopez Olvera
 * date 2023-04-17
 * EDD
 */
public class ArbolDeBusquedaAVL {
    
    private Nodo2 inicial;
    
    //Constructor pra el ArbolDeBusquedaAVL
    public ArbolDeBusquedaAVL(){
        this.inicial = null;
    }
    
    //
    public Nodo2 Busqueda(int Valor){
        return this.BuscarNodo(Valor, this.inicial);
    }
    
    //Funcion recursiva para buscar un Nodo
    private Nodo2 BuscarNodo(int Valor, Nodo2 buscar){
        if(buscar == null) return null;
        if(buscar.getValor() == Valor){
            return buscar;
        }else if(Valor < buscar.getValor()){
            return this.BuscarNodo(Valor, buscar.getNodoIzquierdo());
        }else{
            return this.BuscarNodo(Valor, buscar.getNodoDerecho());
        }
    }
    
    //Funcion para rotar doblemente a la izquierda
    private Nodo2 RotacionIzq(Nodo2 nodos){
        Nodo2 aux = nodos.getNodoIzquierdo();
        nodos.setNodoIzquierdo(aux.getNodoDerecho());
        aux.setNodoDerecho(nodos);
        nodos.setBf(Math.max(ObtenerBf(nodos.getNodoIzquierdo()), ObtenerBf(nodos.getNodoDerecho())) + 1);
        aux.setBf(Math.max(ObtenerBf(aux.getNodoIzquierdo()), ObtenerBf(aux.getNodoDerecho())) + 1);
        return aux;
    }
    
    //Funcion para rotar a la derecha
    private Nodo2 RotacionDer(Nodo2 nodo){
        Nodo2 aux = nodo.getNodoDerecho();
        nodo.setNodoDerecho(aux.getNodoIzquierdo());
        aux.setNodoIzquierdo(nodo);
        nodo.setBf(Math.max(ObtenerBf(nodo.getNodoIzquierdo()), ObtenerBf(nodo.getNodoDerecho())) + 1);
        aux.setBf(Math.max(ObtenerBf(aux.getNodoIzquierdo()), ObtenerBf(aux.getNodoDerecho())) + 1);
        return aux;
    }
    
    //Funcion para rotar doblemente a la izquierda
    private Nodo2 RotacionDobleIzq(Nodo2 nodo){
        Nodo2 aux;
        nodo.setNodoIzquierdo(this.RotacionDer(nodo.getNodoIzquierdo()));
        aux = this.RotacionIzq(nodo);
        return aux;
    }
    
    //Funcion para rotar doblemente a la derecha
    private Nodo2 RotacionDobleDer(Nodo2 nodos){
        Nodo2 aux;
        nodos.setNodoDerecho(this.RotacionIzq(nodos.getNodoDerecho()));
        aux = this.RotacionDer(nodos);
        return aux;
    }
    
    //Funcion que añade un nodo
    public void InsertarElNodo(int Valor){
        Nodo2 aux = this.Busqueda(Valor);
        if(aux != null){
            aux.setContador(aux.getContador() + 1);
        }else{
            Nodo2 NodoN = new Nodo2(Valor);
            if(inicial == null){
                inicial = NodoN;
            }else{
                inicial = this.InsertarNodo2(NodoN, inicial);
            }
        }
    }
    
    //Funcion para insertar nuevos elementos dentro del árbol binario
    private Nodo2 InsertarNodo2(Nodo2 NodoN, Nodo2 subArbol){
        Nodo2 PadreN = subArbol;
        if(NodoN.getValor() < subArbol.getValor()){
            if(subArbol.getNodoIzquierdo() == null){
                subArbol.setNodoIzquierdo(NodoN);
            }else{
                subArbol.setNodoIzquierdo(this.InsertarNodo2(NodoN, subArbol.getNodoIzquierdo()));
                if(ObtenerBf(subArbol.getNodoIzquierdo()) - ObtenerBf(subArbol.getNodoDerecho()) == 2){
                    if(NodoN.getValor() < subArbol.getNodoIzquierdo().getValor()){
                        PadreN = this.RotacionIzq(subArbol);
                    }else{
                        PadreN = this.RotacionDobleDer(subArbol);
                    }
                }
            }
        }else if(NodoN.getValor() > subArbol.getValor()){
            if(subArbol.getNodoDerecho() == null){
                subArbol.setNodoDerecho(NodoN);
            }else{
                subArbol.setNodoDerecho(this.InsertarNodo2(NodoN, subArbol.getNodoDerecho()));
                if(ObtenerBf(subArbol.getNodoDerecho()) - ObtenerBf(subArbol.getNodoIzquierdo()) == 2){
                    if(NodoN.getValor() > subArbol.getNodoDerecho().getValor()){
                        PadreN = this.RotacionDer(subArbol);
                    }else{
                        PadreN = this.RotacionDobleDer(subArbol);
                    }
                }
            }
        }
        
        if((subArbol.getNodoIzquierdo() == null) && (subArbol.getNodoDerecho() != null)){
            subArbol.setBf(subArbol.getNodoDerecho().getBf() + 1);
        }else if((subArbol.getNodoDerecho() == null) && (subArbol.getNodoIzquierdo() != null)){
            subArbol.setBf(subArbol.getNodoIzquierdo().getBf() + 1);
        }else{
            subArbol.setBf(Math.max(ObtenerBf(subArbol.getNodoIzquierdo()), ObtenerBf(subArbol.getNodoDerecho())) + 1);
        }
        
        return PadreN;
    }
    
    //Funcion para imprimir valores usando prefijos.
    public void Prefijo(){
        this.PrefijoArbol(this.inicial);
    }
    
    //Funcion que imprime al arbol usando recursion.
    private void PrefijoArbol(Nodo2 begin){
        if(begin == null){
            return;
        }else{
            System.out.print(begin.getValor() + "->");
            this.PrefijoArbol(begin.getNodoIzquierdo());
            this.PrefijoArbol(begin.getNodoDerecho());
        }
    }
    
    private int ObtenerBf(Nodo2 nodo){
        if(nodo == null){
            return -1;
        }else{
            return nodo.getBf();
        }
    }
}
