package Repetitivas;

import java.util.Scanner;

public class Catorce {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        String[] Carro = {"","Auto", "SUV", "Camioneta"};
        String[] Color = {"", "Blanco", "Negro", "Rojo"};

        System.out.println("____Menu____");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        System.out.print("Escoge el tipo de auto: ");
        int Tipo = Entrada.nextInt();

        System.out.println(" ");
        System.out.println("____color____");
        System.out.println("1. blanco");
        System.out.println("2. negro");
        System.out.println("3. rojo");
        System.out.print("Escoge el color del auto: ");
        int Pintura= Entrada.nextInt();

        System.out.println("el carro es un "+Carro[Tipo]+" y tiene la pintura " + Color[Pintura]);


    }

}


// Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
// camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
// Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
// de selección múltiple dentro de otra.
