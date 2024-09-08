package co.edu.uniquindio.programacion2trabajos.hotel.model;

import co.edu.uniquindio.programacion2trabajos.hotel.service.IConsumible;

public abstract class Servicio implements IConsumible {

    private String nombre;
    private double precio;

    public Servicio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return this.precio;
    }

    public abstract void ejecutarServicio(); // Método abstracto que debe ser implementado
}
