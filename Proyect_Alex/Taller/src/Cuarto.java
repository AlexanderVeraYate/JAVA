import java.util.Scanner;

public class Cuarto {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double Total = 0;
        float Kilo = 3000;
        System.out.print("cuantas frutas va a comprar ($3000 pesos el kilo)");
        Double Compra = Entrada.nextDouble();

        if (Compra <= 2) {
            Total = Compra * Kilo;
            System.out.println("el valor total fue: " + Total + " Pesos");

        } else if (Compra <= 5) {

            Total = Compra * Kilo;
            Total = Total - (Total * 10) / 100;
            System.out.println("el valor total fue: " + Total + " Pesos");

        } else if (Compra <= 10) {
            Total = Compra * Kilo;
            Total = Total - (Total * 15) / 100;
            System.out.println("el valor total fue: " + Total + " Pesos");

        } else {
            Total = Compra * Kilo;
            Total = Total - (Total * 20) / 100;
            System.out.println("el valor total fue: " + Total + " Pesos");

        }
    }
}
// Una frutería ofrece las manzanas con descuento según la siguiente tabla:
// NUM. DE KILOS COMPRADOS % DESCUENTO
// 0-2        0%
// 2.01-5     10%
// 5.01-10    15%
// 10.01 en adelante 20%
// Determinar cuánto pagara una persona que compre manzanas es esa frutería.
