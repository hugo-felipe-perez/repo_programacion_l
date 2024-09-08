package co.edu.uniquindio.programacion2trabajos.hotel.model;

public class Spa extends Servicio{

    public Spa() {
        super("Spa", 6000);
    }

    public Spa(double precio) {
        super("Spa", precio);
    }

    @Override
    public void ejecutarServicio() {
        System.out.println("Ejecutando servicio de " + getNombre());
    }

    @Override
    public void consumir() {

    }
}
