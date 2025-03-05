// package Repetitivas;

import java.util.Scanner;

public class Catorce {
    private static int tipo, pintura;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] Carro = {"","Auto", "SUV", "Camioneta"};
        String[] Color = {"", "Blanco", "Negro", "Rojo"};

        menuPrincipal(args);
        menuSecundario(args);

        System.out.println("el carro es un "+Carro[tipo]+" y tiene la pintura " + Color[pintura]);
    }

    public static void menuPrincipal(String[] args) {
        System.out.println("____Menu____");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        System.out.print("Escoge el tipo de auto: ");
        Scanner entrada = new Scanner(System.in);
        do {
            tipo = entrada.nextInt();
            if (tipo <= 0) {
                System.out.println("Error en la cantidad ingresada");
            }
        } while (tipo <= 0);
        
    }
public static void menuSecundario(String[] args) {
    System.out.println(" ");
    System.out.println("____color____");
    System.out.println("1. blanco");
    System.out.println("2. negro");
    System.out.println("3. rojo");
    System.out.print("Escoge el color del auto: ");
    Scanner entrada = new Scanner(System.in);
    do {
        pintura = entrada.nextInt();
        if (pintura <= 0) {
            System.out.println("Error en la cantidad ingresada");
        }
    } while (pintura <= 0);
    
}
}



// Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
// camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
// Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
// de selección múltiple dentro de otra.
