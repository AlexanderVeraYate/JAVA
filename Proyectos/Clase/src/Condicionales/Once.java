package Condicionales;

import java.util.Scanner;

public class Once {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int invertir = 0, banco = 0, credito = 0, compraTotal = 0, total = 0;

        System.out.print("de cuanto es la compra: ");
        int compra = entrada.nextInt();

        if (compra < 500000) {
            invertir = (compra * 70) / 100; //70%
            total=compra-invertir;
            credito = (total * 20) / 100; //20%
            compraTotal = total + credito;
            
            System.out.println("la empresa pagara: $" + invertir);
            System.out.println("el credito sera: $" + total + " pero con un interes de: $" + credito + " que en total seria $" + compraTotal);

        } else if (compra > 500000) {
            invertir = (compra * 55) / 100; //55%
            banco = (compra * 30) / 100;//30%
            total = compra - invertir - banco;
            credito = (total * 20) / 100; //20%
            compraTotal = total + credito;

            System.out.println("la empresa pagara: $" + invertir);
            System.out.println("pedira prestado del banco: $" + banco);
            System.out.println("el credito sera: $" + total + " pero con un interes de: $" + credito + " que en total seria $" + compraTotal);

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
