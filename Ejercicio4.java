package boletin1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        long radio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        radio = teclado.nextInt();
        System.out.println("El área del círculo es: " + (Math.PI * (radio * radio)));
        System.out.println("El perímetro es");
    }
    
}
