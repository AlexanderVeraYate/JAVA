package Condicionales;

import java.util.Scanner;

public class Primero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Si las computadoras son menos de cinco se les dará un 10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un 40% de descuento. El precio de cada computadora es de U$500.");
        System.out.println("_____Cuantos computadores va a comprar______");
        int num1 = entrada.nextInt();
        int total, total_U;
        if (num1 < 5) {
            int valor = 500;
            total_U = valor * num1;
            total = (total_U * 10) / 100;
            total = total_U - total;
            System.out.println("Vas a comprar " + num1 + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra con el descuento del 10% es: U$" + total);
        } else {
            if (num1 < 10) {
                int valor = 500;
                total_U = valor * num1;
                total = (total_U * 20) / 100;
                total = total_U - total;
                System.out.println("Vas a comprar " + num1 + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra con el descuento del 20% es: U$" + total);
            } else {
                int valor = 500;
                total_U = valor * num1;
                total = (total_U * 40) / 100;
                total = total_U - total;
                System.out.println("Vas a comprar " + num1 + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra con el descuento del 40% es: U$" + total);
            }
        }
    }
    // En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
    // del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
    // 10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
    // a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
    // 40% de descuento. El precio de cada computadora es de U$500.
}