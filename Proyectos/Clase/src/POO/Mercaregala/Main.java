package Mercaregala;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int seleccion;
        int subSeleccion;
        int cantidad;
        ArrayList<Pescados> listaPescados = new ArrayList<>();
        do {
            
            System.out.println("\n****Mercaregala****");
            System.out.println("1.Añadir producto");
            System.out.println("2.Listar producto");
            System.out.println("3.Productos en peligro");
            System.out.println("4.Calculo precio medio");
            System.out.println("5.Eliminar bandejas");
            System.out.println("6.Cerrar");
            seleccion = sc.nextInt();
            
            switch (seleccion) {
                case 1:
                System.out.println("____AÑADIR PRODUCTO____");
                System.out.println("1.Añadir Carne");
                System.out.println("2.Añadir Pescado");
                System.out.println("3.volver");
                subSeleccion = sc.nextInt();
                switch (subSeleccion) {
                    case 1:
                    
                    break;
                    case 2:
                    System.out.println("Cuantos tipos de pescados desea ingresar?");
                    cantidad = sc.nextInt();
                    sc.nextLine();
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println("\nPESCADO #"+(i+1));
                            
                            System.out.print("tipo de pescado: ");
                            String tipo = sc.nextLine();
                            System.out.print("peso de pescado: ");
                            double peso = sc.nextDouble();
                            System.out.print("precio por kilo de pescado: ");
                            int precioKilo = sc.nextInt();
                            sc.nextLine();

                            Pescados nuevoPescado = new Pescados(tipo, peso, precioKilo, tipo);
                            listaPescados.add(nuevoPescado);
                        }

                    break;
                
                    default:
                        break;
                }
                
                break;
                
                case 2:

                System.out.println("\n____LISTADO DE PESCADOS____");
                if (listaPescados.isEmpty()) {
                    System.out.println("No hay pescados registrados.");
                } else {
                    for (int i = 0; i < listaPescados.size(); i++) {
                        Pescados p = listaPescados.get(i);
                        System.out.printf(p.toString());
                    }
                }
                break;
                
                case 3:
                
                break;
                
                case 4:
            
                break;
    
                case 5:
            
                break;

                default:
                
                break;
        }
    } while (seleccion> 0 && seleccion<6);
    }
    
}
