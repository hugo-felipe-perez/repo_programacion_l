package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;

    private List<Propietario> listaPropietarios = new ArrayList<>();
    private List <VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    private List <VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    private List<Usuario> listaUsuarios =  new ArrayList<>();

    public EmpresaTransporte() {
    }

    public EmpresaTransporte(String nombre,
                             List<Propietario> listaPropietarios,
                             List<VehiculoCarga> listaVehiculosCarga,
                             List<VehiculoTransporte> listaVehiculosTransporte,
                             List<Usuario> listaUsuarios) {
        this.nombre = nombre;
        this.listaPropietarios = listaPropietarios;
        this.listaVehiculosCarga = listaVehiculosCarga;
        this.listaVehiculosTransporte = listaVehiculosTransporte;
        this.listaUsuarios = listaUsuarios;
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

    public List<VehiculoTransporte> getListaVehiculosTransporte()    {
        return listaVehiculosTransporte;
    }

    public void setListaVehiculosTransporte(List<VehiculoTransporte> listaVehiculosTransporte) {
        this.listaVehiculosTransporte = listaVehiculosTransporte;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "EmpresaTransporte{" +
                "nombre='" + nombre + '\'' +
                ", listaPropietarios=" + listaPropietarios +
                ", listaVehiculosCarga=" + listaVehiculosCarga +
                ", listaVehiculosTransporte=" + listaVehiculosTransporte +
                ", listaUsuarios=" + listaUsuarios +
                '}';
    }

    public Propietario  crearPropietario (String nombre,String cedula,String email,int edad,String celular) {

        Propietario propietario = new Propietario();
        propietario.setNombre(nombre);
        propietario.setNumIdentificacion(cedula);
        propietario.setEmail(email);
        propietario.setEdad(edad);
        propietario.setNumCelular(celular);
        getListaPropietarios().add(propietario);

        return propietario;
    }

    public VehiculoCarga crearVehiculoCarga (String placa,
                                             String modelo,
                                             String marca,
                                             String color,
                                             String numeroChasis,
                                             Double capacidad,
                                             int numeroEjes) {

        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setPlaca(placa);
        vehiculoCarga.setModelo(modelo);
        vehiculoCarga.setMarca(marca);
        vehiculoCarga.setColor(color);
        vehiculoCarga.setNumeroChasis(numeroChasis);
        vehiculoCarga.setCapacidadCarga(capacidad);
        vehiculoCarga.setNumeroEjes(numeroEjes);
        getListaVehiculosCarga().add(vehiculoCarga);

        return vehiculoCarga;
    }

    public VehiculoTransporte crearVehiculoTransporte (String placa,
                                                  String modelo,
                                                  String marca,
                                                  String color,
                                                  String numeroChasis,
                                                  int maximoPasajeros) {

        VehiculoTransporte vehiculoTransporte = new VehiculoTransporte();
        vehiculoTransporte.setPlaca(placa);
        vehiculoTransporte.setModelo(modelo);
        vehiculoTransporte.setMarca(marca);
        vehiculoTransporte.setColor(color);
        vehiculoTransporte.setNumeroChasis(numeroChasis);
        vehiculoTransporte.setMaximoPasajeros(maximoPasajeros);
        getListaVehiculosTransporte().add(vehiculoTransporte);

        return vehiculoTransporte;
    }

    public void asociarVehiculoPropietario (Propietario propietario, Vehiculo vehiculo) {
        propietario.getListaVehiculosAsociados().add(vehiculo);
    }

}
