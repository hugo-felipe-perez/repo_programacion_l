package co.edu.uniquindio.programacion2trabajos.hotel.model;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Habitacion habitacionAsociada;
    private Cliente clienteAsociado;

    public Reserva() {
    }

    public Reserva(LocalDate fechaEntrada,
                   LocalDate fechaSalida,
                   Habitacion habitacionAsociada,
                   Cliente clienteAsociado) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacionAsociada = habitacionAsociada;
        this.clienteAsociado = clienteAsociado;
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
