/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobrecarga;

/**
 *
 * @author hperr
 */
public class Persona {
    private String nombre;
    private  int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 33;
    }

    // Constructor con solo nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 22; // Edad por defecto
    }

    // Constructor con nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
