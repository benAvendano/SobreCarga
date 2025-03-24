package com.mycompany.suma;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        
        int user;
        int NumeroAletorio = (int) (Math.random() * 101); 
        int contador = 0;  
        System.out.println("Numero escogido "+NumeroAletorio);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingresa un numero (intento " + (contador + 1) + "): ");
            user = scanner.nextInt();
            contador++; 

            if (user == NumeroAletorio) {
                System.out.println("Acertaste El numero era " + NumeroAletorio);
            } else if (user < NumeroAletorio){
                System.out.println("El numero es mayor");
            } else if (user > NumeroAletorio){
                System.out.println("El numero es menor");
            }
        } while (user == NumeroAletorio); 
    }
}
