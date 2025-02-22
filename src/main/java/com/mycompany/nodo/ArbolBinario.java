/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodo;

import java.util.Scanner;

public class ArbolBinario {
    // Nodo de un árbol binario
    class Nodo {
        int valor;
        Nodo izquierdo, derecho;

        public Nodo(int item) {
            valor = item;
            izquierdo = derecho = null;
        }
    }

    // Raíz del árbol
    Nodo raiz;

    // Método para insertar un nodo con ramas (nodo con hijos izquierdo y derecho)
    public void insertarRama() {
        raiz = insertarRamaRecursivo(raiz);
    }

    // Método recursivo para insertar un nodo con ramas
    private Nodo insertarRamaRecursivo(Nodo raiz) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del nodo (con posibles ramas): ");
        int valor = scanner.nextInt();
        Nodo nuevoNodo = new Nodo(valor);

        System.out.print("¿Desea agregar un hijo izquierdo a " + valor + "? (si/no): ");
        String respuesta = scanner.next();

        if ("si".equalsIgnoreCase(respuesta)) {
            nuevoNodo.izquierdo = insertarRamaRecursivo(nuevoNodo.izquierdo);  // Llamada recursiva para hijo izquierdo
        }

        System.out.print("¿Desea agregar un hijo derecho a " + valor + "? (si/no): ");
        respuesta = scanner.next();

        if ("si".equalsIgnoreCase(respuesta)) {
            nuevoNodo.derecho = insertarRamaRecursivo(nuevoNodo.derecho);  // Llamada recursiva para hijo derecho
        }

        // Si no desea hijos, el nodo será simplemente una rama sin hojas.
        return nuevoNodo; // Devuelve el nodo con sus ramas
    }

    // Método para recorrer el árbol en preorden
    public void recorrerPreorden() {
        recorrerPreordenRecursivo(raiz);
    }

    // Método recursivo para recorrer el árbol en preorden
    private void recorrerPreordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " "); // Procesar el nodo
            recorrerPreordenRecursivo(nodo.izquierdo); // Recorrer subárbol izquierdo
            recorrerPreordenRecursivo(nodo.derecho);  // Recorrer subárbol derecho
        }
    }
}
