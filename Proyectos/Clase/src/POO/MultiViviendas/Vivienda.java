package MultiViviendas;

public class Vivienda {
    private String calle;
    private double precio;
    private int superficieEnMetros;

    // contructor

    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
        precio = impuestoMunicipal(superficieEnMetros);
    }

    // getter and setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }

    public void setSuperficieEnMetros(int superficieEnMetros) {
        this.superficieEnMetros = superficieEnMetros;
    }

    // to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vivienda{");
        sb.append("calle=").append(calle);
        sb.append(", precio=").append(precio);
        sb.append(", superficieEnMetros=").append(superficieEnMetros);
        sb.append('}');
        return sb.toString();
    }

    // metodo
    // para darle valor al precio
    public double calcularPrecio() {
        return superficieEnMetros * 1000;
    }

    // impuesto del 5%
    public double impuestoMunicipal(double impuesto) {
        impuesto = 0.05;
        impuesto = calcularPrecio() * impuesto;
        return calcularPrecio() + impuesto;
    }
}

// 8.a.9. Ejercicio multiviviendas
// Crear las siguientes clases y métodos, y una clase Principal que vaya
// probando la creación de las clases
// y los métodos:
// • Crear clase Vivienda con atributos String calle, double precio, int
// superficieEnMetros
// • Crear clase Piso (que hereda de Vivienda) con atributos int planta, int
// puerta
// • Crear clase Adosado (que hereda de Vivienda) con atributos int numPlantas
// • Crear clase Chalet (que hereda de Vivienda) con atributos int numParcela,
// boolean conPiscina.
// • Poner public, private o protected a los atributos segun corresponda
// • Crear constructores para cada clase, que no incluyen el precio, pues el
// precio se calcula solo con
// métodos que vienen explicados después.
// • Crear en Vivienda el método calcularPrecio(), que es el valor de
// superficieEnMetros*1000,
// válido para todos los hijos menos para el Chalet, que es
// superficieEnMetros*1300
// • Crear la una clase principal donde crear objetos de las clases previamente
// indicadas.
