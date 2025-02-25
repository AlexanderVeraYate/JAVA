package Condicionales;

import java.util.Scanner;

public class Tercero {
    public static void main(String[] args) {
        Scanner Entrada= new Scanner(System.in);
        float Total = 0;
        double iva=0.19, Descuento=0.10, Descuento_Extra=0.05;

        System.out.println("Cual es el precio de la compra");
        int Compra= Entrada.nextInt();
        System.out.println("____es marca ´NOSY´?____ (Seleccionar 1.si/2.no)");
        int num1= Entrada.nextInt();
        
        switch (num1) {
            case 1:
            if (Compra>=500) {
                Total =Compra - Compra * ((float)Descuento + (float)Descuento_Extra);
                Total = Total + (Total * (float)iva);
                System.out.println("La compra total fue de: U$"+Total);
                
            } else {
                Total =Compra - Compra * (float)Descuento_Extra;
                Total = Total + (Total * (float)iva);
                System.out.println("La compra total fue de: U$"+Total);

            } break;
                
                case 2:
                if (Compra>=500) {
                    Total =Compra - Compra * (float)Descuento;
                    Total = Total + (Total * (float)iva);
                    System.out.println("La compra total fue de: U$"+Total);
                    
                } else {
                    Total = Compra + (Compra * (float)iva);
                    System.out.println("La compra total fue de: U$"+Total);
                    
                } break;
        
            default:
            System.err.println("Error 404: Entrada no admitida");
                break;
        }
    }
}
// Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
// de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
// 5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
// cualquiera por la compra de su aparato. El IVA es del 19%.