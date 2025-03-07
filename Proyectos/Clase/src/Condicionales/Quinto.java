package Condicionales;

import java.util.Scanner;

public class Quinto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int prestamo = 0, saldoNuevo = 0, insumos = 0, descuento = 0, saldoRestante = 0, insetivos = 0;
        System.out.print("Saldo actual: U$");
        int saldoActual = entrada.nextInt();

        if (saldoActual < 0) {
            System.out.println("Obtienes un prestamo de: U$10.000 ");
            prestamo =  10000;
            saldoNuevo =  saldoActual +  prestamo;

        } else if (saldoActual <= 20000) {
            System.out.println("Obtienes un prestamo de: U$20.000 ");
            prestamo =  20000;
            saldoNuevo =  saldoActual +  prestamo;

        } else {
            System.out.println("No obtienes ningun prestamos");
            saldoNuevo = saldoActual;
        }

        descuento = 5000 +  2000;
        saldoRestante = saldoNuevo - descuento;
        insumos = saldoRestante / 2;
        insetivos = saldoRestante / 2;
        System.out.println("Saldo: U$" + saldoRestante);
        System.out.println("insumos: U$" + insumos);
        System.out.println("insetivos: U$" + insetivos);

    }
}

// El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
// año. La manera de planificarlas depende de lo siguiente:
// Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
// que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
// préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
// un saldo superior a los U$20.000 no pedirá ningún préstamo.
// Posteriormente repartirá su presupuesto de la siguiente manera:
// • U$5.000 para equipo de computo
// • U$2.000 para mobiliario
// • El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
// Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
// en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.
