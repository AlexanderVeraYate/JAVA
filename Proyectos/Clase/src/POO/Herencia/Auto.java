package Herencia;

public class Auto extends Vehiculo {
    private int numeroPlaza;
    private int numeroPuertas;


    // constructor
    public Auto(String marca, String color, int numeroPlaza, int numeroPuertas) {
        super(marca, color);
        this.numeroPlaza = numeroPlaza;
        this.numeroPuertas = numeroPuertas;
    }

    // getter and setters
    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // toString
    @Override
    public String toString() {
        return "Auto [numeroPlaza=" + numeroPlaza + ", numeroPuertas=" + numeroPuertas + ", toString()="
                + super.toString() + "]";
    }


    @Override //@Override sirve para sobreescribir el metodo
    public void pintar(String ColorNuevo){
        String colorOriginal=super.getColor();
        super.setColor(colorOriginal+ "/"+ColorNuevo);
    }
}
