package Condicionales;

import java.util.Scanner;

public class Cuarto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        float kilo = 3000;
        System.out.print("cuantas frutas va a comprar ($3000 pesos el kilo)");
        Double compra = entrada.nextDouble();

        if (compra <= 2) {
            total = compra * kilo;
            System.out.println("el valor total fue: " + total + " Pesos");

        } else if (compra <= 5) {

            total = compra * kilo;
            total = total - (total * 10) / 100;
            System.out.println("el valor total fue: " + total + " Pesos");

        } else if (compra <= 10) {
            total = compra * kilo;
            total = total - (total * 15) / 100;
            System.out.println("el valor total fue: " + total + " Pesos");

        } else {
            total = compra * kilo;
            total = total - (total * 20) / 100;
            System.out.println("el valor total fue: " + total + " Pesos");

        }
    }
}
// Una frutería ofrece las manzanas con descuento según la siguiente tabla:
// NUM. DE kiloS compraDOS % DESCUENTO
// 0-2        0%
// 2.01-5     10%
// 5.01-10    15%
// 10.01 en adelante 20%
// Determinar cuánto pagara una persona que compre manzanas es esa frutería.