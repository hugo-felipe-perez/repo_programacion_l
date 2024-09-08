package co.edu.uniquindio.programacion2trabajos.hotel.model;

public class Restaurante extends Servicio{

    public Restaurante (){

        super("Restaurante", 7000);
    }

    public Restaurante( double precio) {
        super("Restaurante", precio);
    }


    @Override
    public void ejecutarServicio() {
        System.out.println("Ejecutando Servicio de " + getNombre());
    }

    @Override
    public void consumir() {

    }
}
