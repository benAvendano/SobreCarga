/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion1;

/**
 *
 * @author Alumnos
 */
public class Persona {
    // Clase Persona con diferentes constructores sobrecargados

    private String nombre;
    private  int edad;
    private String estatus;
    // Constructor por defecto
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 33;
        this.estatus= "Activo";
    }

    // Constructor con solo nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 22; // Edad por defecto
        this.estatus= "Desactivado";
    }

    // Constructor con nombre y edad
    public Persona(String nombre, int edad, String estatus) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatus= estatus;
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Estado: " + estatus);
    }
}

