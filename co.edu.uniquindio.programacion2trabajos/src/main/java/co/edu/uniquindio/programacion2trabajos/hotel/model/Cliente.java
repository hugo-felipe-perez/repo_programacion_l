package co.edu.uniquindio.programacion2trabajos.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String DNI;
    private List<Reserva> listaReservasActivas = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String DNI, List<Reserva> listaReservasActivas) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.listaReservasActivas = listaReservasActivas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public List<Reserva> getListaReservasActivas() {
        return listaReservasActivas;
    }

    public void setListaReservasActivas(List<Reserva> listaReservasActivas) {
        this.listaReservasActivas = listaReservasActivas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", listaReservasActivas=" + listaReservasActivas +
                '}';
    }
}
