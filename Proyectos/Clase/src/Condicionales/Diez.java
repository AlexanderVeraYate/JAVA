package Condicionales;

import java.util.Scanner;

public class Diez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int salario = 5000, salarioTotal = 0, tiempoExtra = 0, extra = 0, salarioExtra = 0;

        System.out.print("cuantas horas trabajo: ");
        int tiempo = entrada.nextInt();

        if (tiempo < 40) {
            salarioTotal = salario * tiempo;
            System.out.println("su pago total es de: $" + salarioTotal);

        } else {
            tiempoExtra = tiempo - 40; //bien
            salarioExtra = salario * tiempoExtra; //bien
            extra = (salarioExtra * 20) / 100;
            salarioTotal = (salario * 40) + extra;//el salario x 40 es 200.000
            System.out.println("su pago total es de: $" + salarioTotal);
        }
    }
}

// Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
// • Si trabaja 40 horas o menos se le paga $5000 por hora
// • Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
// aumento del 20% por cada hora extra.
