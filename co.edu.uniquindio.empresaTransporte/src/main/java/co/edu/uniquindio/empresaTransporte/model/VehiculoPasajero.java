package co.edu.uniquindio.empresaTransporte.model;

public class VehiculoPasajero extends Vehiculo {
    private int maximoPasajeros;

    public VehiculoPasajero() {
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }
}
