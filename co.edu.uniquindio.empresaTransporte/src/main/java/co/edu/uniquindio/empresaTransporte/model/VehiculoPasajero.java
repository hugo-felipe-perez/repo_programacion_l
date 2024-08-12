package co.edu.uniquindio.empresaTransporte.model;

public class VehiculoPasajero extends Vehiculo{

    private int maximoPasajeros;

    public VehiculoPasajero() {
    }

    public VehiculoPasajero(String tamaño,
                            String placa,
                            int modelo,
                            String marca,
                            String color,
                            int maximoPasajeros) {
        super(tamaño, placa, modelo, marca, color);
        this.maximoPasajeros = maximoPasajeros;
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    @Override
    public String toString() {
        return "VehiculoPasajero{" +
                "maximoPasajeros=" + maximoPasajeros +
                '}';
    }
}
