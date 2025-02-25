package Condicionales;

import java.util.Scanner;

public class Septimo {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int MatriculaTecnologia = 18000;//cada una es el valor por cada 5 creditoss
        int MatriculaProfesional = 30000; //cada una es el valor por cada 5 creditoss
        int Descuento = 0;
        int MatriculaTotal = 0;

        System.out.print("de que curso es: (1 alunmo es de tecnologia, 2 alumno es de profesional,)");
        int Resultado = Entrada.nextInt();
        System.out.print("Cuantas materias a perdido: ");
        int Materias = Entrada.nextInt();
        System.out.print("cuanto fue el promedio: "); //sirve con el resultado con coma "," en vez de punto "."
        double Promedio = Entrada.nextDouble();

        switch (Resultado) {
            case 1: //tecnologia
                if (Promedio >= 9.5) {
                    MatriculaTecnologia = MatriculaTecnologia * 55;
                    Descuento = (MatriculaTecnologia * 25) / 100;
                    MatriculaTotal = MatriculaTecnologia - Descuento;
                    System.out.println("tienes el descuento del 25% y el total es: US$" + MatriculaTotal + " tambien tienes 55 creditos para matricular.");

                } else if (Promedio >= 9) {
                    MatriculaTecnologia = MatriculaTecnologia * 50;
                    Descuento = (MatriculaTecnologia * 10) / 100;
                    MatriculaTotal = MatriculaTecnologia - Descuento;
                    System.out.println("tienes el descuento del 10% y el total es: US$" + MatriculaTotal + " tambien tienes 50 creditos para matricular.");

                } else if (Promedio >= 7) {
                    MatriculaTotal = MatriculaTecnologia * 50;
                    System.out.println("total de la matricula es: US$" + MatriculaTotal + " tambien tienes 50 creditos para matricular.");

                } else if (Promedio < 7 && Materias <= 3) {
                    MatriculaTotal = MatriculaTecnologia * 45;
                    System.out.println("total de la matricula es: US$" + MatriculaTotal + " tambien tienes 45 creditos para matricular.");

                } else if (Promedio < 7 && Materias >= 4) {
                    MatriculaTotal = MatriculaTecnologia * 40;
                    System.out.println("total de la matricula es: US$" + MatriculaTotal + " tambien tienes 40 creditos para matricular.");
                }
                break;

            case 2: //profesional
                if (Promedio >= 9.5) {
                    MatriculaProfesional = MatriculaProfesional * 55;
                    Descuento = (MatriculaProfesional * 20) / 100;
                    MatriculaTotal = MatriculaProfesional - Descuento;
                    System.out.println("tienes el descuento del 20% y el total es: US$" + MatriculaTotal + " tambien tienes 55 creditos para matricular.");

                } else if (Promedio < 9) {
                    MatriculaTotal = MatriculaProfesional * 55;
                    System.out.println("total de la matricula es: US$" + MatriculaTotal + " tambien tienes 55 creditos para matricular.");
                }
                break;

            default:
                System.out.println("Error 404 Seleccion de alumno no admitida");
                break;
        }//while
    }
}

// Una institución educativa estableció un programa para estimular a los alumnos
// con buen
// rendimiento académico y que consiste en lo siguiente:
// ▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este
// podrá cursar
// 55 créditos y se le hará un 25% de descuento.
// ▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de
// tecnología,
// entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
// ▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología,
// este podrá
// cursar 50 créditos y no tendrá ningún descuento.
// ▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a
// 3 y el
// alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá
// descuento.
// ▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o
// más y el
// alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
// descuento.
// ▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional,
// entonces podrá
// cursar 55 créditos y se le hará un 20% de descuento.
// ▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces
// podrá cursar 55
// créditos y no tendrá descuento.
