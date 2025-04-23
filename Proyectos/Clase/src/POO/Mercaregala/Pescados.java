package Mercaregala;

public class Pescados extends Productos{
    private String tipo;

    
        public Pescados(String nombre, double peso, int precioKilo, String tipo) {
        super(nombre, peso, precioKilo);
        this.tipo = tipo;
    }
    
        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        
        

        
    @Override
        public String toString() {
            return "Pescados [tipo=" + tipo + ", peso=" + peso + ", precioKilo=" + precioKilo + "]";
        }

    @Override
    public double calcularPrecio() {
        return this.peso*this.precioKilo;
    }

}
