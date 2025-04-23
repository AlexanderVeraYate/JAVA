package Herencia;

public class Electrico extends Auto {
    private double capacidadBaterias;

    public Electrico(String marca, String color, int numeroPlaza, int numeroPuertas, double capacidadBaterias) {
        super(marca, color, numeroPlaza, numeroPuertas);
        this.capacidadBaterias = capacidadBaterias;
    }

}
