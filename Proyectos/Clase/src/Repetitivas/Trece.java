package Repetitivas;

import java.util.Random;
import java.util.Scanner;

public class Trece {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Random random = new Random();

        String[] PremioHombres = {"Desobrante", "Six-pack de cerveza", "Camiseta", "Pantaloneta", "Sudadera"};
        String[] PremioFemenino = {"Locion", "Bikini", "Crema para la cara", "Plancha para el cabello", "Essmalte de uñas"};

        int Numero = 0, Contador = 0;

        System.out.print("que genero eres: (1 hombre, 2 femenino)");
        int Genero = Entrada.nextInt();

        switch (Genero) {
            case 1:
                System.out.print("cuantos van a participar: ");
                int Participantes = Entrada.nextInt();

                do { //ciclo para todos los participantes
                    Contador++;
                    Numero = random.nextInt(5);
                    System.out.println("Te salio el numero " + (Numero+1) + " asi que ganaste " + PremioHombres[Numero]);
                } while (Contador < Participantes);
                break;
            case 2:
                System.out.print("cuantos van a participar: ");
                int participantes = Entrada.nextInt();

                do { //ciclo para todos los participantes
                    Contador++;
                    Numero = random.nextInt(5);
                    System.out.println("Te salio el numero " + (Numero+1) + " asi que ganaste " + PremioFemenino[Numero]);
                } while (Contador < participantes);
                break;

            default:
                System.out.println("error 404 Eleccion incorrecta");
                break;
        }
    }
}
// 13. Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar
// de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de
// otra canasta, los premios se dan bajo la siguiente tabla:
// HOMBRES                      MUJERES
// # Bolita Premio              # bolita Premio
// 1 Desodorante                1 Loción
// 2 Six-Pack de cerveza        2 Bikini
// 3 Camiseta                   3 Crema para la cara
// 4 Pantaloneta                4 Plancha para el cabello
// 5 Sudadera                   5 Esmalte de uñas
