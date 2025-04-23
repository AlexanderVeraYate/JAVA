package FastFood;

import java.util.ArrayList;

public class Sandwich extends Receta{

    public Sandwich(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    

    @Override
    public int tiempoDePreparacion() {
        int vocales = 0;
        String nombreVocales = nombre.toLowerCase();
        for (int i = 0; i < nombreVocales.length(); i++) {
            char c = nombreVocales.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        return 2 + vocales;
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "Plancha";
    }

}
