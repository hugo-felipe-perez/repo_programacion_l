package co.edu.uniquindio.programacion2trabajos.hotel.model;

import co.edu.uniquindio.programacion2trabajos.hotel.service.IConsumible;

public class Servicio implements IConsumible {

    private String spa;
    private String restaurante;
    private String limpieza;

    public Servicio() {
    }

    public Servicio(String spa, String restaurante, String limpieza) {
        this.spa = spa;
        this.restaurante = restaurante;
        this.limpieza = limpieza;
    }

    public String getSpa() {
        return spa;
    }

    public void setSpa(String spa) {
        this.spa = spa;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "spa='" + spa + '\'' +
                ", restaurante='" + restaurante + '\'' +
                ", limpieza='" + limpieza + '\'' +
                '}';
    }

    @Override
    public void consumir() {

    }
}
