package Figuras;

public class Triangulo extends Forma {
    private double Base;
    private double altura;
    
    // contrucor
    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        Base = base;
        this.altura = altura;
    }
    //end contrucor
    
    
    //gyseteer
    
        public double getBase() {
            return Base;
        }
    
        public void setBase(double base) {
            Base = base;
        }
    
        public double getAltura() {
            return altura;
        }
    
        public void setAltura(double altura) {
            this.altura = altura;
        }
    
    //end gysetter

    

//to String
    @Override
    public String toString() {
        return "Triangulo [Base=" + Base + ", altura=" + altura + "]";
    }
//to String


    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }


    @Override
    public double CalcularArea() {
        return (this.Base*this.altura)/2;
    }

    
}
