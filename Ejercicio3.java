package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        String nombre;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = teclado.next();
        System.out.println("El nombre introducido es: " + (nombre));
    }
    
}
