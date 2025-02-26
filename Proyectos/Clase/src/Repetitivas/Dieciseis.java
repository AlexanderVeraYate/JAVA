package Repetitivas;

import java.util.Scanner;

public class Dieciseis {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int limon = 2500, nuez = 2800, lulo = 2600, fresa = 2000, crema = 3000;
        int Indicador = 0, facturas = 0;
        int CantidadLimon = 0, CantidadNuez = 0, CantidadLulo = 0, CantidadFresa = 0, CantidadCrema = 0;
        int CantidadTotalLimon = 0, CantidadTotalNuez = 0, CantidadTotalLulo = 0, CantidadTotalFresa = 0, CantidadTotalCrema = 0;

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
                    CantidadLimon = Cantidad * limon;
                    CantidadTotalLimon = CantidadLimon + CantidadTotalLimon;
                    break;
                case 2:
                    System.out.print("cuanta cantidad va a escoger: ");
                    Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    CantidadNuez = Cantidad * nuez;
                    CantidadTotalNuez = CantidadNuez + CantidadTotalNuez;
                    break;
                case 3:
                    System.out.print("cuanta cantidad va a escoger: ");
                    Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    CantidadLulo = Cantidad * lulo;
                    CantidadTotalLulo = CantidadLulo + CantidadTotalLulo;
                    break;
                case 4:
                    System.out.print("cuanta cantidad va a escoger: ");
                    Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    CantidadFresa = Cantidad * fresa;
                    CantidadTotalFresa = CantidadFresa + CantidadTotalFresa;
                    break;
                case 5:
                    System.out.print("cuanta cantidad va a escoger: ");
                    Cantidad = Entrada.nextInt();
                    Entrada.nextLine();
                    CantidadCrema = Cantidad * crema;
                    CantidadTotalCrema = CantidadCrema + CantidadTotalCrema;
                    break;
                default:
                    System.out.println("Error 404 Seleccion incorrecta");
                    break;
            }

            System.out.print("deseas hacer otra factura? (1 si, 2 no)");
            Indicador = Entrada.nextInt();
        } while (Indicador == 1);
        System.out.println("_________Resultados_________");
        System.out.println("El total de Limon fue: " + CantidadTotalLimon + " y se vendieron: " + (CantidadTotalLimon / limon));
        System.out.println("El total de Nuez fue: " + CantidadTotalNuez + " y se vendieron: " + (CantidadTotalNuez / nuez));
        System.out.println("El total de Lulo fue: " + CantidadTotalLulo + " y se vendieron: " + (CantidadTotalLulo / lulo));
        System.out.println("El total de Fresa fue: " + CantidadTotalFresa + " y se vendieron: " + (CantidadTotalFresa / fresa));
        System.out.println("El total de Crema fue: " + CantidadTotalCrema + " y se vendieron: " + (CantidadTotalCrema / crema));

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
