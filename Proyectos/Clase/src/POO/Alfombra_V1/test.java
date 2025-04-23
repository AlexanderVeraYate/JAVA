package Alfombra;

public class test {
    public static void main(String[] args) {
        AlfombraCuadrada r =new AlfombraCuadrada("rojo", 1000, 2);
        System.out.println(r.toString());

        System.out.println("superficcie " +r.CalcularSuperficie());
        System.out.println("precio "+r.CalcularPrecio());
        System.out.println( "ac precio "+r.actualizarPrecio());
        System.out.println("rebaja "+r.ponerEnRebajas());
    }
}
