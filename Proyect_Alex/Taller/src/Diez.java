package Taller;

import java.util.Scanner;

public class Diez {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int Salario = 5000, SalarioTotal = 0, TiempoExtra=0, Extra=0,SalarioExtra=0;

        System.out.print("cuantas horas trabajo: ");
        int Tiempo = Entrada.nextInt();

        if (Tiempo < 40) {
            SalarioTotal = Salario * Tiempo;
            System.out.println("su pago total es de: $" + SalarioTotal);

        } else {
            TiempoExtra= Tiempo - 40; //bien
            SalarioExtra= Salario*TiempoExtra; //bien
            Extra= (SalarioExtra*20)/100;
            SalarioTotal = (Salario * 40)+Extra;//el salario x 40 es 200.000
            System.out.println("su pago total es de: $" + SalarioTotal);
        }
    }
}

// Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
// • Si trabaja 40 horas o menos se le paga $5000 por hora
// • Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
// aumento del 20% por cada hora extra.
