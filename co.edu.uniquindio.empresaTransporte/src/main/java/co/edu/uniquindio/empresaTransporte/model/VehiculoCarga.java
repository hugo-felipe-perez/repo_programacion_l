package co.edu.uniquindio.empresaTransporte.model;

public class VehiculoCarga extends Vehiculo {

    private Double capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String tamaño,
                         String placa,
                         int modelo,
                         String marca,
                         String color,
                         Double capacidadCarga,
                         int numeroEjes) {
        super(tamaño, placa, modelo, marca, color);
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
                "capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                '}';
    }
}
