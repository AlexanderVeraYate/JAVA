package Condicionales;

import java.util.Scanner;

public class Quinto {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int Prestamo = 0, SaldoNuevo = 0, Insumos = 0, Descuentos = 0, SaldoRestante = 0, Insentivos = 0;
        System.out.print("Saldo actual: U$");
        int SaldoActual = Entrada.nextInt();

        if (SaldoActual < 0) {
            System.out.println("Obtienes un prestamo de: U$10.000 ");
            Prestamo =  10000;
            SaldoNuevo =  SaldoActual +  Prestamo;

        } else if (SaldoActual <= 20000) {
            System.out.println("Obtienes un prestamo de: U$20.000 ");
            Prestamo =  20000;
            SaldoNuevo =  SaldoActual +  Prestamo;

        } else {
            System.out.println("No obtienes ningun prestamos");
            SaldoNuevo = SaldoActual;
        }

        Descuentos = 5000 +  2000;
        SaldoRestante = SaldoNuevo - Descuentos;
        Insumos = SaldoRestante / 2;
        Insentivos = SaldoRestante / 2;
        System.out.println("Saldo: U$" + SaldoRestante);
        System.out.println("Insumos: U$" + Insumos);
        System.out.println("Insentivos: U$" + Insentivos);

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
