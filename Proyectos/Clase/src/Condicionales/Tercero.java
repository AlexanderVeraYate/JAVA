package Condicionales;

import java.util.Scanner;

public class Tercero {
    private static float total;
    private static double iva=0.19, descuento=0.10, descuentoExtra=0.05, totalConIva;
    private static int compra;
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.print("Cual es el precio de la compra: ");
        do {
            compra=entrada.nextInt();
            if (compra <= 0) {
                System.out.println("Error en la cantidad ingresada");//rectificar que el numero sea positivo
            }
        } while (compra <= 0);

        System.out.print("____es marca ´NOSY´?____ (Seleccionar 1.si/2.no) ");
        int num1=entrada.nextInt();
        
        switch (num1) {
            case 1:
            if (compra>=500) {
                total =compra - compra * ((float)descuento + (float)descuentoExtra);
                totalConIva=datos(total) ;
                
            } else {
                total =compra - compra * (float)descuentoExtra;
                totalConIva=datos(total) ;

            } break;
                
                case 2:
                if (compra>=500) {
                    total =compra - compra * (float)descuento;
                    totalConIva=datos(total) ;
                    
                } else {
                    totalConIva=datos(total) ;

                } break;
        
            default:
            System.err.println("Error 404:entrada no admitida");
                break;
        }
        System.out.println("-------------------------------");
        System.out.println("Detalles de la compra:");
        System.out.println("Precio original: U$" + compra);
        System.out.println("Descuento aplicado: U$" + (compra - total));
        System.out.println("Total con IVA: U$" + totalConIva);
        System.out.println("-------------------------------");
    }

    public static double datos(float total) {
        return total + (total * iva);
    }
}


// Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
// de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
// 5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
// cualquiera por la compra de su aparato. El IVA es del 19%.