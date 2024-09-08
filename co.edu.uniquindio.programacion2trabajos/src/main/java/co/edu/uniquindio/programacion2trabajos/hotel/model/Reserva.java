package co.edu.uniquindio.programacion2trabajos.hotel.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private String idReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double precioReserva;
    private Habitacion habitacionAsociada;
    private Cliente clienteAsociado;
    private List<Servicio> listaServicios = new ArrayList<Servicio>();


    public Reserva() {
    }

    public Reserva(String idReserva,
                   LocalDate fechaEntrada,
                   LocalDate fechaSalida,
                   Habitacion habitacionAsociada,
                   Cliente clienteAsociado) {
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacionAsociada = habitacionAsociada;
        this.clienteAsociado = clienteAsociado;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecioReserva() {
        return precioReserva;
    }

    public void setPrecioReserva(double precioReserva) {
        this.precioReserva = precioReserva;
    }

    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    public void setHabitacionAsociada(Habitacion habitacionAsociada) {
        this.habitacionAsociada = habitacionAsociada;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public List<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", habitacionAsociada=" + habitacionAsociada +
                ", clienteAsociado=" + clienteAsociado +
                '}';
    }



}
