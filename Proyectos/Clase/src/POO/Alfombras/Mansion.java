package Alfombras;

public class Mansion {
    Habitacion[] habitaciones;
    int contadorHabitacion;

    public Mansion() {
        this.habitaciones = new Habitacion[1999];
        this.contadorHabitacion = 0;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getContadorHabitacion() {
        return contadorHabitacion;
    }

    public void setContadorHabitacion(int contadorHabitacion) {
        this.contadorHabitacion = contadorHabitacion;
    }

    public boolean agregarHabitacion(Habitacion habitacion) {
        if (contadorHabitacion < habitaciones.length) {
            habitaciones[contadorHabitacion++] = habitacion;
            return true;

        }

        return false;
    }


    public double calcularPrecioTotalAlfombras() {
        double total = 0;
        for (int i = 0; i < contadorHabitacion; i++) {
            total += habitaciones[i].calcularPrecioTotal();
        }
        return total;
    }

    public double calcularPrecioAlfombrasC() {
        double total = 0;
        for (int i = 0; i < contadorHabitacion; i++) {
            total += habitaciones[i].calcularPrecioTotalC();
        }
        return total;
    }
}



