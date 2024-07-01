package dev.diego;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Se crea una instancia de Scanner para leer la entrada del usuario.
        Random random = new Random(); //Se crea una instancia de Random para generar el número aleatorio.
        
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        int intentos = 0;
        int numeroUsuario = 0; //Se inicializan las variables para los intentos y el número introducido por el usuario.

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He generado un número entre 1 y 100. ¿Puedes adivinar cuál es?"); //Se muestra un mensaje de bienvenida.
        
        while (numeroUsuario != numeroAleatorio) { //Se usa un bucle while que continúa hasta que el usuario adivine el número.
            System.out.print("Introduce tu número: "); //Se solicita al usuario que introduzca un número.
            numeroUsuario = scanner.nextInt();
            intentos++; //Se incrementa el contador de intentos.
            
            if (numeroUsuario < numeroAleatorio) { //Se proporcionan pistas si el número es mayor o menor.
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos."); //Si el usuario adivina el número, se muestra un mensaje de felicitación y se sale del bucle
            }
        }

        scanner.close();
    }
}
