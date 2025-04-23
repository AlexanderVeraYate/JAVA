package Alfombras;

public abstract class Alfombra implements IAlfombra{

    String color;
    int precioMetro;

    
    public Alfombra(String color, int precioMetro) {
        this.color = color;
        this.precioMetro = precioMetro;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getPrecioMetro() {
        return precioMetro;
    }


    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }


}
