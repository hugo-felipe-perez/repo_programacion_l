package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo {

    private int maximoPasajeros;

    private List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa,
                              String modelo,
                              String marca,
                              String color,
                              String numeroChasis,
                              Propietario propietariosAsociado,
                              List<Propietario> listaPropietariosAsociados,
                              int maximoPasajeros,
                              List<Usuario> listaUsuariosAsociados) {
        super(placa, modelo, marca, color, numeroChasis, propietariosAsociado, listaPropietariosAsociados);
        this.maximoPasajeros = maximoPasajeros;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaUsuariosAsociados(List<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "placa=" + getPlaca() +
                "modelo=" + getModelo() +
                "marca=" +getMarca() +
                "color=" + getColor() +
                "numeroChasis=" + getNumeroChasis() +
                "maximoPasajeros=" + maximoPasajeros +
                ", listaUsuariosAsociados=" + listaUsuariosAsociados +
                '}';
    }
}
