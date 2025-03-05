package Repetitivas;

import java.util.Scanner;

public class Dieciseis {

    public static String sabor[] = {"Limon", "Nuez", "Lulo", "Fresa", "Crema"};
    public static int cantidadPaletas[] = new int[5];
    public static int valorPaleta[] = {2500, 2800, 2600, 2000, 3000};
    public static int cantidadTotal[] = new int[5];

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int indicador = 0, facturas = 0;
        int cantidad;

        do {
            facturas++;
            System.out.println("__No " + facturas + " factura__");
            mostrarMenu();
            System.out.print("seleccione un sabor: ");
            int seleccion = entrada.nextInt();
            entrada.nextLine();

            switch (seleccion) {
                case 0:
                    cantidad = pedircantidad(sabor[0]);
                    resultados(cantidad, cantidadPaletas, seleccion, valorPaleta);
                    break;
                case 1:
                    cantidad = pedircantidad(sabor[1]);
                    resultados(cantidad, cantidadPaletas, seleccion, valorPaleta);

                    break;
                case 2:
                    cantidad = pedircantidad(sabor[2]);
                    resultados(cantidad, cantidadPaletas, seleccion, valorPaleta);
                    break;
                case 3:
                    cantidad = pedircantidad(sabor[3]);
                    resultados(cantidad, cantidadPaletas, seleccion, valorPaleta);
                    break;
                case 4:
                    cantidad = pedircantidad(sabor[4]);
                    resultados(cantidad, cantidadPaletas, seleccion, valorPaleta);
                    break;
                default:
                    System.out.println("Error 404 seleccion incorrecta");
                    break;
            }

//resultados
            System.out.print("deseas hacer otra factura? (1 si, 2 no)");
            indicador = entrada.nextInt();
        } while (indicador == 1);
        System.out.println("_________Resultados_________");

        for (int ciclo = 0; ciclo < 4; ciclo++) {
            System.out.println("El total de " + sabor[ciclo] + " fue: " + cantidadTotal[ciclo] + " y se vendieron: " + (cantidadPaletas[ciclo] / valorPaleta[ciclo]));

        }
        System.out.println("_________saliste del programa______");
        System.out.println("Hiciste " + facturas + " facturas");
    }//resultados

    public static void mostrarMenu() { //mostrar menu

        System.out.println("");
        System.out.println("***Menu***");
        for (int ciclo = 0; ciclo < 5; ciclo++) {
            System.out.println(ciclo + " " + sabor[ciclo]);
        }
    }//mostrar menu

    public static int pedircantidad(String sabor) { //para recibir la cantidad
        int cantidad;
        Scanner entrada = new Scanner(System.in);
        System.out.print("cuanta cantidad de: " + sabor + ": ");
        do {
            cantidad = entrada.nextInt();
            if (cantidad <= 0) {
                System.out.println("Error en la cantidad ingresada");
            }
        } while (cantidad <= 0);
        return cantidad;
    }//para recibir la cantidad

    
    public static int resultados(int cantidad,int cantidadPaletas[], int seleccion, int valorPaleta[]) {
        cantidadPaletas[seleccion] = cantidad * valorPaleta[seleccion];
        cantidadTotal[seleccion] = cantidadPaletas[seleccion] + cantidadTotal[seleccion];
    return cantidadPaletas[seleccion];
} //resultados
}

// Una heladería desea obtener un reporte semanal de ventas. Para ello debe capturar en un
// sistema todas las facturas de ventas realizadas. Cada factura contiene la cantidad y el sabor de
// las paletas vendidas. Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600),
// fresa ($2000) y crema ($3000). El sistema debe imprimir la cantidad de paletas vendidas de cada
// sabor, el valor vendido y la venta total. Considere que una factura puede tener varias paletas de
// diferentes sabores.
