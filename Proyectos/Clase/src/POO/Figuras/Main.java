package Figuras;

public class Main {
    public static void main(String[] args) {
        Triangulo T1 = new Triangulo("Triángulo Verde", 1.0, 1.0, "Verde", 6.0, 4.0);
        Triangulo T2 = new Triangulo("Triángulo Naranja", 4.5, 2.2, "Naranja", 3.0, 5.0);
        Cuadrado C1 = new Cuadrado("Cuadrado Azul", 2.0, 3.5, "Azul", 4.0);
        Cuadrado C2 = new Cuadrado("Cuadrado Rojo", 0, 0, "Rojo", 5.5);

        System.out.println("La suma total de todas las areas de loss triangulos es: "+(T1.CalcularArea()+T2.CalcularArea()));

        System.out.println("La media de la area de los cuadrados que hay es de: " +((C1.CalcularArea()+C2.CalcularArea())/2));
    }


}

//hice todas las mejoras pero no lo hice para su version para triangulo isoceles
