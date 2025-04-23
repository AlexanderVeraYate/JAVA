package Mercaregala;

public class test {
    public static void main(String[] args) {
        Pescados P1 = new Pescados("mojarra", 1.5, 8500, "mojarra");

        System.out.println(P1.toString());
        System.out.println(P1.calcularPrecio());

        
    }
}
