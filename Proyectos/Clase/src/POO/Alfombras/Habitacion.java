package Alfombras;

public class Habitacion {
    String nombre;
    Alfombra[] alfombras;
    int contadorAlfombra;



    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras = new Alfombra[199];
        this.contadorAlfombra = 0;
    }
    


    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Alfombra[] getAlfombras() {
        return alfombras;
    }



    public void setAlfombras(Alfombra[] alfombras) {
        this.alfombras = alfombras;
    }



    public int getContadorAlfombra() {
        return contadorAlfombra;
    }



    public void setContadorAlfombra(int contadorAlfombra) {
        this.contadorAlfombra = contadorAlfombra;
    }


    public boolean agregarAlfombra(Alfombra alfombra) {
        if (contadorAlfombra < alfombras.length) {
            alfombras[contadorAlfombra++] = alfombra;
            return true;
        }
        return false;
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (int i = 0; i < contadorAlfombra; i++) {
            total += alfombras[i].calcularPrecio();
        }
        return total;
    }

    public double calcularPrecioTotalC(){
        double total=0;
            for (int i = 0; i < contadorAlfombra; i++) {
                if (alfombras[i] instanceof AlfombraCuadrada) {
                    total += alfombras[i].calcularPrecio();
                    
                }
            }
        return total;
    }

    public double calcularPrecioTotalR(){
        double total=0;
            for (int i = 0; i < contadorAlfombra; i++) {
                if (alfombras[i] instanceof AlfombraRedonda) {
                    total += alfombras[i].calcularPrecio();
                    
                }
            }
        return total;
    }
}


