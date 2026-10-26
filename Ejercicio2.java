package boletin1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        float num; 
        Scanner teclado = new Scanner(System.in);
        
            System.out.print("Introduce un número entero: ");
            num = teclado.nextInt();
            System.out.println("El resultado de la multiplicación: " + (num * num));
    }
}
