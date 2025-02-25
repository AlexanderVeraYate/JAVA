import java.util.Scanner;

public class Segundo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se compran de cinco a 10 y de U$50 si se compran más de 10.");
        System.out.println("_____Cuantos llantas va a comprar______");
        int num1 = entrada.nextInt();
        int total_U;
        if (num1 < 5) {
            int valor = 100;
            total_U = valor * num1;
            System.out.println("Vas a comprar " + num1 + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra es: U$" + total_U);
        } else {
            if (num1 < 10) {
                int valor = 75;
                total_U = valor * num1;
                System.out.println("Vas a comprar " + num1 + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra es: U$" + total_U);
            } else {
                int valor = 50;
                total_U = valor * num1;
                System.out.println("Vas a comprar " + num1 + " y el precio de cada unidad es: " + "U$" + valor + " y el total de la compra es: U$" + total_U);
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
