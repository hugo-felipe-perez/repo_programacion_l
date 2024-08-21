package co.edu.uniquindio.empresaTransporte.model;

public class Usuario {

    private String nombre;
    private int edad;
    private Double peso;

    private VehiculoTransporte vehiculoAsociado;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, Double peso, VehiculoTransporte vehiculoAsociado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vehiculoAsociado=" + vehiculoAsociado +
                '}';
    }
}
