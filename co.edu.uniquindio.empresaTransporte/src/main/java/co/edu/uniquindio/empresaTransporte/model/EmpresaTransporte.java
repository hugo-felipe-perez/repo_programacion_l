package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;
    private List<Propietario> listaPropietarios = new ArrayList<>();
    private List <VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    private List <VehiculoPasajero> listaVehiculosPasajeros = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public EmpresaTransporte(String nombre,
                             List<Propietario> listaPropietarios,
                             List<VehiculoCarga> listaVehiculosCarga,
                             List<VehiculoPasajero> listaVehiculosPasajeros) {
        this.nombre = nombre;
        this.listaPropietarios = listaPropietarios;
        this.listaVehiculosCarga = listaVehiculosCarga;
        this.listaVehiculosPasajeros = listaVehiculosPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoPasajero> getListaVehiculosPasajeros() {
        return listaVehiculosPasajeros;
    }

    public void setListaVehiculosPasajeros(List<VehiculoPasajero> listaVehiculosPasajeros) {
        this.listaVehiculosPasajeros = listaVehiculosPasajeros;
    }

    @Override
    public String toString() {
        return "EmpresaTransporte{" +
                "nombre='" + nombre + '\'' +
                ", listaPropietarios=" + listaPropietarios +
                ", listaVehiculosCarga=" + listaVehiculosCarga +
                ", listaVehiculosPasajeros=" + listaVehiculosPasajeros +
                '}';
    }
}
