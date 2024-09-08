package co.edu.uniquindio.programacion2trabajos.hotel.model;

import co.edu.uniquindio.programacion2trabajos.hotel.service.Itarifa;

public class TarifaEstandar implements Itarifa {
    @Override
    public Double calcularTarifa(Habitacion habitacion) {

        Double tarifa = habitacion.getPrecio();
        return tarifa;
    }
}
