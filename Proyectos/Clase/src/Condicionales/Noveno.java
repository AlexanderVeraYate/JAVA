package Condicionales;

import java.util.Scanner;

public class Noveno {
    public static void main(String[] args) {
        Scanner Entrada= new Scanner(System.in);
        int Utilidades=0,SalarioTotal=0;
        int SalarioMes=10000; // el salario mensual sera de 10.000

        System.out.print("Cuanto lleva trabajando: (0,1 es un mes, 1 ya es un año)");
        double Tiempo = Entrada.nextDouble();

        if (Tiempo<1) {
            Utilidades= (SalarioMes*5)/100;
            SalarioTotal= SalarioMes + Utilidades;
            
        } else  if (Tiempo<=1.9) {
            SalarioTotal= (int) (SalarioMes * Tiempo);
            Utilidades= (SalarioTotal*5)/100;

        } else if (Tiempo<=4.9) {
            SalarioTotal= (int) (SalarioMes * Tiempo);
            Utilidades= (SalarioTotal*5)/100;
        } else if (Tiempo<=9.9) {
            SalarioTotal= (int) (SalarioMes * Tiempo);
            Utilidades= (SalarioTotal*5)/100;
            
        } else {
            SalarioTotal= (int) (SalarioMes * Tiempo);
            Utilidades= (SalarioTotal*5)/100;
            
        }
        System.out.println("recibiste un salario de: $"+SalarioTotal+ " y recibiste: $"+Utilidades+ " de utilidades");
    }
    
}
// Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si a este se le asigna
// un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo
// con la siguiente tabla:

// Tiempo                                            Utilidad
// Menos de 1 año                                   5 % del salario
// 1 año o más y menos de 2 años                    7% del salario
// 2 años o más y menos de 5 años                   10% del salario
// 5 años o más y menos de 10 años                  15% del salario
// 10 años o más                                    20% del salario
