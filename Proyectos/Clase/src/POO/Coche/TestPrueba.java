package POO.Coche;

public class TestPrueba {
    public static void main(String[] args) {
        auto coche1 = new auto();

        coche1.setMarca("ford");
        coche1.setColor("ingles");
        coche1.setPlaca("5X30");
        coche1.setCilindraje(500);

        System.out.println("");
        System.out.println("Placa: " + coche1.getPlaca());

        coche1.dimeSiEsMetal();

        coche1.setColor("Negro");
        coche1.dimeSiEsMetal();

        System.out.println("Cil: " + coche1.getCilindraje());
        coche1.actualizarCilindraje(1000);
        System.out.println("Cil2: " + coche1.getCilindraje());

        auto coche2 = new auto("messi", "Rojo", "12FA", 2500);
        System.out.println("");
        System.out.println("Placa2: " + coche2.getPlaca());

    }

}