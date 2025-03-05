package Condicionales;

import java.util.Scanner;

public class Septimo {
    private static int matriculaTecnologia = 18000;//cada una es el valor por cada 5 creditoss
    private static int matriculaProfesional = 30000; //cada una es el valor por cada 5 creditoss
    private static int descuento = 0;
    private static int matriculaTotal = 0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("de que curso es: (1 alunmo es de tecnologia, 2 alumno es de profesional,)");
        int resultado = entrada.nextInt();
        System.out.print("Cuantas materias a perdido: ");
        int materias = entrada.nextInt();
        System.out.print("cuanto fue el promedio: "); //sirve con el resultado con coma "," en vez de punto "."
        double promedio = entrada.nextDouble();

        switch (resultado) {
            case 1: //tecnologia
                if (promedio >= 9.5) {
                    matriculaTecnologia = matriculaTecnologia * 55;
                    descuento = (matriculaTecnologia * 25) / 100;
                    matriculaTotal = matriculaTecnologia - descuento;
                    System.out.println("tienes el descuento del 25% y el total es: US$" + matriculaTotal + " tambien tienes 55 creditos para matricular.");

                } else if (promedio >= 9) {
                    matriculaTecnologia = matriculaTecnologia * 50;
                    descuento = (matriculaTecnologia * 10) / 100;
                    matriculaTotal = matriculaTecnologia - descuento;
                    System.out.println("tienes el descuento del 10% y el total es: US$" + matriculaTotal + " tambien tienes 50 creditos para matricular.");

                } else if (promedio >= 7) {
                    matriculaTotal = matriculaTecnologia * 50;
                    System.out.println("total de la matricula es: US$" + matriculaTotal + " tambien tienes 50 creditos para matricular.");

                } else if (promedio < 7 && materias <= 3) {
                    matriculaTotal = matriculaTecnologia * 45;
                    System.out.println("total de la matricula es: US$" + matriculaTotal + " tambien tienes 45 creditos para matricular.");

                } else if (promedio < 7 && materias >= 4) {
                    matriculaTotal = matriculaTecnologia * 40;
                    System.out.println("total de la matricula es: US$" + matriculaTotal + " tambien tienes 40 creditos para matricular.");
                }
                break;

            case 2: //profesional
                if (promedio >= 9.5) {
                    matriculaProfesional = matriculaProfesional * 55;
                    descuento = (matriculaProfesional * 20) / 100;
                    matriculaTotal = matriculaProfesional - descuento;
                    System.out.println("tienes el descuento del 20% y el total es: US$" + matriculaTotal + " tambien tienes 55 creditos para matricular.");

                } else if (promedio < 9) {
                    matriculaTotal = matriculaProfesional * 55;
                    System.out.println("total de la matricula es: US$" + matriculaTotal + " tambien tienes 55 creditos para matricular.");
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
