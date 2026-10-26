package boletin1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int num;
        Scanner teclado = new Scanner(System.in);


            System.out.print("Introduce un número entero: ");
            num = teclado.nextInt();

            System.out.println("El doble es: " + (num * 2));
            System.out.println("El triple es: " + (num * 3));

        teclado.close();

    }
    
}
