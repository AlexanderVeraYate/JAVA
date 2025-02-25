
import java.util.Scanner;

public class Taller_2 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Valor de la tabla a generar");
        int valor = Entrada.nextInt();
        System.out.print("Numero de terminos");
        int terminos = Entrada.nextInt();

        // for (int ciclo = 1; ciclo <= terminos; ciclo++) {
        //     System.out.println(valor + "*" + ciclo + "= " + (valor * ciclo));
        // }

        //
        int ciclo = 1;
        while (ciclo<=terminos) {
            System.out.println(valor + "*" + ciclo + "= " + (valor * ciclo));
            ciclo++;

            
        }

    }
}
