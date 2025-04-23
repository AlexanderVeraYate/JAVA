package MultiViviendas;

public class Atico extends Piso {
    private int superficieTerraza;

    //contructor
    public Atico(String calle, int superficieEnMetros, int planta, int puerta, int superficieTerraza) {
        super(calle, superficieEnMetros, planta, puerta);
        this.superficieTerraza = superficieTerraza;
    }
    
    //getter and setters
        public int getSuperficieTerraza() {
            return superficieTerraza;
        }
    
        public void setSuperficieTerraza(int superficieTerraza) {
            this.superficieTerraza = superficieTerraza;
        }

        //toString
        @Override
        public String toString() {
            return "Atico [superficieTerraza=" + superficieTerraza + "]";
        }
}
