
import java.util.Scanner;

public class Cuarto {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int Total = 0;
        int Kilo = 30;
        System.out.println("cuantas frutas va a comprar (30 pesos el kilo)");
        int Compra = Entrada.nextInt();

        if (Compra <= 2) {
            Total = Compra * Kilo;
            System.out.println("el valor total fue: " + Total);

        } else if (Compra <= 5) {

            Total = Compra * Kilo;
            Total = Total - (Total * 10) / 100;
            System.out.println("el valor total fue: " + Total);

        } else if (Compra <= 10) {
            Total = Compra * Kilo;
            Total = Total - (Total * 15) / 100;
            System.out.println("el valor total fue: " + Total);

        } else {
            Total = Compra * Kilo;
            Total = Total - (Total * 20) / 100;
            System.out.println("el valor total fue: " + Total);

        }

    }

}

// Una frutería ofrece las manzanas con descuento según la siguiente tabla:
// NUM. DE KILOS COMPRADOS % DESCUENTO
// 0 - 2 0%
// 2.01 - 5 10%
// 5.01 - 10 15%
// 10.01 en adelante 20%
// Determinar cuánto pagara una persona que compre manzanas es esa frutería.
