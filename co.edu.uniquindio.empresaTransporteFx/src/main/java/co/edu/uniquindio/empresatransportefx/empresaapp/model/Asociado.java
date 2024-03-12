package co.edu.uniquindio.empresatransportefx.empresaapp.model;

import java.util.ArrayList;
import java.util.List;

public class Asociado {
    private String nombre;
    private String numeroIdentificacion;
    private String email;
    private String numeroCelular;
    private List<Vehiculo> listaVehiculosAsociados = new ArrayList<>();

    public Asociado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public void setListaVehiculosAsociados(List<Vehiculo> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }
    public void añadirVehiculos (Vehiculo vehiculo){
        listaVehiculosAsociados.add(vehiculo);
    }
}
