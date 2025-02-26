package Condicionales;

import java.util.Scanner;

public class Once {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int Invertir = 0, Banco = 0, Credito = 0, CompraTotal = 0, Total = 0;

        System.out.print("de cuanto es la compra: ");
        int Compra = Entrada.nextInt();

        if (Compra < 500000) {
            Invertir = (Compra * 70) / 100; //70%
            Total=Compra-Invertir;
            Credito = (Total * 20) / 100; //20%
            CompraTotal = Total + Credito;
            
            System.out.println("la empresa pagara: $" + Invertir);
            System.out.println("el credito sera: $" + Total + " pero con un interes de: $" + Credito + " que en total seria $" + CompraTotal);

        } else if (Compra > 500000) {
            Invertir = (Compra * 55) / 100; //55%
            Banco = (Compra * 30) / 100;//30%
            Total = Compra - Invertir - Banco;
            Credito = (Total * 20) / 100; //20%
            CompraTotal = Total + Credito;

            System.out.println("la empresa pagara: $" + Invertir);
            System.out.println("pedira prestado del banco: $" + Banco);
            System.out.println("el credito sera: $" + Total + " pero con un interes de: $" + Credito + " que en total seria $" + CompraTotal);

        }
    }
}

// 11. Una empresa quiere hacer una compra de varias piezas de la misma clase a una fábrica de
// refacciones. La empresa, dependiendo del monto total de la compra, decidirá qué hacer para
// pagar al fabricante.
// • Si el monto total de la compra excede de $500.000 la empresa tendrá la capacidad de invertir
// de su propio dinero un 55% del monto de la compra, pedir prestado al banco un 30% y el
// resto lo pagará solicitando un crédito al fabricante.
// • Si el monto total de la compra no excede de $500.000 la empresa tendrá capacidad de
// invertir de su propio dinero un 70% y el restante 30% lo pagará solicitando crédito al
// fabricante.
// • El fabricante cobra por concepto de intereses un 20% sobre la cantidad que se le pague a
// crédito.
