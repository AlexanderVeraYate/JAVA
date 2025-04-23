package Herencia;

public class Vehiculo {
    private String marca;
    private String color;

    // constructor
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    // getter and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", color=" + color + "]";
    }


    public void pintar(String ColorNuevo){
        this.color = ColorNuevo;
    }

}
