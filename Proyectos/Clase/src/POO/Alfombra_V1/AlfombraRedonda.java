package Alfombra;

public class AlfombraRedonda extends Alfombra implements IAlfombra{
    private int radio;

    public AlfombraRedonda(String color, int precioColor, int radio) {
        super(color, precioColor);
        this.radio = radio;
    }

    public int getradio() {
        return radio;
    }

    public void setradio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "AlfombraRedonda [radio=" + radio + ", toString()=" + super.toString() + "]";
    }

    @Override
    public double CalcularSuperficie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularSuperficie'");
    }

    @Override
    public double CalcularPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularPrecio'");
    }

    @Override
    public double actualizarPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarPrecio'");
    }

    @Override
    public double ponerEnRebajas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ponerEnRebajas'");
    }

    

}
