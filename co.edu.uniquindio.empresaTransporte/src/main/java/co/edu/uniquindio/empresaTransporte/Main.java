package co.edu.uniquindio.empresaTransporte;

import co.edu.uniquindio.empresaTransporte.model.Asociado;
import co.edu.uniquindio.empresaTransporte.model.Vehiculo;
import co.edu.uniquindio.empresaTransporte.model.VehiculoCarga;

public class Main {
    public static void main(String[] args) {

    }
    private static void ejercicio1 (){
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setCapacidadCarga(50);
        vehiculoCarga.setNumeroEjes(4);
        vehiculoCarga.setColor("rojo");
        vehiculoCarga.setPlaca("323-djf");
        vehiculoCarga.setMarca("mazda");
        vehiculoCarga.setModelo(2019);
        vehiculoCarga.setTamaño("grande");

        Asociado asociado = new Asociado();
        asociado.setNombre("hugo");
        asociado.setEmail("jssajsdja@gmail.com");
        asociado.setNumeroCelular("3007321386");
        asociado.setNumeroIdentificacion("1004917336");
        asociado.añadirVehiculos(vehiculoCarga);
    }

    private static void ejercicio2 (){

    }
}