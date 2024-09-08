package co.edu.uniquindio.programacion2trabajos.hotelEnum.model;

import co.edu.uniquindio.programacion2trabajos.hotelEnum.enums.TipoServicio;

public abstract class Servicio  {


    private TipoServicio tipoServicio;
    private double precio;

    public Servicio(TipoServicio tipoServicio, double precio) {
        this.tipoServicio = tipoServicio;
        this.precio = precio;
    }

    public TipoServicio getTipoServicio() {
        return this.tipoServicio;
    }
    public double getPrecio() {
        return this.precio;
    }

    public abstract void ejecutarServicio(); // Método abstracto que debe ser implementado
}
