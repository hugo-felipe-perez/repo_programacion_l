package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {

    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private String numeroChasis;

    private Propietario propietariosAsociado;
    private List<Propietario> listaPropietariosAsociados = new ArrayList<>();

    public Vehiculo() {
    }

    public Vehiculo(String placa,
                    String modelo,
                    String marca,
                    String color,
                    String numeroChasis,
                    Propietario propietariosAsociado,
                    List<Propietario> listaPropietariosAsociados) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.numeroChasis = numeroChasis;
        this.propietariosAsociado = propietariosAsociado;
        this.listaPropietariosAsociados = listaPropietariosAsociados;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public Propietario getPropietariosAsociado() {
        return propietariosAsociado;
    }

    public void setPropietariosAsociado(Propietario propietariosAsociado) {
        this.propietariosAsociado = propietariosAsociado;
    }

    public List<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    public void setListaPropietariosAsociados(List<Propietario> listaPropietariosAsociados) {
        this.listaPropietariosAsociados = listaPropietariosAsociados;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numeroChasis='" + numeroChasis + '\'' +
                ", propietariosAsociado=" + propietariosAsociado +
                ", listaPropietariosAsociados=" + listaPropietariosAsociados +
                '}';
    }
}
