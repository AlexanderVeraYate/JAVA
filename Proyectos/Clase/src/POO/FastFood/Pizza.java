package FastFood;

import java.util.ArrayList;

import FastFood.Receta;

public class Pizza extends Receta{

    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }




    @Override
    public int tiempoDePreparacion() {
        int tiempoBase= 2;
        int minLetra=3;
        int tiempoTotal= tiempoBase;
        for (String ingrediente : ingredientes) {
            tiempoTotal+= ingrediente.length()*minLetra;
        }

        return tiempoTotal;
    }

    @Override
    public boolean isVegetariano() {
        for (String ingrediente : ingredientes) {
            if (ingrediente.toLowerCase().contains("carne")) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "Horno";
    }

}
