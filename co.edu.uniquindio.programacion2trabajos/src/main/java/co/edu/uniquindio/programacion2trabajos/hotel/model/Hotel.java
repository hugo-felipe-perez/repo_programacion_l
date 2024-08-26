package co.edu.uniquindio.programacion2trabajos.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nombre;
    private List<Habitacion> listaHabitaciones = new ArrayList<>();
    private List<Reserva> listaReservas =  new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Servicio> listaServicios = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(String nombre,
                 List<Habitacion> listaHabitaciones,
                 List<Reserva> listaReservas,
                 List<Cliente> listaClientes,
                 List<Servicio> listaServicios) {
        this.nombre = nombre;
        this.listaHabitaciones = listaHabitaciones;
        this.listaReservas = listaReservas;
        this.listaClientes = listaClientes;
        this.listaServicios = listaServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(List<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", listaHabitaciones=" + listaHabitaciones +
                ", listaReservas=" + listaReservas +
                ", listaClientes=" + listaClientes +
                ", listaServicios=" + listaServicios +
                '}';
    }
}
