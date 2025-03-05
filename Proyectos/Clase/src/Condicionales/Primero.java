package Condicionales;

import java.util.Scanner;

public class Primero {
    //version3.0
    private static int valor = 500;
    private static int total;
    private static int porcentaje;
    private  static int numComputadoras;
    //para usarlo en la misma class
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Si las computadoras son menos de cinco se les dará un 10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un 40% de descuento. El precio de cada computadora es de U$500.");
        System.out.println("_____Cuantos computadores va a comprar______");
        do {
            numComputadoras = entrada.nextInt();
            if (numComputadoras <= 0) {
                System.out.println("Error en la cantidad ingresada");
            }
        } while (numComputadoras <= 0);

        if (numComputadoras < 5) {
            porcentaje=10;
            total= Datos(numComputadoras, porcentaje, porcentaje);

        } else if (numComputadoras >= 5 && numComputadoras < 10) {
            porcentaje=20;
            total= Datos(numComputadoras, porcentaje, porcentaje);

        } else if (numComputadoras >= 10) {
            porcentaje=40;
            total= Datos(numComputadoras, porcentaje, porcentaje);
        }

        System.out.println("Vas a comprar " + numComputadoras + " computadoras y el precio de cada unidad es: " + "U$" + valor);
        System.out.println("Se te aplicó un descuento del " + porcentaje + "%.");
        System.out.println("El total de la compra con el descuento es: U$" + total);
    }

    public static int Datos(int numComputadoras, int descuento, int porcentaje) {
        int totalUnidad = valor * numComputadoras;
            descuento = (totalUnidad * porcentaje) / 100;
        return totalUnidad - descuento;
    }
}
// En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
// del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
// 10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
// a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
// 40% de descuento. El precio de cada computadora es de U$500
