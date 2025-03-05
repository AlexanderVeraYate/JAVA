package Repetitivas;

import java.util.Scanner;

public class Quince {

    private static int ciclo=0, nacimiento;
    private static String[] nombresBebes;
    private static String[] sexoBebes;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("cantidad de nacimientos: ");
        int nacimiento = entrada.nextInt();

        do {
            if (nacimiento <= 0) {
                System.out.println("Error en la cantidad ingresada");
            }
        }while (nacimiento <= 0);

        nombresBebes = new String[nacimiento];
        sexoBebes = new String[nacimiento];

        do {
            System.out.println("");
            entrada.nextLine();
            System.out.print("ingrese el nombre del bebe: ");
            nombresBebes[ciclo] = entrada.nextLine();

            System.out.print("ingrese el sexo del bebe: ");
            sexoBebes[ciclo] = entrada.nextLine();
            
            ciclo++;
        } while (ciclo < nacimiento);

        for (int i = 0; i < nacimiento; i++) {
            System.out.println("______________");
            System.out.println((i+1)+ " el nombre es: " + nombresBebes[i] + " y su sexo es: " + sexoBebes[i]);
        }

    }

}

// Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido
// recientemente. Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N), el
// nombre de cada bebé y su sexo (implemente un ciclo do-while para validar la captura, siendo M

// para masculino y F para femenino). Al final, debe imprimir la cantidad de bebés de cada sexo.
