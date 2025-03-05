package Repetitivas;

import java.util.Random;
import java.util.Scanner;

public class Trece {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String[] premioHombres = {"Desobrante", "Six-pack de cerveza", "Camiseta", "Pantaloneta", "Sudadera"};
        String[] premioFemenino = {"Locion", "Bikini", "Crema para la cara", "Plancha para el cabello", "Essmalte de uñas"};

        int numero = 0, contador = 0;
        int participantes;

        System.out.print("que genero eres: (1 hombre, 2 femenino)");
        int genero = entrada.nextInt();

        switch (genero) {
            case 1:
                System.out.print("cuantos van a participar: ");
                participantes = entrada.nextInt();

                do { //ciclo para todos los participantes
                    contador++;
                    numero = random.nextInt(5);
                    System.out.println("Te salio el numero " + (numero+1) + " asi que ganaste " + premioHombres[numero]);
                } while (contador < participantes);
                break;
            case 2:
                System.out.print("cuantos van a participar: ");
                participantes = entrada.nextInt() ;

                do { //ciclo para todos los participantes
                    contador++;
                    numero = random.nextInt(5);
                    System.out.println("Te salio el numero " + (numero+1) + " asi que ganaste " + premioFemenino[numero]);
                } while (contador < participantes);
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
// # Bolita premio              # bolita premio
// 1 Desodorante                1 Loción
// 2 Six-Pack de cerveza        2 Bikini
// 3 Camiseta                   3 Crema para la cara
// 4 Pantaloneta                4 Plancha para el cabello
// 5 Sudadera                   5 Esmalte de uñas
