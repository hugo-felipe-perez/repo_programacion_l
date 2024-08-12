package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario {

    private String nomvre;
    private int numIdentificacion;
    private String email;
    private int numCelular;
    private List<Vehiculo> listaVehiculosAsociados = new ArrayList<>();

    public Propietario() {
    }

    public Propietario(String nomvre,
                       int numIdentificacion,
                       String email,
                       int numCelular,
                       List<Vehiculo> listaVehiculosAsociados) {
        this.nomvre = nomvre;
        this.numIdentificacion = numIdentificacion;
        this.email = email;
        this.numCelular = numCelular;
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public String getNomvre() {
        return nomvre;
    }

    public void setNomvre(String nomvre) {
        this.nomvre = nomvre;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public void setListaVehiculosAsociados(List<Vehiculo> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nomvre='" + nomvre + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", email='" + email + '\'' +
                ", numCelular=" + numCelular +
                ", listaVehiculosAsociados=" + listaVehiculosAsociados +
                '}';
    }
}
