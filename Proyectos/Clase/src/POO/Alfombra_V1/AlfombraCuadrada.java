package Alfombra;

public class AlfombraCuadrada extends Alfombra implements IAlfombra{
    private int radio;
    
    //contructor
    public AlfombraCuadrada(String color, int precioColor, int radio) {
        super(color, precioColor);
        this.radio = radio;
    }


    //getter and setter
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

    //toString
    @Override
    public String toString() {
        return "AlfombraCuadrada [radio=" + radio + ", toString()=" + super.toString() + "]";
    }


    //metodo para sacar el radio del circulo
    @Override
    public double CalcularSuperficie() {
        return (Math.PI*Math.pow(radio, 2));
    }
    //calcula uperficie por lo metros
    @Override
    public double CalcularPrecio() {
        return (CalcularSuperficie()*super.getPrecioMetros());
    }


    @Override
    public double actualizarPrecio() {
        return (this.getPrecioMetros()+2);
    }


    @Override
    public double ponerEnRebajas() {
    return (this.getPrecioMetros()/2);
    
    }
    
}

