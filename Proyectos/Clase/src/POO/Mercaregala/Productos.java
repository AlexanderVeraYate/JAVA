package Mercaregala;

public abstract class Productos implements IProductos{
    String nombre;
    double peso;
    int precioKilo;

    //contructor
    public Productos(String nombre, double peso, int precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
    }
    //constructor
    
    //getter and setters
    public String getNombre() {
            return nombre;
        }

    public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    public int getpeso() {
            return peso;
        }

    public void setpeso(double peso) {
            this.peso = peso;
        }

    public double getprecioKilo() {
            return precioKilo;
        }

    public void setprecioKilo(int precioKilo) {
            this.precioKilo = precioKilo;
        }
    //getter and setters
    
    //to string
    @Override
    public String toString() {
        return "Productos [nombre=" + nombre + ", peso=" + peso + ", precioKilo=" + precioKilo + "]";
    }
    //to string


}
