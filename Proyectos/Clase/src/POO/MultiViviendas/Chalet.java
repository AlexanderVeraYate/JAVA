package MultiViviendas;

public class Chalet extends Vivienda {
    private int numeroParcela;
    private boolean conPiscina;

    // contructor
    public Chalet(String calle, int superficieEnMetros, int numeroParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numeroParcela = numeroParcela;
        this.conPiscina = conPiscina;
    }
    // getter and setter

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }

    // toString
    @Override
    public String toString() {
        return "Chalet [numeroParcela=" + numeroParcela + ", conPiscina=" + conPiscina + "]";
    }

    // @Override
    // public void calcularPrecio() {
    //     precio = superficieEnMetros * 1300;
    // }
}
