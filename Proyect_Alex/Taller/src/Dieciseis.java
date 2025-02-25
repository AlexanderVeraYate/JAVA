package Taller;

import java.util.Scanner;

public class Dieciseis {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int limon = 2500, nuez = 2800, lulo = 2600, fresa = 2000, crema = 3000;
        int Indicador = 0, facturas = 0;
        int Cantidad_Limon = 0, Cantidad_nuez = 0, Cantidad_Lulo = 0, Cantidad_Fresa = 0, Cantidad_Crema = 0;
        int Cantidad_Total_limon = 0, Cantidad_Total_nuez = 0, Cantidad_Total_lulo = 0, Cantidad_Total_fresa = 0, Cantidad_Total_crema = 0;

        do {
            facturas++;
            System.out.println("__No " + facturas + " factura__");
            System.out.println("");
            System.out.println("***Menu***");
            System.out.println("1 Limon");
            System.out.println("2 Nuez");
            System.out.println("3 Lulo");
            System.out.println("4 Fresa");
            System.out.println("5 Crema");
            System.out.print("Seleccione un sabor: ");
            int Seleccion = Entrada.nextInt();
            Entrada.nextLine();

            switch (Seleccion) {
                case 1:
                    System.out.print("cuanta cantidad va a escoger: ");
                    int Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    Cantidad_Limon = Cantidad * limon;
                    Cantidad_Total_limon = Cantidad_Limon + Cantidad_Total_limon;
                    break;
                case 2:
                    System.out.print("cuanta cantidad va a escoger: ");
                    Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    Cantidad_nuez = Cantidad * nuez;
                    Cantidad_Total_nuez = Cantidad_nuez + Cantidad_Total_nuez;
                    break;
                case 3:
                    System.out.print("cuanta cantidad va a escoger: ");
                    Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    Cantidad_Lulo = Cantidad * lulo;
                    Cantidad_Total_lulo = Cantidad_Lulo + Cantidad_Total_lulo;
                    break;
                case 4:
                    System.out.print("cuanta cantidad va a escoger: ");
                    Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    Cantidad_Fresa = Cantidad * fresa;
                    Cantidad_Total_fresa = Cantidad_Fresa + Cantidad_Total_fresa;
                    break;
                case 5:
                    System.out.print("cuanta cantidad va a escoger: ");
                    Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    Cantidad_Crema = Cantidad * crema;
                    Cantidad_Total_crema = Cantidad_Crema + Cantidad_Total_crema;
                    break;
                default:
                    System.out.println("Error 404 Seleccion incorrecta");
                    break;
            }

            System.out.print("deseas hacer otra factura? (1 si, 2 no)");
            Indicador = Entrada.nextInt();
        } while (Indicador == 1);
        System.out.println("_________Resultados_________");
        System.out.println("El total de Limon fue: " + Cantidad_Total_limon + " y se vendieron: " + (Cantidad_Total_limon / limon));
        System.out.println("El total de Nuez fue: " + Cantidad_Total_nuez + " y se vendieron: " + (Cantidad_Total_nuez / nuez));
        System.out.println("El total de Lulo fue: " + Cantidad_Total_lulo + " y se vendieron: " + (Cantidad_Total_lulo / lulo));
        System.out.println("El total de Fresa fue: " + Cantidad_Total_fresa + " y se vendieron: " + (Cantidad_Total_fresa / fresa));
        System.out.println("El total de Crema fue: " + Cantidad_Total_crema + " y se vendieron: " + (Cantidad_Total_crema / crema));

        System.out.println("_________saliste del programa______");
        System.out.println("Hiciste " + facturas + " facturas");
    }

}

// Una heladería desea obtener un reporte semanal de ventas. Para ello debe capturar en un
// sistema todas las facturas de ventas realizadas. Cada factura contiene la cantidad y el sabor de
// las paletas vendidas. Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600),
// fresa ($2000) y crema ($3000). El sistema debe imprimir la cantidad de paletas vendidas de cada
// sabor, el valor vendido y la venta total. Considere que una factura puede tener varias paletas de
// diferentes sabores.
