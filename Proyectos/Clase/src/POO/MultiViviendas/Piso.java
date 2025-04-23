package MultiViviendas;

public class Piso extends Vivienda {

    private int planta;
    private int puerta;

    // contructor
    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    // getter and setter
    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    // toString
    @Override
    public String toString() {
        return "Piso [planta=" + planta + ", puerta=" + puerta + "]";
    }

}
