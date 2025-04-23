package Alfombra;

public abstract class Alfombra {
    private String color;
    private int precioMetros;


    
//constructor
    public Alfombra(String color, int precioMetros) {
        this.color = color;
        this.precioMetros = precioMetros;
    }
    //getter and setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrecioMetros() {
        return precioMetros;
    }
    public void setPrecioMetros(int precioMetros) {
        this.precioMetros = precioMetros;
    }
    
    //to sstring
    
        @Override
        public String toString() {
            return "Alfombra [color=" + color + ", precioMetros=" + precioMetros + "]";
        }

        public abstract double CalcularSuperficie();
        public abstract double CalcularPrecio();

    
}
