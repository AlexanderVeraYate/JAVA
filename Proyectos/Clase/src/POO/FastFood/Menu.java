package FastFood;

import java.util.ArrayList;
import java.util.List;

class Menu {
    List<IFastFood> elementos;

    public Menu() {
        this.elementos = new ArrayList<>();
    }

    public ArrayList<IFastFood> getItems() {
        return (ArrayList<IFastFood>) elementos;
    }

    public void setItems(ArrayList<IFastFood> elementos) {
        this.elementos = elementos;
    }

    public void addItem(IFastFood elementos) {
        this.elementos.add(elementos);
    }
}

