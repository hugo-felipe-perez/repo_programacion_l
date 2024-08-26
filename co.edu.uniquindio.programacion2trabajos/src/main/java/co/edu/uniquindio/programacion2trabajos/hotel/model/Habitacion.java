package co.edu.uniquindio.programacion2trabajos.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {

    private Double numero;
    private Double precio;
    private Reserva reservaAsociada;
    private List<Servicio> listaServiciosAsociados = new ArrayList<>();
    private List<ServicioHabitacion> listaServiciosHabitacionAsociados = new ArrayList<>();

    public Habitacion() {
    }

    public Habitacion(Double numero,
                      Double precio,
                      Reserva reservaAsociada,
                      List<Servicio> listaServiciosAsociados,
                      List<ServicioHabitacion> listaServiciosHabitacionAsociados) {
        this.numero = numero;
        this.precio = precio;
        this.reservaAsociada = reservaAsociada;
        this.listaServiciosAsociados = listaServiciosAsociados;
        this.listaServiciosHabitacionAsociados = listaServiciosHabitacionAsociados;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Reserva getReservaAsociada() {
        return reservaAsociada;
    }

    public void setReservaAsociada(Reserva reservaAsociada) {
        this.reservaAsociada = reservaAsociada;
    }

    public List<Servicio> getListaServiciosAsociados() {
        return listaServiciosAsociados;
    }

    public void setListaServiciosAsociados(List<Servicio> listaServiciosAsociados) {
        this.listaServiciosAsociados = listaServiciosAsociados;
    }

    public List<ServicioHabitacion> getListaServiciosHabitacionAsociados() {
        return listaServiciosHabitacionAsociados;
    }

    public void setListaServiciosHabitacionAsociados(List<ServicioHabitacion> listaServiciosHabitacionAsociados) {
        this.listaServiciosHabitacionAsociados = listaServiciosHabitacionAsociados;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", precio=" + precio +
                ", reservaAsociada=" + reservaAsociada +
                ", listaServiciosAsociados=" + listaServiciosAsociados +
                ", listaServiciosHabitacionAsociados=" + listaServiciosHabitacionAsociados +
                '}';
    }
}
