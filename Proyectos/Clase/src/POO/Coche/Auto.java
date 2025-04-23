package POO.Coche;

public class Auto {
    // atributos
    private String marca;
    private String color;
    private String placa;
    private int cilindraje;

    // Contructores
    Auto(String marca, String color, String placa, int cilindraje) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.cilindraje = cilindraje;
    }

    public Auto() {

    }
    // getters

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void actualizarCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    // Metodos
    public void dimeSiEsMetal() {
        if (color.equals("Negro")) {
            System.out.println("Si es metalizado");
        } else {
            System.out.println("No es metalizado");
        }
    }

    // actualizar cilindraje

}
