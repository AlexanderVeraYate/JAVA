package MultiViviendas;

import java.util.Scanner;

public class Test {
    private static Scanner entrada = new Scanner(System.in);
    private static int superficie;
    private static String ubicacion;

    public static void main(String[] args) {

        System.out.print("ingresa calle de la vivienda: ");
        ubicacion = entrada.nextLine();
        System.out.print("ingresa superfice en metros: ");
        superficie = entrada.nextInt();

        Vivienda casaVivienda = new Vivienda(ubicacion, superficie);

        System.out.println("vives en la calle: " + casaVivienda.getCalle());
        System.out.println("el precio sin el impuesto es: " + casaVivienda.calcularPrecio());
        System.out.println("el precio con el impuesto es: " + casaVivienda.impuestoMunicipal(superficie));

        System.out.println(casaVivienda.toString());
    }
}
