/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maincra;
import java.util.Scanner;
/**
 *
 * @author Alumnos
 */
public class Maincra {

    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        
        
        System.out.println("Ingresa el primer Numero:");
        Scanner scanner =new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Ingresa el primer Numero:");
        b = scanner.nextInt();
        
        c = a+b;
        
        System.out.println("La suma es" + c);
        
    }
}
