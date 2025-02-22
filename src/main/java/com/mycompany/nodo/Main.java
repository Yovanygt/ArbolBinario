/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de ArbolBinario
        ArbolBinario arbol = new ArbolBinario();
        
        // Insertamos nodos en el árbol
        arbol.insertarRama();
        
        // Mostrar el árbol en preorden
        System.out.println("Recorrido en Preorden del Árbol:");
        arbol.recorrerPreorden();
    }
}

