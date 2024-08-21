package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario {

    private String nombre;
    private String numIdentificacion;
    private String email;
    private int edad;
    private String numCelular;

    private Vehiculo vehiculoPrincipal;
    private List<Vehiculo> listaVehiculosAsociados = new ArrayList<>();

    public Propietario() {
    }

    public Propietario(String nombre,
                       String numIdentificacion,
                       String email,
                       int edad,
                       String numCelular,
                       Vehiculo vehiculoPrincipal,
                       List<Vehiculo> listaVehiculosAsociados) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;
        this.email = email;
        this.edad = edad;
        this.numCelular = numCelular;
        this.vehiculoPrincipal = vehiculoPrincipal;
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }

    public void setVehiculoPrincipal(Vehiculo vehiculoPrincipal) {
        this.vehiculoPrincipal = vehiculoPrincipal;
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
                "nombre='" + nombre + '\'' +
                ", numIdentificacion='" + numIdentificacion + '\'' +
                ", email='" + email + '\'' +
                ", edad='" + edad + '\'' +
                ", numCelular='" + numCelular + '\'' +
                ", vehiculoPrincipal=" + vehiculoPrincipal +
                ", listaVehiculosAsociados=" + listaVehiculosAsociados +
                '}';
    }
}
