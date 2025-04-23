package FastFood;

import java.util.*;

public class Restaurante {
    private HashMap<String, IFastFood> mapaRecetasRestaurante;
    private Menu menu;

    public Restaurante() {
        this.mapaRecetasRestaurante = new HashMap<>();
        this.menu = new Menu();
    }

    public void crearReceta(String tipo, String nombre, ArrayList<String> ingredientes, ArrayList<String> pasos) {
        IFastFood receta;
        if (tipo.equalsIgnoreCase("pizza")) {
            receta = new Pizza(nombre, ingredientes, pasos);
        } else {
            receta = new Sandwich(nombre, ingredientes, pasos);
        }
        mapaRecetasRestaurante.put(nombre, receta);
    }

    public void anadirRecetaAlMenu(IFastFood receta) {
        menu.addItem(receta);
    }

    public void anadirRecetaAlMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Recetas disponibles:");
        for (String nombre : mapaRecetasRestaurante.keySet()) {
            System.out.println("- " + nombre);
        }
        System.out.print("Ingrese el nombre de la receta a añadir al menú: ");
        String eleccion = scanner.nextLine();
        IFastFood receta = mapaRecetasRestaurante.get(eleccion);
        if (receta != null) {
            anadirRecetaAlMenu(receta);
        } else {
            System.out.println("Receta no encontrada.");
        }
    }

    public double tiempoMedio() {
        ArrayList<IFastFood> items = menu.getItems();
        if (items.isEmpty()) return -1;

        int total = 0;
        for (IFastFood item : items) {
            total += item.tiempoDePreparacion();
        }
        return (double) total / items.size();
    }

    public double porcentajeVegetariano() {
        ArrayList<IFastFood> items = menu.getItems();
        if (items.isEmpty()) return 0;

        int vegetarianos = 0;
        for (IFastFood item : items) {
            if (item.isVegetariano()) vegetarianos++;
        }
        return (double) vegetarianos * 100 / items.size();
    }

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        ArrayList<String> ingredientesPizza = new ArrayList<>(Arrays.asList("queso", "tomate", "carne picada"));
        ArrayList<String> pasosPizza = new ArrayList<>(Arrays.asList("Amasar", "Agregar ingredientes", "Hornear"));
        restaurante.crearReceta("pizza", "Pizza Carnivora", ingredientesPizza, pasosPizza);

        ArrayList<String> ingredientesSandwich = new ArrayList<>(Arrays.asList("pan", "queso", "lechuga"));
        ArrayList<String> pasosSandwich = new ArrayList<>(Arrays.asList("Tostar pan", "Agregar ingredientes"));
        restaurante.crearReceta("sandwich", "Sandwich Veggie", ingredientesSandwich, pasosSandwich);

        restaurante.anadirRecetaAlMenu();
        restaurante.anadirRecetaAlMenu();

        System.out.println("Tiempo medio de preparación: " + restaurante.tiempoMedio());
        System.out.println("Porcentaje vegetariano del menú: " + restaurante.porcentajeVegetariano() + "%");
    }
}
