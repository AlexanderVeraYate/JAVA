package Alfombras;

public class AlfombraCuadrada extends Alfombra{
    int lado;

    public AlfombraCuadrada(String color, int precioMetro, int lado) {
        super(color, precioMetro);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override
    public String toString() {
        return "AlfombraCuadrada [lado=" + lado + ", color=" + color + ", precioMetro=" + precioMetro + "]";
    }

    @Override
    public double calcularSuperficie() {
        return lado*lado;

    }

    @Override
    public double calcularPrecio() {
        return calcularSuperficie()*this.precioMetro;
    }


    

}
