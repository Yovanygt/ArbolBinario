/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodo;

/**
 *
 * @author Yovany
 */
public class NodoArbol {
    int dato;
    NodoArbol izquierdo;
    NodoArbol derecho;
    
    // Constructor para crear un nodo con un valor
    public NodoArbol(int dato){
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
    
}
