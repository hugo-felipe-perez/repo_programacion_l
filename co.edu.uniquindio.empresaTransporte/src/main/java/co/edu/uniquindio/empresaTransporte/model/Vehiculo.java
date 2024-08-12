package co.edu.uniquindio.empresaTransporte.model;

public abstract class Vehiculo {

    private String tamaño;
    private String placa;
    private int modelo;
    private String marca;
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(String tamaño, String placa, int modelo, String marca, String color) {
        this.tamaño = tamaño;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
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

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tamaño='" + tamaño + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo=" + modelo +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
