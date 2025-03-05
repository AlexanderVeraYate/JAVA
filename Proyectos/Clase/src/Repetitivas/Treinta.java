// package Repetitivas;

import java.util.Scanner;

public class Treinta {

    public static String[] nombreEmpleadosHombres={"Alex","jorge"}; // arreglo para nombre empleados hombres
    public static String[] nombreEmpleadosMujeres; // igual pero para mujeres
    public static int[] sueldoEmpleadosHombres; // sueldo hombres
    public static int[] sueldoEmpleadosMujeres;
    public static int[] antiguedadEmpleadosHombres; // antiguos hombres
    public static int[] antiguedadEmpleadosMujeres;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);




        System.out.println("***menu***");
        System.out.println("0-Categorias");
        System.out.println("1-Sueldos");
        int menuPrincipal = entrada.nextInt();
        switch (menuPrincipal) {
            case 0:  //seleciion categorias
                System.out.println("");
                System.out.println("***Categorias***");
                System.out.println("0-A");
                System.out.println("1-B");
                System.out.println("2-C");
                // meto volver??
                int menuCategorias = entrada.nextInt();
                switch (menuCategorias) {
                    case 0://seloeciioon categoria A
                        System.out.println("");
                        System.out.println("***Categoria A***");
                        System.out.println("0-Ver listado de trabajadores");
                        System.out.println("1-Ver informacion de trabajador");
                        int menuA = entrada.nextInt();
                        switch (menuA) {
                            case 0:

                                
                                break;
                        
                            default:
                                break;
                        }
                        break;

                    case 1:

                        break;
                    case 2:

                        break;

                    default:
                        break;
                }
                break;// swhicht 1
            case 1:

                break;
            default:
                break;
        }
    }
    public static String trabajadoresA() {

        return;
        
    }

}



// 30. Elabore un algoritmo que lea los siguientes datos de N trabajadores:
// Clave, Categoría, Sueldo,
// Años de antigüedad, Sexo. Calcule lo siguiente:
// a) Sueldo promedio por cada categoría.
// b) Cuántos empleados ganan más de $ 10,000.
// c) Cuántos empleados tienen más de 15 años de antigüedad.
// d) Cuántas mujeres de categoría A ganan más de $ 8,500.
// e) Cuántos empleados con 10 o más años de antigüedad, ganan menos de $ 6,000.
// f) Cuántos empleados de categoría C ganan más de $ 12,500.

// Existen 3 categorías: A, B y C
