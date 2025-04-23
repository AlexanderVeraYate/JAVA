package Alfombras;

public class Main {
    public static void main(String[] args) {
        AlfombraRedonda alfombraRedonda = new AlfombraRedonda("Roja", 100, 5);
        AlfombraCuadrada alfombraCuadrada = new AlfombraCuadrada("Azul", 150, 4);

        Habitacion habitacion = new Habitacion("sala de estar");

        habitacion.agregarAlfombra(alfombraRedonda);
        habitacion.agregarAlfombra(alfombraCuadrada);

        System.out.println("Precio total de todas las alfombras: " + habitacion.calcularPrecioTotal());

        System.out.println("Precio total de las alfombras cuadradas: " + habitacion.calcularPrecioTotalR());

        //mansion
        Mansion mansion = new Mansion();
        mansion.agregarHabitacion(habitacion);
        
        Habitacion dormitorio = new Habitacion("Dormitorio principal");
        dormitorio.agregarAlfombra(new AlfombraCuadrada("Verde", 20, 3));
        mansion.agregarHabitacion(dormitorio);
        
        System.out.println("Precio total alfombras en la mansión: " + mansion.calcularPrecioTotalAlfombras());
        System.out.println("Precio alfombras cuadradas en la mansión: " + mansion.calcularPrecioAlfombrasC());
    }
}
