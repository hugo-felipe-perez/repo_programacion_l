package co.edu.uniquindio.empresaTransporte.model;

import java.util.List;

public class VehiculoCarga extends Vehiculo {

    private Double capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String placa,
                         String modelo,
                         String marca,
                         String color,
                         String numeroChasis,
                         Propietario propietariosAsociado,
                         List<Propietario> listaPropietariosAsociados,
                         Double capacidadCarga,
                         int numeroEjes) {
        super(placa, modelo, marca, color, numeroChasis, propietariosAsociado, listaPropietariosAsociados);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "placa=" + getPlaca() +
                "modelo=" + getModelo() +
                "marca=" +getMarca() +
                "color=" + getColor() +
                "numeroChasis=" + getNumeroChasis() +
                "capacidadCarga=" + capacidadCarga +
                "numeroEjes=" + numeroEjes +
                '}';
    }
}
