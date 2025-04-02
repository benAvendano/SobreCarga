/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacion1;

/**
 *
 * @author Alumnos
 */
public class Evaluacion1 {

    public static void main(String[] args) {
        
        // Crear objetos usando diferentes constructores sobrecargados
        Persona persona1 = new Persona("pepe", 25,"Activo"); // Constructor con nombre y edad
        Persona persona2 = new Persona("goku"); // Constructor con solo nombre
        Persona persona3 = new Persona(); // Constructor por defecto

        // Mostrar la información de las personas creadas
        persona1.mostrarInfo();
        persona2.mostrarInfo();
        persona3.mostrarInfo();
    }

}
