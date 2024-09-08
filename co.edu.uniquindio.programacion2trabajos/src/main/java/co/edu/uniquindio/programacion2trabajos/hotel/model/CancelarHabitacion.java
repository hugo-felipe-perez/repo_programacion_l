package co.edu.uniquindio.programacion2trabajos.hotel.model;

import co.edu.uniquindio.programacion2trabajos.hotel.service.IAccionReserva;

public class CancelarHabitacion implements IAccionReserva {
    @Override
    public void ejecutar() {
        System.out.println("Reserva cancelada");
    }
}
