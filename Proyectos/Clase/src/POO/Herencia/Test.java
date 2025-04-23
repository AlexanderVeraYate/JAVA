package Herencia;

public class Test {

    public static void main(String[] args) {
        Auto a = new Auto("Ford", "rojo", 5, 2);

        System.out.println(a.toString());
        a.setColor("negro");

        System.out.println(a.getColor());



        Auto a1= new Auto("toyota", "blanco", 7, 5);


        System.out.println(a1.toString());
        a1.pintar("amarrillo");
        System.out.println(a1.toString());


    }

}
