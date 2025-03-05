
import java.util.Random;
import java.util.Scanner;

public class Arreglo {

    private static int menu, subMenu, minMax, promedio, sumaTemperatura;
    private static String diaminMax;
    private static Scanner entrada = new Scanner(System.in);
    private static Random random = new Random();
    private static String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    private static String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto","Marzo", "Septiembre", "Octubre", "Noviembre","Diciembre"};
    private static int[] temperaturaSemana = new int[7];
    private static int[] temperaturaMes = new int[12];

//un programa de temperaturas
    public static void main(String[] args) {
        System.out.println("***menu***");
        System.out.println("1-Temperatura del Año");
        System.out.println("2-Temperatura del mes");
        System.out.println("3-Temperatura de la semana");
        menu = entrada.nextInt();
        switch (menu) {
            case 1:
                System.out.println("***Temperatura del Año***");
                System.out.println("1-Temperatura del Año");
                System.out.println("2-Temperatura del mes");
                System.out.println("3-Temperatura de la semana");
                menu = entrada.nextInt();
                do {

                for (int ciclo = 0; ciclo < 12; ciclo++) {  //genero temperaturas antes del menu
                    temperaturaMes[ciclo] = random.nextInt(41 - 20) + 20;
                }

                System.out.println("");
                System.out.println("***Temperatura del Mes***");
                System.out.println("1-ver temperaturas");
                System.out.println("2-ver temperatura minima");
                System.out.println("3-ver temperaturas maxima");
                System.out.println("4-ver promedio temperaturas");
                System.out.println("5-volver");
                subMenu = entrada.nextInt();
                switch (subMenu) {
                    case 1:
                        for (int ciclo = 0; ciclo < 12; ciclo++) { //reproducir temperaturass
                            System.out.println("La temperatura del dia " + mes[ciclo] + " fue de: " + temperaturaMes[ciclo] + "°");
                        }
                        break;
                    case 2:
                        minMax = temperaturaMes[0];
                        for (int ciclo = 0; ciclo < 12; ciclo++) { //bucar temperatura menor
                            if (temperaturaMes[ciclo] < minMax) {
                                minMax = temperaturaMes[ciclo];
                                diaminMax = mes[ciclo];
                            }
                        }
                        System.out.println("La temperatura menor fue del dia " + diaminMax + " con una temperatura del: " + minMax + "°");

                        break;
                    case 3:
                        minMax = temperaturaMes[0];
                        for (int ciclo = 0; ciclo < 12; ciclo++) { //bucar temperatura mayor
                            if (temperaturaMes[ciclo] > minMax) {
                                minMax = temperaturaMes[ciclo];
                                diaminMax = mes[ciclo];
                            }
                        }
                        System.out.println("La temperatura menor fue del dia " + diaminMax + " con una temperatura del: " + minMax + "°");

                        break;

                    case 4:
                        for (int ciclo = 0; ciclo < 12; ciclo++) {
                            sumaTemperatura += temperaturaMes[ciclo];
                            promedio = sumaTemperatura / temperaturaMes.length;
                        }
                        System.out.println("El promedio es de : " + promedio + "°") ;
                        break;
                }

            } while (subMenu < 5);

                break;//case 1
            case 2:
            do {

                for (int ciclo = 0; ciclo < 12; ciclo++) {  //genero temperaturas antes del menu
                    temperaturaMes[ciclo] = random.nextInt(41 - 20) + 20;
                }

                System.out.println("");
                System.out.println("***Temperatura del Mes***");
                menu() ;
                switch (subMenu) {
                    case 1:
                        for (int ciclo = 0; ciclo < 12; ciclo++) { //reproducir temperaturass
                            System.out.println("La temperatura del dia " + mes[ciclo] + " fue de: " + temperaturaMes[ciclo] + "°");
                        }
                        break;
                    case 2:
                        minMax = temperaturaMes[0];
                        for (int ciclo = 0; ciclo < 12; ciclo++) { //bucar temperatura menor
                            if (temperaturaMes[ciclo] < minMax) {
                                minMax = temperaturaMes[ciclo];
                                diaminMax = mes[ciclo];
                            }
                        }
                        System.out.println("La temperatura menor fue del dia " + diaminMax + " con una temperatura del: " + minMax + "°");

                        break;
                    case 3:
                        minMax = temperaturaMes[0];
                        for (int ciclo = 0; ciclo < 12; ciclo++) { //bucar temperatura mayor
                            if (temperaturaMes[ciclo] > minMax) {
                                minMax = temperaturaMes[ciclo];
                                diaminMax = mes[ciclo];
                            }
                        }
                        System.out.println("La temperatura menor fue del dia " + diaminMax + " con una temperatura del: " + minMax + "°");

                        break;

                    case 4:
                        for (int ciclo = 0; ciclo < 12; ciclo++) {
                            sumaTemperatura += temperaturaMes[ciclo];
                            promedio = sumaTemperatura / temperaturaMes.length;
                        }
                        System.out.println("El promedio es de : " + promedio + "°") ;
                        break;
                }

            } while (subMenu < 5);
                break; //case 2

            case 3:
                do {

                    for (int ciclo = 0; ciclo < 7; ciclo++) {  //genero temperaturas antes del menu
                        temperaturaSemana[ciclo] = random.nextInt(41 - 20) + 20;
                    }

                    System.out.println("");
                    System.out.println("***Temperatura de la semana***");
                    menu();
                    switch (subMenu) {
                        case 1:
                            for (int ciclo = 0; ciclo < 7; ciclo++) { //reproducir temperaturass
                                System.out.println("La temperatura del dia " + semana[ciclo] + " fue de: " + temperaturaSemana[ciclo] + "°");
                            }
                            break;
                        case 2:
                            minMax = temperaturaSemana[0];
                            for (int ciclo = 0; ciclo < 7; ciclo++) { //bucar temperatura menor
                                if (temperaturaSemana[ciclo] < minMax) {
                                    minMax = temperaturaSemana[ciclo];
                                    diaminMax = semana[ciclo];
                                }
                            }
                            System.out.println("La temperatura menor fue del dia " + diaminMax + " con una temperatura del: " + minMax + "°");

                            break;
                        case 3:
                            minMax = temperaturaSemana[0];
                            for (int ciclo = 0; ciclo < 7; ciclo++) { //bucar temperatura mayor
                                if (temperaturaSemana[ciclo] > minMax) {
                                    minMax = temperaturaSemana[ciclo];
                                    diaminMax = semana[ciclo];
                                }
                            }
                            System.out.println("La temperatura menor fue del dia " + diaminMax + " con una temperatura del: " + minMax + "°");

                            break;

                        case 4:
                            for (int ciclo = 0; ciclo < 7; ciclo++) {
                                sumaTemperatura += temperaturaSemana[ciclo];
                                promedio = sumaTemperatura / temperaturaSemana.length;
                            }
                            System.out.println("El promedio es de : " + promedio + "°") ;
                            break;
                    }

                } while (subMenu < 5);

                break; //case 3

            default:
                break;
        }

    }
    public static void menu() {
        System.out.println("1-ver temperaturas");
        System.out.println("2-ver temperatura minima");
        System.out.println("3-ver temperaturas maxima");
        System.out.println("4-ver promedio temperaturas");
        System.out.println("5-volver");
        subMenu = entrada.nextInt();
    }
}


//toca sacar el promedio de temperatura al año, mensuales, cual fue la temperatura minima y maxima del año, tambien de cada mes
