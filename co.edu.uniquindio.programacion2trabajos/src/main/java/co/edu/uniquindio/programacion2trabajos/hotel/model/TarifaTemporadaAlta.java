package co.edu.uniquindio.programacion2trabajos.hotel.model;

import co.edu.uniquindio.programacion2trabajos.hotel.service.Itarifa;

public class TarifaTemporadaAlta implements Itarifa {
    @Override
    public Double calcularTarifa(Habitacion habitacion) {
        Double precio = habitacion.getPrecio() * 1.5;
        return precio;
    }
}
