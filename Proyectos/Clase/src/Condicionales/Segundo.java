package Condicionales;

import java.util.Scanner;
    
public class Segundo {
    private static int totalUnidad;
    private static int cantidad;

    public static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se compran de cinco a 10 y de U$50 si se compran más de 10.");
        System.out.println("_____Cuantos llantas va a comprar______");
        
        do {
            cantidad = entrada.nextInt();
            if (cantidad <= 0) {
                System.out.println("Error en la cantidad ingresada");//rectificar que el numero sea positivo
            }
        } while (cantidad <= 0);

        if (cantidad < 5) {
            int valor = 100;
            totalUnidad = valor * cantidad;
            System.out.println("Vas a comprar " + cantidad + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra es: U$" + totalUnidad);
        } else {
            if (cantidad < 10) {
                int valor = 75;
                totalUnidad = valor * cantidad;
                System.out.println("Vas a comprar " + cantidad + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra es: U$" + totalUnidad);
            } else {
                int valor = 50;
                totalUnidad = valor * cantidad;
                System.out.println("Vas a comprar " + cantidad + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra es: U$" + totalUnidad);
            }
        }
    }
}
// En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
// en lo siguiente:
// • Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
// compran de cinco a 10 y de U$50 si se compran más de 10.
// • Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
// que compra y la que tiene que pagar por el total de la compra.