package Taller;

import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.print("tipo de sangre: ");
        String sangre = Entrada.nextLine();

        System.out.print("edad: ");
        int edad = Entrada.nextInt();

        System.out.print("genero: ");
        String genero = Entrada.nextLine();

        System.out.println(sangre + " " + " " + edad + " " + genero);

        if (edad <= 5) {

            System.out.println("el nivel de hemogia es de 12,6 - 15,5g%");

        } else {

        }
    }
}

// Tomando como base los resultados obtenidos en un laboratorio de análisis
// clínicos, un médico
// determina si una persona tiene anemia o no, lo cual depende de su nivel de
// hemoglobina en la
// sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una
// persona es menor
// que el rango que le corresponde, se determina su resultado como positivo y en
// caso contrario
// como negativo. La tabla en la que el medico se basa para obtener el resultado
// es la siguiente:

// EDAD NIVEL HEMOGLOBINA
// 0 - 1 mes 13 - 26 g%
// > 1 y < = 6 meses 10 - 18 g%
// > 6 y < = 12 meses 11 - 15 g%
// > 1 y < = 5 años 11.5 - 15 g%
// > 5 y < = 10 años 12.6 - 15.5 g%
// > 10 y < = 15 años 13 - 15.5 g%
// Mujeres > 15 años 12 - 16 g%
// Hombres > 15 años 14 - 18 g%