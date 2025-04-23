package MultiViviendas;

public class Adosado extends Vivienda {
    private int numeroPlantas;

    // constructor
    public Adosado(String calle, int superficieEnMetros, int numeroPlantas) {
        super(calle, superficieEnMetros);
        this.numeroPlantas = numeroPlantas;
    }

    // GETTEN AND SETTER
    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }

    // toSring
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adosado{");
        sb.append("numeroPlantas=").append(numeroPlantas);
        sb.append('}');
        return sb.toString();
    }

}
