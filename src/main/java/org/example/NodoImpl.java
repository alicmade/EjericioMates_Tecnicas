package org.example;

public class NodoImpl  implements Nodo{
    private datoPolinomio dato;
    private Nodo siguiente;

    public NodoImpl (datoPolinomio dato)  {
        this.dato = dato;
        this.siguiente = null;
    }

    public datoPolinomio getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo nodo) {
        siguiente = nodo;
    }
}
