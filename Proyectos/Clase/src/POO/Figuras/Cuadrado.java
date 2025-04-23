package Figuras;

public class Cuadrado extends Forma {

    private double lado;

    //contrucor
    
    public Cuadrado(String nombre, double posicionX, double posicionY, String color, double lado) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }
    //end contrucor

    
    //gysetter
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //end gysetter

    //to String
    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + "]";
    }
    //to String


    @Override
    public double calcularPerimetro() {
        return this.lado*4;
    }


    @Override
    public double CalcularArea() {
        return this.lado*this.lado;
    }

}
