package POO.Coche;

public class Test2 {

    public static void main(String[] args) {
        auto choche1 = new auto("ford", "rojo", "SX30", 1550);


        System.out.println("Placa: " + choche1.getPlaca());


        choche1.setColor("matematicas");
        System.out.println("Color: " + choche1.getColor());
    }

}
