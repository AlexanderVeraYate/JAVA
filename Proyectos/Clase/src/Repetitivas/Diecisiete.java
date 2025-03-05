package Repetitivas;

import java.util.Random;

public class Diecisiete {
    
    private static String[] semana={"lunes", "martes", "miercoles", "jueves", "viernes","sabados","domingo" };
    public static void main(String[] args) {
        Random random = new Random();
        int[] temperatura= new int[7];

        for (int ciclo = 0; ciclo < 7; ciclo++) {
            temperatura[ciclo]= random.nextInt(46)-5;
            System.out.println("la temperatura del dia "+ semana[ciclo]+ " fue de: "+ temperatura[ciclo]);
            if (temperatura[ciclo]<= 0) {
                System.out.println("fue un dia congelante");
            } else if (temperatura[ciclo]>= 1 && temperatura[ciclo]<=10) {
                System.out.println("fue un dia muy frio");
            } else if (temperatura[ciclo]>= 10 && temperatura[ciclo]<=20) {
                System.out.println("fue un dia frio");
            } else if (temperatura[ciclo]>= 21 && temperatura[ciclo]<=24) {
                System.out.println("fue un dia templado");
            } else if (temperatura[ciclo]>= 25 && temperatura[ciclo]<=29) {
                System.out.println("fue un dia agradable");
            } else if (temperatura[ciclo]>= 30 && temperatura[ciclo]<=35) {
                System.out.println("fue un dia caliente");
            } else if (temperatura[ciclo]>= 36){
                System.out.println("fue un dia muy caliente");
            }
            }
        }
    }
// El sistema meteorológico local requiere un sistema para capturar la temperatura promedio de cada
// día de la semana e imprimir el nombre del día y un mensaje de la percepción de la temperatura
// de acuerdo con el valor capturado según la siguiente tabla:
// Temperatura                          Mensaje
// Menor o igual que cero               Congelante
// 1 a 10°C                             Muy frío
// 11 a 20°C                            Frío
// 21 a 24°C                            Templado
// 25 a 29°C                            Agradable
// 30 a 35°C                            Caliente
// 36°C o más                           Muy caliente