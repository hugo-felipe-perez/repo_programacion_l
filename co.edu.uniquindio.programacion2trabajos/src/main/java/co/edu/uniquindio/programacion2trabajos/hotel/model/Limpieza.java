package co.edu.uniquindio.programacion2trabajos.hotel.model;

public class Limpieza extends Servicio{

    public Limpieza (){

        super("Limpieza", 8000);
    }

    public Limpieza( double precio) {
        super("Limpieza", precio);
    }


    @Override
    public void ejecutarServicio() {
        System.out.println("Ejecutando servicio de " + getNombre());
    }

    @Override
    public void consumir() {

    }
}
